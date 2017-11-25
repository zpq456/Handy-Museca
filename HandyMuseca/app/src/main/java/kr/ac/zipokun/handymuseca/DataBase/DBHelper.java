package kr.ac.zipokun.handymuseca.DataBase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

import kr.ac.zipokun.handymuseca.Data.GraficaData;
import kr.ac.zipokun.handymuseca.Data.GraficaGetData;
import kr.ac.zipokun.handymuseca.Data.GraficaSkillData;
import kr.ac.zipokun.handymuseca.Data.MusicData;
import kr.ac.zipokun.handymuseca.Data.MusicInfoData;
import kr.ac.zipokun.handymuseca.Data.MusicNoteData;

/**
 * Created by Owner on 2017-10-06.
 */

public class DBHelper{

    public DBHelper(){
    }

    //GraficaList 테이블 가져오기
    public ArrayList<GraficaData> getGraficaListResult(SQLiteDatabase db) {
        ArrayList<GraficaData> Datas = new ArrayList<GraficaData>();
        Cursor cursor = db.rawQuery("SELECT * FROM " + GraficaData.TABLE_GRAFICALIST, null);
        while (cursor.moveToNext()) {//커서가 계속해서 이동하면서 데이터를 가져옴
            GraficaData data = new GraficaData(
                    cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3),
                    cursor.getString(4), cursor.getString(5),
                    cursor.getString(6), cursor.getString(7),
                    cursor.getString(8), cursor.getString(9),
                    cursor.getString(10), cursor.getString(11),
                    cursor.getString(12), cursor.getString(13),
                    cursor.getString(14)
            );
            if (data != null) {
                Datas.add(data);
                Log.d("DBHelper", data.getData(1));
            }
        }
        cursor.close();
        return Datas;
    }

    //Grafica_get_list 테이블 가져오기
    public ArrayList<GraficaGetData> getGraficaGetListResult(SQLiteDatabase db) {
        ArrayList<GraficaGetData> Datas = new ArrayList<GraficaGetData>();
        Cursor cursor = db.rawQuery("SELECT * FROM " + GraficaGetData.TABLE_GRAFICALIST, null);
        while (cursor.moveToNext()) {//커서가 계속해서 이동하면서 데이터를 가져옴
            GraficaGetData data = new GraficaGetData(
                    cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3),
                    cursor.getString(4), cursor.getString(5),
                    cursor.getString(6)
            );
            if (data != null) {
                Datas.add(data);
                Log.d("DBHelper", data.getData(1));
            }
        }
        cursor.close();
        return Datas;
    }

    //GraficaSkillList 테이블 가져오기
    public ArrayList<GraficaSkillData> getGraficaSkillListResult(SQLiteDatabase db) {
        ArrayList<GraficaSkillData> Datas = new ArrayList<GraficaSkillData>();
        Cursor cursor = db.rawQuery("SELECT * FROM " + GraficaData.TABLE_GRAFICALIST, null);
        while (cursor.moveToNext()) {//커서가 계속해서 이동하면서 데이터를 가져옴
            GraficaSkillData data = new GraficaSkillData(
                    cursor.getString(0), cursor.getString(1),
                    cursor.getString(2)
            );
            if (data != null) {
                Datas.add(data);
                Log.d("DBHelper", data.getData(1));
            }
        }
        cursor.close();
        return Datas;
    }

    //MusicList 테이블 가져오기
    public ArrayList<MusicData> getMusicListResult(SQLiteDatabase db) {
        ArrayList<MusicData> Datas = new ArrayList<MusicData>();
        Cursor cursor = db.rawQuery("SELECT * FROM " + GraficaData.TABLE_GRAFICALIST, null);
        while (cursor.moveToNext()) {//커서가 계속해서 이동하면서 데이터를 가져옴
            MusicData data = new MusicData(
                    cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3),
                    cursor.getString(4)
            );
            if (data != null) {
                Datas.add(data);
                Log.d("DBHelper", data.getData(1));
            }
        }
        cursor.close();
        return Datas;
    }

    //MusicInfoList 테이블 가져오기
    public ArrayList<MusicInfoData> getMusicInfoListResult(SQLiteDatabase db) {
        ArrayList<MusicInfoData> Datas = new ArrayList<MusicInfoData>();
        Cursor cursor = db.rawQuery("SELECT * FROM " + GraficaData.TABLE_GRAFICALIST, null);
        while (cursor.moveToNext()) {//커서가 계속해서 이동하면서 데이터를 가져옴
            MusicInfoData data = new MusicInfoData(
                    cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3)
            );
            if (data != null) {
                Datas.add(data);
                Log.d("DBHelper", data.getData(1));
            }
        }
        cursor.close();
        return Datas;
    }

    //MusicNoteList 테이블 가져오기
    public ArrayList<MusicNoteData> getMusicNoteListResult(SQLiteDatabase db) {
        ArrayList<MusicNoteData> Datas = new ArrayList<MusicNoteData>();
        Cursor cursor = db.rawQuery("SELECT * FROM " + GraficaData.TABLE_GRAFICALIST, null);
        while (cursor.moveToNext()) {//커서가 계속해서 이동하면서 데이터를 가져옴
            MusicNoteData data = new MusicNoteData(
                    cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3),
                    cursor.getString(4), cursor.getString(5),
                    cursor.getString(6), cursor.getString(7),
                    cursor.getString(8), cursor.getString(9),
                    cursor.getString(10), cursor.getString(11),
                    cursor.getString(12), cursor.getString(13)
            );
            if (data != null) {
                Datas.add(data);
                Log.d("DBHelper", data.getData(1));
            }
        }
        cursor.close();
        return Datas;
    }
}


