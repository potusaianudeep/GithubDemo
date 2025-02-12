package ConditionalStatementsLoops;

// If the temperature is less than 0, display "It's cold outside". Otherwise, display "It's warm outside".

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        String cold = "It's cold outside";
        String warm = "It's warm outside";

        if(temperature<0)
        {
            System.out.println(cold);
        }
        else
        {
            System.out.println(warm);
        }


    }
}
