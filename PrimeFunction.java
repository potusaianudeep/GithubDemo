import java.util.Scanner;

public class PrimeFunction {    //Created class called PrimeFunction

    public static boolean isPrime(int x){     //Created a method name called "isPrime".

        int i;
        for (i=2; i<=x/2; i++){
            if(x%i==0)                 //Business-Logic
                break;;
        }

        return i>x/2;    //Method with Return type

    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      System.out.println("Enter a number: ");

      if(isPrime(n)) //Calling the method
          System.out.println(n + " is Prime Number ");
      else
          System.out.println(n + " is not Prime Number ");
    }
}
