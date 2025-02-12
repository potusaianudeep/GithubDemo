package ConditionalStatementsLoops;

// Check the number is even or odd using the nested if.

public class NestedIf {

    public static void main(String[] args) {


        int n = -10;

        if (n>0)

        {
            if (n%2==0)

                System.out.println("Even Number");

            else
            {
                System.out.println("Odd Number");
            }

        }

        else
        {
            System.out.println("Please enter positive number.");
        }
    }
}
