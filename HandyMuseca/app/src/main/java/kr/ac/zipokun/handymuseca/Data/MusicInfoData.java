package kr.ac.zipokun.handymuseca.Data;

/**
 * Created by Owner on 2017-07-15.
 */

public class MusicInfoData implements DataInfo{
    public static final String TABLE_GRAFICALIST = "music_info_list";

    private String[] uData = new String[4];

    public MusicInfoData(){}
    public MusicInfoData(String Mid, String name, String released,
                         String produce){
        setData(0,Mid);
        setData(1,name);
        setData(2,released);
        setData(3,produce);
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
