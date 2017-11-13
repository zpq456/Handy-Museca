package kr.ac.zipokun.handymuseca.Data;

/**
 * Created by Owner on 2017-07-15.
 */

public class MusicData implements DataInfo{
    private String[] uData = new String[5];

    public MusicData(){}
    public MusicData(String Mid, String name, String released,
                          String produce, String getID){
        setData(0,Mid);
        setData(1,name);
        setData(2,released);
        setData(3,produce);
        setData(4,getID);
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
