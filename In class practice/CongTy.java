    import java.util.ArrayList;
    import java.util.List;

    public class CongTy{
            
        private String tenCongTy;
        private int soNhanVien;
        private static int SO_NV_MAX = 100;
        private static double loiNhuan;
        private List<NhanVien> danhsachNV;
        
            public CongTy(String tenCongTy, int soNhanVien, double loiNhuan) {
                this.tenCongTy = tenCongTy;
                this.soNhanVien = soNhanVien;
                this.danhsachNV = new ArrayList<>();
            }
            public List<NhanVien> getDanhSachNV() {
                return danhsachNV;
            }            
        
            public String getTenCongTy(){
                return tenCongTy;
            }
            public void setTenCongTy(String tenCongTy){
                this.tenCongTy = tenCongTy;
            }
        
            public int getSoNhanVien(){
                return soNhanVien;
            }
            public void setSoNhanVien(int soNhanVien){
                if(soNhanVien <= SO_NV_MAX){
                    this.soNhanVien = soNhanVien;
                } else{
                    System.out.println("So nhan vien vuot qua gioi han: " + SO_NV_MAX);
                }
            }
        
            public static int getSoNVMAX(){
                return SO_NV_MAX;
            }
            public static void setSoNVMAX(int soNvMax) {
                SO_NV_MAX = soNvMax;
            }            
        
            public static double getLoiNhuan(){
                return loiNhuan;
            }
            public void setLoiNhuan(double loiNhuan){
                CongTy.loiNhuan = loiNhuan;
            }
            public String inThongTin() {
                String result = "Cong Ty: " + tenCongTy +
                                "\nSo Nhan Vien: " + soNhanVien +
                                "\nSo Nhan Vien Max: " + SO_NV_MAX +
                                "\nLoi Nhuan: " + loiNhuan +
                                "\nDanh Sach Nhan Vien:\n";
            
                for (NhanVien nv : danhsachNV) {
                    result += nv.inThongTin() + "\n-------------------\n";
                }
            
                return result;
            }
            
            public boolean themNV(NhanVien nv){
                if(soNhanVien < SO_NV_MAX){
                    danhsachNV.add(nv);
                    soNhanVien++;
                    return true;
                }else{
                    System.out.println("Khong the them nhan vien ");
                    return false;
                }
            }
            public double tinhTongLuong(){
                double TongLuong = 0.0;
                for(NhanVien nv : danhsachNV){
                    TongLuong += nv.tinhLuong();
                }
                return  TongLuong;
            }
            public class Main {
                public static void main(String[] args) {
                    CongTy congTy = new CongTy("Cong Ty ABC", 0, 1000000);
            
                    NhanVien nv1 = new CanBoCoHuu();
                    NhanVien nv2 = new CanBoHopDong();
            
                    congTy.themNV(nv1);
                    congTy.themNV(nv2);
            
                    System.out.println(congTy.inThongTin());
                    System.out.println("Tong luong nhan vien: " + congTy.tinhTongLuong());
                }
            }
            
            
            
        
}

