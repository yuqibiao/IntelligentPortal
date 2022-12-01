package com.yyyu.db.std.portal.app.bean;

import android.support.v4.app.Fragment;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2021-06-01
 */
public class LeftMenuBean {

    private Integer index;
    private String title;
    private  boolean isSelected;
    private Fragment flContent;

    public LeftMenuBean(Integer index, String title, boolean isSelected, Fragment flContent) {
        this.index = index;
        this.title = title;
        this.isSelected = isSelected;
        this.flContent = flContent;
    }

    public LeftMenuBean(Integer index, String title, boolean isSelected) {
        this.index = index;
        this.title = title;
        this.isSelected = isSelected;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public Fragment getFlContent() {
        return flContent;
    }

    public void setFlContent(Fragment flContent) {
        this.flContent = flContent;
    }
}
