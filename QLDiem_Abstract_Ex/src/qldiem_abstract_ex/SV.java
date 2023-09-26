
package qldiem_abstract_ex;

import java.util.Scanner;

public abstract class SV {
    private String hoTen;
    private float d1,d2,d3;
    
    // constructor
    public SV(){
        
    }
    public SV(String hoTen, float d1, float d2, float d3){
        this.hoTen=hoTen;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    // set-get
    void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    String getHoTen(){
        return this.hoTen;
    }
    void setDiem1(float d1){
        this.d1=d1;
    }
    float getDiem1(){
        return this.d1;
    }
    void setDiem2(float d2){
        this.d2=d2;
    }
    float getDiem2(){
        return this.d2;
    }
    void setDiem3(float d3){
        this.d3=d3;
    }
    float getDiem3(){
        return this.d3;
    }
    
    // tinh diem (abstract)
    abstract float TinhDiem();
    
    // nhap thong tin 
    void Nhap(){
        Scanner inp = new Scanner(System.in);
        System.out.println(" 1- Nhap thong tin SV: ");
        System.out.print("\n  + Ho ten: ");
        this.hoTen = inp.nextLine();
        System.out.print("\n  + Diem 1: ");
        this.d1 = inp.nextFloat();
        System.out.print("\n  + Diem 2: ");
        this.d2 = inp.nextFloat();
        System.out.print("\n  + Diem 3: ");
        this.d3 = inp.nextFloat();
    }
    // in thong tin
    void InThongTin(){
        System.out.println(" 2- In thong tin sinh vien: "
                + "\n + Ho va ten: "+this.hoTen
                + "\n + Diem tong ket: "+TinhDiem());
    }
    
}
