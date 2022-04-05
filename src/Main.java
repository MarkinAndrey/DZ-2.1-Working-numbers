import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        StreamMain.run(intList);

        System.out.println();

        ArrayList<Integer> result = new ArrayList<>(intList);
        result.removeIf(x -> x <= 0);
        result.removeIf(x -> x % 2 != 0);
        Collections.sort(result);
        System.out.println(result);
    }
}