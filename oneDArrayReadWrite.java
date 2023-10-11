import java.util.Scanner;

public class oneDArrayReadWrite {
    public static int[] arrayRead(int size) {
        // Initialize the array
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        // Reading values into the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void arrayWrite(int[] array, int size) {
        // Printing the values in the array
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        // Initialize the size of an array
        int size = scanner.nextInt();
        scanner.close();
        // Call the methods without arguments
        int[] array = arrayRead(size);
        arrayWrite(array, size);
    }
}