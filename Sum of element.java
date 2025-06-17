import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 3, 8 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of element " + sum);

    }
}
