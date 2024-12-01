public class CanBoQuanLy extends CanBoCoHuu{
    public double tinhHoaHong(){
        return CongTy.getLoiNhuan()*0.002;
    }
    @Override
    public double tinhLuong(){
        return getHeSoLuong()*getLuongCoBan() + tinhHoaHong();
    }
    @Override
    public String inThongTin() {
        return "Nhan Vien: " + setTenNhanVien() +
            "\nHoa Hong: "   +  tinhHoaHong() + 
            "\nTong Luong: " + tinhLuong();
    }
}
