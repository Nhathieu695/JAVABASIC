package OOP_1;

public class Nhanvien {
    public String name;
    public int tuoi;
    public String address;
    public String mssv;
    public String phone;

    public Nhanvien(String name, int tuoi, String address, String mssv, String phone) {
        this.name = name;
        this.tuoi = tuoi;
        this.address = address;
        this.mssv = mssv;
        this.phone = phone;
    }

    public void showInfo(){
        System.out.println("MSSV: "+ mssv);
        System.out.println("Name: "+ name);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Address: "+ address);
        System.out.println("Phone: "+ phone);

    }
}
