package person;

public class Person {
    public String name;
    public int tuoi;
    protected String address;
    protected String mssv;
    protected String phone;
    public String gender;

    public Person(String gender, String phone, String mssv, String address, int tuoi, String name) {
        this.gender = gender;
        this.phone = phone;
        this.mssv = mssv;
        this.address = address;
        this.tuoi = tuoi;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    protected String getPhone() {
        return phone;
    }

    public int getTuoi() {
        return tuoi;
    }

    protected String getAddress() {
        return address;
    }

    protected String getMssv() {
        return mssv;
    }
}
