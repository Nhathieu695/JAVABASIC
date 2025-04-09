package OOP_1;

public class Thongtin {
    public static void main(String[] args) {
        Nhanvien nhanvien1 = new Nhanvien(
                "Thiệu Nhật Hiếu", 22, "HCM",  "SV01", "023402340"
        );

        Nhanvien nhanvien2 = new Nhanvien(
                "Nguyễn Tấn A", 22, "HANOI",  "SV02", "023423424"
        );

        nhanvien1.showInfo();
    }
}
