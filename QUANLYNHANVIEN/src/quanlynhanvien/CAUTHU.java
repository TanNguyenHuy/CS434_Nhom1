/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlynhanvien;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CAUTHU extends NHANVIEN {
    private String viTrithidau;
    private int soLuongtranthamgia;
    private int soBanthang;
    private double luongThoaThuan;
    public CAUTHU (){};

    public CAUTHU(String viTrithidau, int soLuongtranthamgia, int soBanthang, double luongThoaThuan, String tenNhanVien, String quocTich, String gioiTinh, Date ngaySinh, Date ngayVaoLam) {
        super(tenNhanVien, quocTich, gioiTinh, ngaySinh, ngayVaoLam);
        this.viTrithidau = viTrithidau;
        this.soLuongtranthamgia = soLuongtranthamgia;
        this.soBanthang = soBanthang;
        this.luongThoaThuan = luongThoaThuan;
    }

    public String getViTrithidau() {
        return viTrithidau;
    }

    public void setViTrithidau(String viTrithidau) {
        this.viTrithidau = viTrithidau;
    }

    public int getSoLuongtranthamgia() {
        return soLuongtranthamgia;
    }

    public void setSoLuongtranthamgia(int soLuongtranthamgia) {
        this.soLuongtranthamgia = soLuongtranthamgia;
    }

    public int getSoBanthang() {
        return soBanthang;
    }

    public void setSoBanthang(int soBanthang) {
        this.soBanthang = soBanthang;
    }

    public double getLuongThoaThuan() {
        return luongThoaThuan;
    }

    public void setLuongThoaThuan(double luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }
    @Override
    public void nhap (){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap vi tri thi dau: ");
        viTrithidau = sc.nextLine();
        System.out.println("nhap so luong tran tham gia: ");
        soLuongtranthamgia = sc.nextInt ();
        System.out.println("nhap so ban thang: ");
        soBanthang = sc.nextInt();
        System.out.println("nhap luong thoa thuan: ");
        luongThoaThuan = sc.nextDouble();
    }
    @Override
    public void xuat (){
        super.xuat();
        System.out.println("vi tri thi dau: "+this.viTrithidau);
        System.out.println("so luong tran tham gia: "+this.soLuongtranthamgia);
        System.out.println("so ban thang: "+this.soBanthang);
        System.out.println("luong thoa thuan "+this.luongThoaThuan);
    }
    
    

    @Override
    public double tinhLuong() {
        return (phuCapThamNien()+this.luongThoaThuan);
    }
    
}
