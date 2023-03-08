class SinhVienPoly {
    String hoten;
    String nganh;

    public SinhVienPoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    public double getDiem() {
        return 0;
    }
}
class SinhVienIT extends SinhVienPoly {
    double java;
    double html;
    double css;

    public SinhVienIT(String hoten, String nganh, double java, double html, double css) {
        super(hoten, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }
    public double getDiem() {
        return (2 * java + html + css) / 4;
    }
}

class SinhVienBiz extends SinhVienPoly {
    double marketing;
    double sales;

    public SinhVienBiz(String hoten, String nganh, double marketing, double sales) {
        super(hoten, nganh);
        this.marketing = marketing;
        this.sales = sales;
    }
    public double getDiem() {
        return (2 * marketing + sales) / 3;
    }
}
public class Main {
    public static void main(String[] args) {
    }
}
