public class SINHVIEN {

    int age = 22;
    public static String address = "Hồ Chí Minh";

    public String getName() {
        String name = "Thiệu Nhật Hiếu";
        return name;
    }

    public static void main(String[] args) {
        SINHVIEN sinhvien = new SINHVIEN();
        System.out.println(sinhvien.getName() + ", tuổi: " + sinhvien.age + ", Địa chỉ: " + address + ", Trường: " + THONGTIN.school +
                ", Quốc gia: " + THONGTIN.Nation);
    }
}
