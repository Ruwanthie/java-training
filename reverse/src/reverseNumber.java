import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int num, reversed = 0;
        System.out.println("Enter Number : ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        num = myObj.nextInt();  // Read user input

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }

}
