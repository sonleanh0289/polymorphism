public class QuanLy extends CanBoCoHuu{
    public double tinhHoaHong() {
        return 0.002 * CongTy.getLoiNhuan();
    }
    @Override
    public double tinhLuong() {
        return getLuongCoBan() * getHeSoLuong() + tinhHoaHong(); 
    }
    @Override
    public String inThongTin() {
        return "Nhan Vien: " + setTenNhanVien() +
            "\nHoa Hong: "   +  tinhHoaHong() +
            "\nTong Luong: " + tinhLuong();
    }
}
