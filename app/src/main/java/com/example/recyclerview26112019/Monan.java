package com.example.recyclerview26112019;

public class Monan {
    private String ten;
    private String mota;
    private Integer hinhanh;
    private Integer gia;

    // alt + insert

    public Monan(String ten, String mota, Integer hinhanh, Integer gia) {
        this.ten = ten;
        this.mota = mota;
        this.hinhanh = hinhanh;
        this.gia = gia;
    }

    public Monan() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(Integer hinhanh) {
        this.hinhanh = hinhanh;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }
}
