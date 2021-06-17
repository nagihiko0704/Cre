package com.example.cre;

enum ReserveState { 취소, 대기, 확정 }

public class ReserveData
{
    private String date;
    private String info;
    private String place;
    private ReserveState reserveState;

    public ReserveData(String date, String info, String place ,ReserveState reserveState)
    {
        this.date = date;
        this.info = info;
        this.place = place;
        this.reserveState = reserveState;
    }

    public ReserveData(String date, String info, ReserveState reserveState)
    {
        this.date = date;
        this.info = info;
        this.place = "경기도 화성시 어쩌동 저쩌단지";
        this.reserveState = reserveState;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public String getPlace() { return place; }

    public void setPlace(String place)
    {
        this.place = place;
    }

    public ReserveState getReserveState()
    {
        return reserveState;
    }

    public void setReserveState(ReserveState reserveState)
    {
        this.reserveState = reserveState;
    }
}
