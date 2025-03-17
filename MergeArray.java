package Arrays;

//Merging two arrays into one..

public class MergeArray {

    public static void main(String[] args) {

        int [] a = {10,11,12};
        int [] b = {14,15,16};
        int [] c = new int[a.length + b.length];
        int indx = 0;

        for (int i =0; i<a.length; i++)
        {
            c[indx] = a[i];
            indx++;
        }
        for (int j = 0; j<b.length; j++)
        {
            c[indx] = b[j];
            indx++;
        }

        for (int temp :c)
        {
            System.out.println(temp);
        }

    }
}
