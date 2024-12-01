public class GiamDoc extends CanBoCoHuu{
    private double phuCap;
    public double tinhHoaHong(){
        return CongTy.getLoiNhuan()*0.05;
    }
    public void getPhuCap(double phuCap){
        this.phuCap = phuCap;
    }
    public double setPhuCap(){
        return phuCap;
    }
    @Override
    public double tinhLuong(){
        return getHeSoLuong()*getLuongCoBan() + phuCap + tinhHoaHong();
    }
    @Override
    public String inThongTin() {
        return "Nhan Vien: " + setTenNhanVien() +
            "\nPhu Cap: "   +  phuCap +
            "\nHoa Hong: "   +  tinhHoaHong() +
            "\nTong Luong: " + tinhLuong();
    }
}
