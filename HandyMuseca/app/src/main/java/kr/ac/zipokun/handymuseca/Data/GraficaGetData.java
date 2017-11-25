package kr.ac.zipokun.handymuseca.Data;

/**
 * Created by Owner on 2017-11-25.
 */

public class GraficaGetData implements DataInfo {
    public static final String TABLE_GRAFICALIST = "grafica_get_list";

    private String[] uData = new String[7];

    public GraficaGetData(){}
    public GraficaGetData(String id, String getway, String music_easy,
                       String music_nomal, String music_hard,
                       String num_nomal, String num_hard){
        setData(0,id);
        setData(1,getway);
        setData(2,music_easy);
        setData(3,music_nomal);
        setData(4,music_hard);
        setData(5,num_nomal);
        setData(6,num_hard);
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
