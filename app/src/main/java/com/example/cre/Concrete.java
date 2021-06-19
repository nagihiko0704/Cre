package com.example.cre;

public class Concrete
{
    private String concreteType;
    private int rube;


    public Concrete()
    {
        this.concreteType = "25 - 27 - 180";
        this.rube = 30;
    }

    public Concrete(String concreteType, int rube)
    {
        this.concreteType = concreteType;
        this.rube = rube;
    }

    public String getConcreteType() {
        return concreteType;
    }

    public int getRube() {
        return rube;
    }
}
