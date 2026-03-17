import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long originalNum = sc.nextLong();
        long num = Math.abs(originalNum);
        String numStr = Long.toString(num);
        int digitCount = numStr.length();

        int[] digitsArray = new int[digitCount];
        long tempNum = num;
        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = (int)(tempNum % 10);
            tempNum /= 10;
        }

        int[] freq = new int[10];
        for (int digit : digitsArray) {
            freq[digit]++;
        }
        System.out.println("Frequency of each digit in " + originalNum + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }
        sc.close();
    }
}

