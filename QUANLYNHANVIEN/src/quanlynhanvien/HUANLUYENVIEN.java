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
public class HUANLUYENVIEN extends NHANVIEN{
    private int soNamkinhnghiem;
    private double phuCap;
    private double heSoluong;
    public HUANLUYENVIEN(){};

    public HUANLUYENVIEN(int soNamkinhnghiem, double phuCap, double heSoluong, String tenNhanVien, String quocTich, String gioiTinh, Date ngaySinh, Date ngayVaoLam) {
        super(tenNhanVien, quocTich, gioiTinh, ngaySinh, ngayVaoLam);
        this.soNamkinhnghiem = soNamkinhnghiem;
        this.phuCap = phuCap;
        this.heSoluong = heSoluong;
    }

    public int getSoNamkinhnghiem() {
        return soNamkinhnghiem;
    }

    public void setSoNamkinhnghiem(int soNamkinhnghiem) {
        this.soNamkinhnghiem = soNamkinhnghiem;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double getHeSoluong() {
        return heSoluong;
    }

    public void setHeSoluong(double heSoluong) {
        this.heSoluong = heSoluong;
    }


    
    @Override
    public void nhap (){
        super.nhap();
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap so nam kinh nghiem: ");
        soNamkinhnghiem = sc.nextInt();
        System.out.println("nhap phu cap: ");
        phuCap = sc.nextDouble();
        System.out.println("nhap he so luong: ");
        heSoluong = sc.nextDouble();
    }
    @Override
    public void xuat (){
        super.xuat();
        System.out.println("so nam kinh nghiem: "+soNamkinhnghiem);
        System.out.println("phu cap: "+this.phuCap);
        System.out.println("he so luong: "+this.heSoluong);
        
    }
    

    @Override
    public double tinhLuong() {
        return phuCapThamNien()+this.heSoluong*LUONGCB+this.phuCap;
    }
    
}