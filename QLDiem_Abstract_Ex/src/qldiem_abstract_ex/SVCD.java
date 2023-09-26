
package qldiem_abstract_ex;


public class SVCD extends SV {
    // constructor
    public SVCD(){}
    public SVCD(String hoTen, float d1, float d2, float d3){
        super(hoTen, d1, d2, d3);
    }
    // nhap thong tin
    void Nhap(){
        super.Nhap(); // goi phuong thuc nhap cua lop cha
    }
    // tinh diem
    float TinhDiem(){
        return (getDiem1()+getDiem2()+getDiem3())/3;
    }
}
