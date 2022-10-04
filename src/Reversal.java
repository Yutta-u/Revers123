import java.util.Arrays;
import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = arraySize - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
