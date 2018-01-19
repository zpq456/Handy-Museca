package kr.ac.zipokun.handymuseca.Item;

import android.graphics.drawable.Drawable;

/**
 * Created by Owner on 2018-01-19.
 */

public class GraficaListItem {
    private Drawable iconGrafica;
    private Drawable iconUpgrade;
    private Drawable iconCv;
    private String nameOfGrafica;

    public Drawable getIconGrafica() {
        return iconGrafica;
    }

    public void setIconGrafica(Drawable iconGrafica) {
        this.iconGrafica = iconGrafica;
    }

    public Drawable getIconUpgrade() {
        return iconUpgrade;
    }

    public void setIconUpgrade(Drawable iconUpgrade) {
        this.iconUpgrade = iconUpgrade;
    }

    public Drawable getIconCv() {
        return iconCv;
    }

    public void setIconCv(Drawable iconCv) {
        this.iconCv = iconCv;
    }

    public String getNameOfGrafica() {
        return nameOfGrafica;
    }

    public void setNameOfGrafica(String nameOfGrafica) {
        this.nameOfGrafica = nameOfGrafica;
    }
}
