public class TruongPhong extends CanBoCoHuu{
    private double phuCap;

    public void getPhuCap(double phuCap){
        this.phuCap = phuCap;
    }
    public double setPhuCap(){
        return phuCap;
    }
    @Override
    public double tinhLuong(){
        return getHeSoLuong()*getLuongCoBan() + phuCap;
    }
    @Override
    public String inThongTin() {
        return "Nhan Vien: " + setTenNhanVien() +
            "\nPhu Cap: "   +  phuCap +
            "\nTong Luong: " + tinhLuong();
    }
}
