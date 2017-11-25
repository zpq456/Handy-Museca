package kr.ac.zipokun.handymuseca.Data;

/**
 * Created by Owner on 2017-11-25.
 */

public class MusicNoteData implements DataInfo{
    public static final String TABLE_GRAFICALIST = "music_note_info_list";

    private String[] uData = new String[14];

    public MusicNoteData(){}
    public MusicNoteData(String id, String playlink, String all, String hit,
                          String spin, String storm, String kick,
                          String directional_spin, String directional_storm,
                         String charge, String charge_spin, String charge_storm,
                         String charge_directional_spin, String charge_directional_storm){
        setData(0,id);
        setData(1,playlink);
        setData(2,all);
        setData(3,hit);
        setData(4,spin);
        setData(5,storm);
        setData(6,kick);
        setData(7,directional_spin);
        setData(8,directional_storm);
        setData(9,charge);
        setData(10,charge_spin);
        setData(11,charge_storm);
        setData(12,charge_directional_spin);
        setData(13,charge_directional_storm);
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
