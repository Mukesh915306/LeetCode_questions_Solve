import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter the Element");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
