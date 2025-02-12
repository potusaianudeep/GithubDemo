package ConditionalStatementsLoops;

// Reverse of a given number.

public class ForLoop {

    public static void main(String[] args) {

        int n = 876;
        int rem = 0;
        int rev = 0;

        for (;n>0;)
        {
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }

        System.out.println(rev);
    }
}
