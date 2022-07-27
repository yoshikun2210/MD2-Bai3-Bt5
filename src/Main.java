import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size của mảng : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int min = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử " + (i +1)+ ": ");
            array[i] = scanner.nextInt();
            if (i == 0)min = array[i];
            min = Math.min(min,array[i]);
        }
        System.out.print("mảng : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Min : "+ min);
    }
}