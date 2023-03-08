class Chunhat {
    private double dai;
    private double rong;

    public Chunhat(double dai, double rong) { 
        this.dai = dai;
        this.rong = rong;
    }

    public double getdai() {
        return dai;
    }

    public double getrong() {
        return rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }        

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("dai: " + dai);
        System.out.println("rong: " + rong);
        System.out.println("ChuVi: " + getChuVi());
        System.out.println("DienTich: " + getDienTich());
    }
}

class Vuong extends Chunhat { 
    public Vuong(double canh) {
        super(canh, canh);
    }

    public void xuat() {
        System.out.println("canh: " + getdai());
        System.out.println("ChuVi: " + getChuVi());
        System.out.println("DienTich: " + getDienTich());
    }        
}

public class Chunhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chieu dai hinh chu nhat 1:");
        double dai1 = input.nextDouble();
        System.out.println("Nhap chieu rong hinh chu nhat 1:");
        double rong1 = input.nextDouble();
        Chunhat cn1 = new Chunhat(dai1, rong1);

        System.out.println("Nhap chieu dai hinh chu nhat 2:");
        double dai2 = input.nextDouble();
        System.out.println("Nhap chieu rong hinh chu nhat 2:");
        double rong2 = input.nextDouble();
        Chunhat cn2 = new Chunhat(dai2, rong2);

        System.out.println("Nhap canh hinh vuong:");
        double canh = input.nextDouble();
        Vuong v = new Vuong(canh);

        System.out.println("Hinh chu nhat 1:");
        cn1.xuat();
        System.out.println();

        System.out.println("Hinh chu nhat 2:");
        cn2.xuat();
        System.out.println();

        System.out.println("Hinh vuong:");
        v.xuat();
    }
}


