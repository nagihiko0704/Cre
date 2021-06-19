package com.example.cre;


import java.util.ArrayList;

public class PlacingData
{
    private String field;
    private ArrayList<Concrete> concreteArrayList;

    public PlacingData(String field, ArrayList<Concrete> concreteArrayList)
    {
        this.field = field;
        this.concreteArrayList = concreteArrayList;
    }

    public PlacingData(String field)
    {
        this.field = field;
        this.concreteArrayList = new ArrayList<Concrete>();
        this.concreteArrayList.add(new Concrete("21 - 24 - 30", 180));
        this.concreteArrayList.add(new Concrete());
    }

    public PlacingData()
    {
        this.field = "화성동탄(2)택지개발지구";

        this.concreteArrayList = new ArrayList<Concrete>();
        this.concreteArrayList.add(new Concrete("21 - 24 - 30", 180));
        this.concreteArrayList.add(new Concrete());
    }

    public String getField() {
        return field;
    }

    public ArrayList<Concrete> getConcreteArrayList() {
        return concreteArrayList;
    }
}
