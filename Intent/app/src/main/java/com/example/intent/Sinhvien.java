package com.example.intent;

public class Sinhvien {
    private String Ten;
    private String Tuoi;
    private String Lop;
    private String SDT;

    public Sinhvien(String ten, String tuoi, String lop, String SDT) {
        Ten = ten;
        Tuoi = tuoi;
        Lop = lop;
        this.SDT = SDT;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String tuoi) {
        Tuoi = tuoi;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
