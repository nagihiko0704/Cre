package com.example.cre;

import java.util.ArrayList;

public class AppData
{
    private static AppData instance;

    static String fieldID, fieldPassword, fieldEmail;
    static int fieldTel, fieldPhone;

    static String managerID, managerPassword, managerEmail;
    static int managerTel, managerPhone;

    static ArrayList<PlacingData> placingDataList = new ArrayList<>();
    static ArrayList<ReserveData> reserveDataList = new ArrayList<>();


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

    public static String getFieldID() {
        return fieldID;
    }

    public static void setFieldID(String fieldID) {
        AppData.fieldID = fieldID;
    }

    public static String getFieldPassword() {
        return fieldPassword;
    }

    public static void setFieldPassword(String fieldPassword) {
        AppData.fieldPassword = fieldPassword;
    }

    public static String getFieldEmail() {
        return fieldEmail;
    }

    public static void setFieldEmail(String fieldEmail) {
        AppData.fieldEmail = fieldEmail;
    }

    public static int getFieldTel() {
        return fieldTel;
    }

    public static void setFieldTel(int fieldTel) {
        AppData.fieldTel = fieldTel;
    }

    public static int getFieldPhone() {
        return fieldPhone;
    }

    public static void setFieldPhone(int fieldPhone) {
        AppData.fieldPhone = fieldPhone;
    }

    public static String getManagerID() {
        return managerID;
    }

    public static void setManagerID(String managerID) {
        AppData.managerID = managerID;
    }

    public static String getManagerPassword() {
        return managerPassword;
    }

    public static void setManagerPassword(String managerPassword) {
        AppData.managerPassword = managerPassword;
    }

    public static String getManagerEmail() {
        return managerEmail;
    }

    public static void setManagerEmail(String managerEmail) {
        AppData.managerEmail = managerEmail;
    }

    public static int getManagerTel() {
        return managerTel;
    }

    public static void setManagerTel(int managerTel) {
        AppData.managerTel = managerTel;
    }

    public static int getManagerPhone() {
        return managerPhone;
    }

    public static void setManagerPhone(int managerPhone) {
        AppData.managerPhone = managerPhone;
    }

    public static ArrayList<PlacingData> getPlacingDataList() {
        return placingDataList;
    }

    public static void setPlacingDataList(ArrayList<PlacingData> placingDataList) {
        AppData.placingDataList = placingDataList;
    }

    public static ArrayList<ReserveData> getReserveDataList() {
        return reserveDataList;
    }

    public static void setReserveDataList(ArrayList<ReserveData> reserveDataList) {
        AppData.reserveDataList = reserveDataList;
    }
}
