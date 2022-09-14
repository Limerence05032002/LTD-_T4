package com.example.listviewnc;

public class QuocGia {
    private String TenQG;
    private String Mota;
    private int hinh;

    public QuocGia(String tenQG, String mota, int hinh) {
        TenQG = tenQG;
        Mota = mota;
        this.hinh = hinh;
    }

    public String getTenQG() {
        return TenQG;
    }

    public void setTenQG(String tenQG) {
        TenQG = tenQG;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
