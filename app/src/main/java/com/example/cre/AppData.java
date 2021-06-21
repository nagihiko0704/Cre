package com.example.cre;

import java.util.ArrayList;

public class AppData
{
    private static AppData instance;

    private String fieldID, fieldPassword, fieldEmail;
    private int fieldTel, fieldPhone;

    private String managerID, managerPassword, managerEmail;
    private int managerTel, managerPhone;

    private ArrayList<PlacingData> placingDataList = new ArrayList<>();
    private ArrayList<ReserveData> reserveDataList = new ArrayList<>();


    private AppData()
    {
        fieldID = "field";
        fieldPassword = "1234";
        fieldEmail = "field@mail.com";
        fieldTel = 12345678;
        fieldPhone = 12345678;

        managerID = "manager";
        managerPassword = "4321";
        managerEmail = "manager@mail.com";
        managerTel = 56781234;
        managerPhone = 56781234;
    }

    public static AppData getInstance()
    {
        if(instance == null)
        {
            return new AppData();
        }
        else return instance;
    }

    public String getFieldID() {
        return fieldID;
    }

    public void setFieldID(String fieldID) {
        this.fieldID = fieldID;
    }

    public String getFieldPassword() {
        return fieldPassword;
    }

    public void setFieldPassword(String fieldPassword) {
        this.fieldPassword = fieldPassword;
    }

    public String getFieldEmail() {
        return fieldEmail;
    }

    public void setFieldEmail(String fieldEmail) {
        this.fieldEmail = fieldEmail;
    }

    public int getFieldTel() {
        return fieldTel;
    }

    public void setFieldTel(int fieldTel) {
        this.fieldTel = fieldTel;
    }

    public int getFieldPhone() {
        return fieldPhone;
    }

    public void setFieldPhone(int fieldPhone) {
        this.fieldPhone = fieldPhone;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public int getManagerTel() {
        return managerTel;
    }

    public void setManagerTel(int managerTel) {
        this.managerTel = managerTel;
    }

    public int getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(int managerPhone) {
        this.managerPhone = managerPhone;
    }

    public ArrayList<PlacingData> getPlacingDataList() {
        return placingDataList;
    }

    public void setPlacingDataList(ArrayList<PlacingData> placingDataList) {
        this.placingDataList = placingDataList;
    }

    public ArrayList<ReserveData> getReserveDataList() {
        return reserveDataList;
    }

    public void setReserveDataList(ArrayList<ReserveData> reserveDataList) {
        this.reserveDataList = reserveDataList;
    }
}
