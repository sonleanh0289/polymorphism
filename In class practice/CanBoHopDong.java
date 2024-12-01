public class CanBoHopDong extends NhanVien{
    private double luongHopDong;

    public double getLuongHopDong(){
        return luongHopDong;
    }
    public void setLuongHopDong(double luongHopDong){
        this.luongHopDong = luongHopDong;
    }
    @Override
    public double tinhLuong(){
        return luongHopDong;
    }
    @Override
    public String inThongTin() {
        return "Nhan Vien: " + setTenNhanVien() +
            "\nLuong Co Ban: " + luongHopDong;
    }
}
