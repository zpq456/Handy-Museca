package kr.ac.zipokun.handymuseca.DataBase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Owner on 2017-10-06.
 */

public class DBHelper extends SQLiteOpenHelper{
    public static final String TABLE_COMMENTS = "comments";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_COMMENT = "comment";

    //grafica_list Table
    public static final String TABLE_GRAFICALIST = "grafica_list";
    public static final String GRAFICALIST_ID = "_id";
    public static final String GRAFICALIST_NAME = "name";
    public static final String GRAFICALIST_CHARACTER = "character";
    public static final String GRAFICALIST_ILLUSIRATOR = "illusirator";
    public static final String GRAFICALIST_CV = "cv";
    public static final String GRAFICALIST_TYPE = "type";
    public static final String GRAFICALIST_SCHOOL = "school";
    public static final String GRAFICALIST_SKILL = "skill";
    public static final String GRAFICALIST_POWER = "power";
    public static final String GRAFICALIST_UPPOWER = "uppower";
    public static final String GRAFICALIST_WORLD = "world";
    public static final String GRAFICALIST_GETID = "getID";
    public static final String GRAFICALIST_UPGETID = "upgetID";
    public static final String GRAFICALIST_CAPTION1 = "caption1";
    public static final String GRAFICALIST_CAPTION2 = "caption2";

    private static final String DATABASE_NAME = "handymuseca.db";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table"
            + TABLE_COMMENTS + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_COMMENT
            + " text not null);";

    public DBHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //앱스토어에서 업데이트하도록 안내 메세지를 표시
        sqLiteDatabase.execSQL("DROP TABEL IF EXISTS " + TABLE_COMMENTS);
        onCreate(sqLiteDatabase);
    }

    public void update(String item, int price) {
        SQLiteDatabase db = getWritableDatabase();
        // 입력한 항목과 일치하는 행의 가격 정보 수정
        db.execSQL("UPDATE MONEYBOOK SET price=" + price + " WHERE item='" + item + "';");
        db.close();
    }

    public void delete(String item) {
        SQLiteDatabase db = getWritableDatabase();
        // 입력한 항목과 일치하는 행 삭제
        db.execSQL("DELETE FROM MONEYBOOK WHERE item='" + item + "';");
        db.close();
    }

    public String getResult() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";

        // DB에 있는 데이터를 쉽게 처리하기 위해 Cursor를 사용하여 테이블에 있는 모든 데이터 출력
        Cursor cursor = db.rawQuery("SELECT * FROM MONEYBOOK", null);
        while (cursor.moveToNext()) {
            result += cursor.getString(0)
                    + " : "
                    + cursor.getString(1)
                    + " | "
                    + cursor.getInt(2)
                    + "원 "
                    + cursor.getString(3)
                    + "\n";
        }

        return result;
    }
}


