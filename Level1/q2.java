import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first and last elements are Equal.");
        } else if (first > last) {
            System.out.println("The first element is Greater than the last.");
        } else {
            System.out.println("The first element is Less than the last.");
        }
        
        scanner.close();
    }
}
