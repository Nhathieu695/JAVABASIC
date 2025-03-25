import java.util.List;

public class ArrayList {
    public static List<Integer> soChan() {
        List<Integer> arr = new java.util.ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static List<String> addEmployees(String name, String age, String school, String address, String nation){
        List<String> infoEmployees = new java.util.ArrayList<>();
        infoEmployees.add(name);
        infoEmployees.add(age);
        infoEmployees.add(school);
        infoEmployees.add(address);
        infoEmployees.add(nation);
        return infoEmployees;
    }

    public static void main(String[] args) {
        System.out.println(soChan());

//        List<String> employees = new java.util.ArrayList<>();
//        employees.add("Thiệu Nhật Hiếu");
//        employees.add("22 tuổi");
//        employees.add("Hồ Chí Minh");
//        employees.add("HUFLIT");
//        employees.add("VIỆT NAM");

        List<String> employees = addEmployees(
                "Thiệu Nhật Hiếu",
                "22 tuổi",
                "Hồ Chí Minh",
                "HUFLIT",
                "VIỆT NAM");

        System.out.println(employees);
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println("=================");
        for (String info: employees){
            System.out.println(info);
        }
    }
}
