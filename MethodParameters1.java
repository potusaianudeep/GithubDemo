package MethodsConstructers;

//Some of numbers passed in the given array using methods

public class MethodParameters1 {

    public static void printArraySum(int[] data)
    {
        int sum = 0;
        for (int i = 0; i<data.length; i++)
            sum = sum + data[i];
            System.out.println(sum);


    }

    public static void main(String[] args) {

        int [] data = {12, 13, 14, 15, 16,27};
        printArraySum(data);
    }
}
