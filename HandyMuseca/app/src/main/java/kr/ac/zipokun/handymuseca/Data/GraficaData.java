package kr.ac.zipokun.handymuseca.Data;

import android.util.Log;

/**
 * Created by Owner on 2017-10-06.
 */

public class GraficaData implements DataInfo{
    //grafica_list Table itme
    public static final String TABLE_GRAFICALIST = "grafica_list";
    public static final String GRAFICALIST_ID = "_id";
    public static final String GRAFICALIST_NAME = "name";
    public static final String GRAFICALIST_CHARACTER = "character";
    public static final String GRAFICALIST_ILLUSIRATOR = "Illusirator";
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

    private String[] uData = new String[15];

    public GraficaData(){}
    public GraficaData(String Gid, String name, String character,
                     String lllusirator, String cv, String type,
                       String school, String skill, String power,
                       String uppower, String world, String getID,
                       String upgetID, String caption1, String caption2){
        setData(0,Gid);
        setData(1,name);
        setData(2,character);
        setData(3,lllusirator);
        setData(4,cv);
        setData(5,type);
        setData(6,school);
        setData(7,skill);
        setData(8,power);
        setData(9,uppower);
        setData(10,world);
        setData(11,getID);
        setData(12,upgetID);
        setData(13,caption1);
        setData(14,caption2);
    }


    @Override
    public String[] getData() {
        return uData;
    }
    @Override
    public String getData(int index) {
        return uData[index];
    }
    @Override
    public void setData(int index, String data) {
        uData[index] = data;
    }
    @Override
    public void setData(String[] uData) {
        this.uData = uData;
    }

    @Override
    public String getSendSQLString() {
        return null;
    }

    @Override
    public void showData() {
        Log.d("GraficaData_Gid",uData[0]);
        Log.d("GraficaData_name",uData[1]);
        Log.d("GraficaData_character",uData[2]);
        Log.d("GraficaData_Illusirator",uData[3]);
        Log.d("GraficaData_cv",uData[4]);
        Log.d("GraficaData_type",uData[5]);
        Log.d("GraficaData_school",uData[6]);
        Log.d("GraficaData_skill",uData[7]);
        Log.d("GraficaData_power",uData[8]);
        Log.d("GraficaData_uppower",uData[9]);
        Log.d("GraficaData_world",uData[10]);
        Log.d("GraficaData_getID",uData[11]);
        Log.d("GraficaData_upgetID",uData[12]);
        Log.d("GraficaData_caption1",uData[13]);
        Log.d("GraficaData_caption2",uData[14]);
    }
}
