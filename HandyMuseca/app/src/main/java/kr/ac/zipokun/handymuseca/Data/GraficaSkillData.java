package kr.ac.zipokun.handymuseca.Data;

/**
 * Created by Owner on 2017-11-25.
 */

public class GraficaSkillData implements DataInfo{
    public static final String TABLE_GRAFICALIST = "grafica_skill_list";

    private String[] uData = new String[4];

    public GraficaSkillData(){}
    public GraficaSkillData(String id, String name, String effect){
        setData(0,id);
        setData(1,name);
        setData(2,effect);
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
