package com.example.profile_ltdtdd;

public class  CauThu {
    private String Ten;
    private String MoTa;
    private int Hinh;
    private  String Thongtin;

    public CauThu(String ten, String moTa, int hinh,String thongtin) {
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
        Thongtin = thongtin;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public void setThongtin(String thongtin) {Thongtin = thongtin ;}

    public String getTen() {
        return Ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public int getHinh() {
        return Hinh;
    }
    public String getThongtin(){return  Thongtin ;}
}
