import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        System.out.println("Please provide array size");
        int size = Number();
        System.out.println("Array size is: " + size);
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Please provide number for array in position " + i);
            numbers[i] = Number();
        }
        //PRINTING ARRAY FOR TESTS
//        for (int i=0; i < size; i++){
//            System.out.println("Your array is: ");
//            System.out.println("Value of " + i + " " + numbers[i]);
//        }

        int sum = 0;
        for (int i=0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        float average = ((float)sum) / size;
        System.out.println("Array average is: " + average);
        int max = numbers[0];
        for (int i=0; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max value in array is: " + max);

    }

    public static int Number() {
        /// ASSUMPTION WAS MADE FOR THE NUMBER TO BE TYPE INT (NOT LONG/SHORT ETC)
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextLine();
        }

        return scanner.nextInt();
    }
}
