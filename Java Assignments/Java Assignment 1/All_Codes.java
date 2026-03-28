//1. Primitive Data Types
public class PrimitiveTypes {
    public static void main(String[] args) {
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 5.5f;
        double d = 10.99;
        char c = 'A';
        boolean flag = true;

        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d);
        System.out.println(c + " " + flag);
    }
}


//2. Arithmetic Operations
import java.util.*;

public class ArithmeticOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();

        double sum = a + b;
        double div = a / b;

        int castResult = (int) div;

        System.out.println("Sum: " + sum);
        System.out.println("Division: " + div);
        System.out.println("After casting: " + castResult);
    }
}



//3. Type Conversion
public class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        double d = a; 

        double x = 9.8;
        int y = (int) x; 

        System.out.println(d);
        System.out.println(y);
    }
}



//4. ASCII Value
import java.util.*;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        int ascii = ch;
        System.out.println("ASCII: " + ascii);
    }
}



//5. Next & Previous Character
import java.util.*;

public class CharNextPrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println("Next: " + (char)(ch + 1));
        System.out.println("Previous: " + (char)(ch - 1));
    }
}





//6. Positive / Negative / Zero
import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) System.out.println("Positive");
        else if (n < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}




//7. Largest of Three Numbers
import java.util.*;

public class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + max);
    }
}





//8. Leap Year
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}






//9. Calculator (Switch)
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        switch(op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': 
                if (b != 0) System.out.println(a / b);
                else System.out.println("Divide by zero error");
                break;
            default: System.out.println("Invalid operator");
        }
    }
}








//10. Vowel or Consonant
import java.util.*;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}









//11. Print 1 to 50

for(int i=1; i<=50; i++)
    System.out.print(i + " ");


int i = 1;
while(i <= 50) {
    System.out.print(i + " ");
    i++;
}








//12. Sum of N Natural Numbers
import java.util.*;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }
}







//13. Multiplication Table
import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=10; i++)
            System.out.println(n + " x " + i + " = " + (n*i));
    }
}







//14. Reverse a Number
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        while(n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(rev);
    }
}








//15. Count Digits
import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }

        System.out.println(count);
    }
}









//16. Palindrome Number
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, rev = 0;

        while(n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if(temp == rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}







//17. Factorial
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long fact = 1;
        for(int i=1; i<=n; i++)
            fact *= i;

        System.out.println(fact);
    }
}








//18. Fibonacci Series
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        for(int i=1; i<=n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}






//19. Pattern
//*
//**
//***
//****
public class Pattern1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}





//20. Pattern
//1
//12
//123
//1234
public class Pattern2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}








//21. Pattern
//****
//***
//**
//*
public class Pattern3 {
    public static void main(String[] args) {
        for(int i = 4; i >= 1; i--) {
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}










//22. Prime Number
import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}










//23. Sum of Even & Odd (1 to N)
import java.util.*;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) evenSum += i;
            else oddSum += i;
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
}











//24. Largest Digit in Number
import java.util.*;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;

        while(n > 0) {
            int digit = n % 10;
            max = Math.max(max, digit);
            n /= 10;
        }

        System.out.println("Largest Digit: " + max);
    }
}








//26. Armstrong Number

//(Example: 153 → 1³ + 5³ + 3³ = 153)

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if(sum == temp) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}







//27. Marks → Total, Percentage, Grade
import java.util.*;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for(int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if(percentage >= 80) System.out.println("Grade A");
        else if(percentage >= 60) System.out.println("Grade B");
        else if(percentage >= 40) System.out.println("Grade C");
        else System.out.println("Fail");
    }
}








//28. Voting Eligibility
import java.util.*;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible");
    }
}








//29. Menu-Driven Program
import java.util.*;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add\n2. Subtract\n3. Exit");
            int choice = sc.nextInt();

            if(choice == 3) break;

            int a = sc.nextInt();
            int b = sc.nextInt();

            switch(choice) {
                case 1: System.out.println("Result: " + (a + b)); break;
                case 2: System.out.println("Result: " + (a - b)); break;
                default: System.out.println("Invalid");
            }
        }
    }
}









//30. Table Until User Stops
import java.util.*;

public class TableLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            int n = sc.nextInt();

            for(int i = 1; i <= 10; i++)
                System.out.println(n + " x " + i + " = " + (n*i));

            System.out.println("Continue? (y/n)");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');
    }
}







//34. Print all prime numbers (1 to 100)
public class Primes1to100 {
    public static void main(String[] args) {

        for(int n = 2; n <= 100; n++) {
            boolean isPrime = true;

            for(int i = 2; i * i <= n; i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) System.out.print(n + " ");
        }
    }
}








//35. GCD (Greatest Common Divisor)

//Using Euclidean Algorithm (most optimal)

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD: " + a);
    }
}







//36. LCM of Two Numbers

// Formula:
//LCM = (a × b) / GCD

import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a, y = b;

        // GCD
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("LCM: " + lcm);
    }
}







//37. Perfect Number

// Example: 6 → (1 + 2 + 3 = 6)

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0)
                sum += i;
        }

        if(sum == n) System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");
    }
}







//38. Number Guessing Game 
import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = (int)(Math.random() * 100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100:");

        do {
            guess = sc.nextInt();

            if(guess > target)
                System.out.println("Too high!");
            else if(guess < target)
                System.out.println("Too low!");
            else
                System.out.println("Correct! 🎉");

        } while(guess != target);
    }
}