package com.example.tuan5;

public class Things {
    private String Ten;
    private String Decription;
    private String Count;
    private int Hinh;

    public Things(String ten, String decription, String count, int hinh) {
        Ten = ten;
        Decription = decription;
        Count = count;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDecription() {
        return Decription;
    }

    public void setDecription(String decription) {
        Decription = decription;
    }

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
