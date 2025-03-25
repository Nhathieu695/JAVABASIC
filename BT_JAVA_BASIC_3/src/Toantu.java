public class Toantu {

    static int number = 100;

    public static int checkN(int n){
        if (n == number){
            System.out.println("n = 100");
        } else if (n < number) {
            System.out.println("n bé hơn 100" );
        } else {
            System.out.println("n lớn hơn 100" );
        }
        return n;
    }
    public static void main(String[] args) {

        // toán tử
        int age = 10;
        String address = "Sài Gòn";
        String school = "HUFLIT";

        System.out.println((age > 5));
        System.out.println((age > 5) && (address.equals("Sài Gòn")));
        System.out.println((age < 5) && (address == "Sài Gòn"));
        System.out.println((age < 5) && (address == "Sài Gòn") || school == "HUFLIT");
        System.out.println((school == "UEH") || (age < 5) || (address == "Hà Nội"));

        // điều kiện if else

        checkN(99);
        checkN(100);
        checkN(110);

    }



}
