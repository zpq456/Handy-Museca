package kr.ac.zipokun.handymuseca.DataBase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

import kr.ac.zipokun.handymuseca.Data.GraficaData;

/**
 * Created by Owner on 2017-10-06.
 */

public class DBHelper {
    // DBHelper 생성자로 관리할 DB 이름과 버전 정보를 받음
    public DBHelper(){}


    //GraficaList 테이블 가져오기
    public ArrayList<GraficaData> getGraficaListResult(SQLiteDatabase db){
        ArrayList<GraficaData> graficaDatas = new ArrayList<GraficaData>();
        Cursor cursor = db.rawQuery("SELECT * FROM " + GraficaData.TABLE_GRAFICALIST, null);
        while (cursor.moveToNext()) {//커서가 계속해서 이동하면서 데이터를 가져옴
            GraficaData data = new GraficaData(
                    cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3),
                    cursor.getString(4), cursor.getString(5),
                    cursor.getString(6), cursor.getString(7),
                    cursor.getString(8), cursor.getString(9),
                    cursor.getString(10), cursor.getString(11),
                    cursor.getString(12),cursor.getString(13),
                    cursor.getString(14)
            );
            if(data!=null) {
                graficaDatas.add(data);
                Log.d("DBHelper",data.getData(1));
            }
        }
        cursor.close();
        return graficaDatas;
    }


}


