package com.example.dj.bubbleview;

/**
 * @author DragonJiang
 * @date 2015/10/13
 * @Description:
 */
public class PeopleDistributionInfo {

    /**
     * 地区
     */
    private String area;
    /**
     * 分布在该地区的人数
     */
    private int people;

    public PeopleDistributionInfo(String area, int people) {
        this.area = area;
        this.people = people;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }
}
