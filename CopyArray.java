package Arrays;

//Copy data from one array to another array

public class CopyArray {

    public static void main(String[] args) {

        int [] a = {12,13,14};
        int [] b = new int[a.length];

        for (int i=0; i<a.length; i++)
        {
            b[i] = a[i];
        }

        for (int temp:b)
        {
            System.out.println(temp);
        }


    }
}
