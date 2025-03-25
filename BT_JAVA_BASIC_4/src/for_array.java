import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class for_array {

    public static List<Integer> soChan() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(soChan());

    }
    }
