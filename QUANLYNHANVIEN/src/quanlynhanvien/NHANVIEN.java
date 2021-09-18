/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlynhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public abstract class NHANVIEN implements IDOIBONG {
    protected String tenNhanVien;
    protected String quocTich;
    protected String gioiTinh;
    protected Date ngaySinh;
    protected Date ngayVaoLam;
    public NHANVIEN (){
    }

    public NHANVIEN(String tenNhanVien, String quocTich, String gioiTinh, Date ngaySinh, Date ngayVaoLam) {
        this.tenNhanVien = tenNhanVien;
        this.quocTich = quocTich;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    public String convertDateString (Date d){
        return new SimpleDateFormat ("dd/MM/yyyy").format(d);
    }        
    public int thamNien() {
    try{
        Calendar c1= new GregorianCalendar();
        Calendar c2= new GregorianCalendar();
        Date ngayHT= Calendar.getInstance().getTime();
        c1.setTime(ngayHT);
        c2.setTime(ngayVaoLam);
        int thamNien=c1.get(Calendar.YEAR)-c2.get(Calendar.YEAR);
        return thamNien;
        } catch(Exception ex){}return 0;
    }
    public int phuCapThamNien (){
        return (int) (this.thamNien()*PHUCAPMOTNAM);
    }
    public void nhap (){
        try {
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap ten nhan vien:  ");
        tenNhanVien = sc.nextLine();
        System.out.println("nhap quoc tich: ");
        quocTich = sc.nextLine();
        System.out.println("nhap gioi tinh:  ");
        gioiTinh = sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh = df.parse (sc.nextLine());
            
        } catch (ParseException ex){
            Logger.getLogger (NHANVIEN.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        System.out.println("nhap ngay vao lam: ");
            ngayVaoLam = df.parse(sc.nextLine());
            
    } catch (ParseException ex){
        Logger.getLogger(NHANVIEN.class.getName()).log (Level.SEVERE, null, ex);
        
                }
    }
    public void xuat (){
        System.out.println("ten nhan vien: "+this.tenNhanVien);
        System.out.println("quoc tich: "+ this.quocTich);
        System.out.println("gioi tinh: "+ this.gioiTinh);
        System.out.println("ngay sinh: "+ convertDateString(ngaySinh));
        System.out.println("ngay vao lam: "+ convertDateString(ngayVaoLam));
        
    }
    @Override
    public abstract double tinhLuong();

}
