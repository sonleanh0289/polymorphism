public class CanBoCoHuu extends NhanVien{
    private static double luongCoBan;
    private double heSoLuong;
    
    public static void setLuongCoBan(double luongCoBan){
        CanBoCoHuu.luongCoBan = luongCoBan;
    }
    public static double getLuongCoBan(){
        return luongCoBan;
    }

    public void setHeSoLuong(double heSoLuong){
        this.heSoLuong = heSoLuong;
    }
    public double getHeSoLuong(){
        return heSoLuong;
    }
    @Override
    public double tinhLuong(){
        return luongCoBan*heSoLuong;
    }
    @Override
    public String inThongTin() {
        return "Nhan Vien: " + setTenNhanVien() +
            "\nLuong Co Ban: " + luongCoBan +
            "\nHe So Luong: " + heSoLuong +
            "\nTong Luong: " + tinhLuong();
    }
}

