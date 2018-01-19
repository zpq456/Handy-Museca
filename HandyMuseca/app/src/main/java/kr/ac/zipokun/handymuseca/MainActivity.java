package kr.ac.zipokun.handymuseca;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import kr.ac.zipokun.handymuseca.Data.GraficaData;
import kr.ac.zipokun.handymuseca.DataBase.DBHelper;

public class MainActivity extends AppCompatActivity {

    public static final String PACKAGE_DIR = "/data/data/kr.ac.zipokun.handymuseca/";
    public static final String DATABASE_NAME = "test.db";
    public static final String COPY2DATABASE_NAME = "test2.db";
    public static final int DATABASE_VERSION = 1;
    public static final String UPDATE_DB_NAME = "handymuseca"+Integer.toString(DATABASE_VERSION)+".db";

    //Fragment
    private FragmentManager fragmentManager;
    private static final MainFragment mainFragment = new MainFragment();
    private static final MusicFragment musicFragment = new MusicFragment();
    private static final GraficaFragment graficaFragment = new GraficaFragment();

    //Datas
    private SQLiteDatabase db;
    private DBHelper dbHelper;
    public ArrayList<GraficaData> graficaDatas = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Make Fragments
        mainFragment.getInstance();
        musicFragment.getInstance();
        graficaFragment.getInstance();

        //Fragment Manager
        fragmentManager = getSupportFragmentManager();
        changeFragment("mainFragment");

        //Database
        initialize(MainActivity.this);
        db = openOrCreateDatabase(MainActivity.COPY2DATABASE_NAME, Context.MODE_PRIVATE, null);
        dbHelper = new DBHelper();
        graficaDatas = dbHelper.getGraficaListResult(db);

    }


    //프래그먼트 교체 코드
    public void changeFragment(String changefragment){
        switch (changefragment){
            case "mainFragment":
                fragmentManager.beginTransaction().replace(R.id.container, mainFragment).commit();
                break;
            case "musicFragment":
                fragmentManager.beginTransaction().replace(R.id.container, musicFragment).commit();
                break;
            case "graficaFragment":
                fragmentManager.beginTransaction().replace(R.id.container, graficaFragment).commit();
                break;
        }
    }

    //백키 관련 코드
    @Override
    public void onBackPressed() {
        if (mOnKeyBackPressedListener != null) { //백키 리스너 있을 경우
            mOnKeyBackPressedListener.onBack();
        } else {
            this.finishAffinity();
            super.onBackPressed();
        }
    }

    public interface onKeyBackPressedListener {
        public void onBack();
    }

    private onKeyBackPressedListener mOnKeyBackPressedListener;

    public void setOnKeyBackPressedListener(onKeyBackPressedListener listener) {
        mOnKeyBackPressedListener = listener;
    }

    //DB파일 핸드폰에 복사하여 저장
    public static void initialize(Context ctx) {
        File folder = new File(PACKAGE_DIR + "databases");
        Log.d("database", "" + folder.exists());
        if (folder.exists()) {
        } else {
            folder.mkdirs();
        }
        File outfile = new File(folder, COPY2DATABASE_NAME);
        if (outfile.length() <= 0) {
            AssetManager assetManager = ctx.getResources().getAssets();
            try {
                InputStream is = assetManager.open(DATABASE_NAME, AssetManager.ACCESS_BUFFER);
                long filesize = is.available();
                byte[] tempdata = new byte[(int) filesize];
                is.read(tempdata);
                is.close();
                outfile.createNewFile();
                FileOutputStream fo = new FileOutputStream(outfile);
                fo.write(tempdata);
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
