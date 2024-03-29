Create a class Armstrong with a main method to check the given number is an armstrong number or not.

[Hint: An armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
For example
9 = 91 = 9
371 = 33 + 73 + 13 = 27 + 343 +1 = 371
8208 = 84 + 24+04 + 84 = 4096 + 16 + 0 + 4096 = 8028
If the input is given as command line arguments to the main() as [153] then the program should print the output as:
Cmd Args : 153
The given number 153 is an armstrong number
If the input is given as command line arguments to the main() as [25] then the program should print the output as:
Cmd Args : 25
The given number 25 is not an armstrong number


Note: Please don't change the package name.

package q10891;
public class Armstrong
	import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        return result == number;
    }
}


