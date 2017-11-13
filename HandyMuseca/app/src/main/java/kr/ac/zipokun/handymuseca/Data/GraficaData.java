package kr.ac.zipokun.handymuseca.Data;

/**
 * Created by Owner on 2017-10-06.
 */

public class GraficaData implements DataInfo{

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
}
