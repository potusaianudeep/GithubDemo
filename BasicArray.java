package Arrays;

public class BasicArray {

    public static void main(String[] args) {

        int [] intArray = new int[10];
        double [] doubleArray = new  double[10];
        intArray[2] = 10;
        intArray[6] = 19;
        intArray[9] = intArray[2] + intArray[6];
        System.out.println(intArray[9]);
    }
}
