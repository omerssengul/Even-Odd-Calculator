import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac eleman gireceksiniz ?: ");
        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayiyi gir: ");
            arr[i] = input.nextInt();
        }
        int sumEven = 0;
        int countEven = 0;
        int sumOdd = 0;
        int countOdd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                sumEven += i;
                countEven++;
            }
            if (i % 2 != 0) {
                sumOdd += i;
                countOdd++;
            }

        }
        if (countEven > 0 ) {
            double averageEven = (double) sumEven/countEven;
            System.out.println("Cift sayilarin ortalamasi: " + averageEven);
        }
        if (countOdd > 0 ) {
            double averageOdd = (double) sumOdd/countOdd;
            System.out.println("Tek sayilarin ortalamasi: " + averageOdd);
        }

        input.close();
    }
}