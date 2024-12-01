public class NhanVien {
    private String tenNhanVien;

    public double tinhLuong() {
        return 0.0;
    }
    public String setTenNhanVien(){
        return tenNhanVien;
    }
    public void getTenNhanVien(String tenNhanVien){
        this.tenNhanVien = tenNhanVien;
    }
    public String inThongTin(){
        return " Ten Nhan Vien " + tenNhanVien; 
    }
}
