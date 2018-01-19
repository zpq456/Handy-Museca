package kr.ac.zipokun.handymuseca.Data;

/**
 * Created by Owner on 2017-07-15.
 */

public class MusicInfoData implements DataInfo{
    public static final String TABLE_GRAFICALIST = "music_info_list";

    private String[] uData = new String[5];

    public MusicInfoData(){}
    public MusicInfoData(String musicID, String name, String released,
                         String produce, String howtoget){
        setData(0,musicID);
        setData(1,name);
        setData(2,released);
        setData(3,produce);
        setData(4,howtoget);
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

    }


}
