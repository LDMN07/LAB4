public abstract class SinhVienPoly{
    private String hoten;
    private String nganh;
    
    public SinhVienPoly ( String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    public abstract double getDiem ();
    
    public String getHocluc (){
        double Diem = getDiem();
        
        if ( Diem < 5){
            return ("Yeu");
        }
        else if ( Diem < 6.5){
            return ("Trung Binh");
        }
        else if ( Diem < 7.5){
            return ("Kha");
        }
        else if ( Diem < 9){
            return ("Gioi");
        }
        else if( Diem >= 9){
            return ("Xuat Sac");
        }
    }
    
    public void xuat () {
        System.out.println("hoten:" + hoten);
        System.out.println("nganh:" + nganh);
        System.out.println("Diem:" + getDiem());
        System.out.println("Hocluc:" + getHocluc());
    }
}
class main(){
    public static void main(String[] args)
}  
