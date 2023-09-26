
package qldiem_abstract_ex;

import java.util.Scanner;

public class SVDH extends SV{
    // thuoc tinh
    private float d4;
    // constructor
    public SVDH(){}
    public SVDH(String hoTen, float d1, float d2, float d3, float d4){
        super(hoTen, d1, d2, d3);
        this.d4=d4;
    }
    // set-get
    void setDiem4(float d4){
        this.d4=d4;
    }
    float getDiem4(){
        return this.d4;
    }
    // nhap thong tin
    void Nhap(){
        super.Nhap();
        Scanner inp = new Scanner(System.in);
        System.out.print("\n  + Diem 4: ");
        this.d4 = inp.nextFloat();
    }
    // tinh diem
    float TinhDiem(){
        return (getDiem1()+getDiem2()+getDiem3()+getDiem4())/4;
    }
}
