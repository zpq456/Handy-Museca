package kr.ac.zipokun.handymuseca.Data;

/**
 * Created by Owner on 2017-11-25.
 */

public class MusicData implements DataInfo{
    public static final String TABLE_GRAFICALIST = "music_list";

    private String[] uData = new String[5];

    public MusicData(){}
    public MusicData(String id, String level, String level_num,
                          String info, String note){
        setData(0,id);
        setData(1,level);
        setData(2,level_num);
        setData(3,info);
        setData(4,note);
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
