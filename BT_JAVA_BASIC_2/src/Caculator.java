public class Caculator {

    public int tinhTong2So(int a, int b){
        int sum = a + b;
        return sum;
    }

    public double tinhTich2So(double a, double b){
        double multi = a * b;
        return multi;
    }

    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        System.out.println("Tổng 2 số nguyên là: " + caculator.tinhTong2So(3, 6));

        System.out.println("Tích 2 số thực là: " + caculator.tinhTich2So(3.2, 6.4));
    }
}
