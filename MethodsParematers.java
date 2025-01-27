public class MethodsParematers {

    public static void printLines(String text, int count)  //This method displays string text count. In this we have text and count parameters.
    {
        for (int i=0; i<count; i++)
            System.out.println(text);

    }

    public static void main(String[] args) {  //We call the printLines Method with the following arguments.
        printLines("Hi", 20); //These are method arguments
        printLines("Sai", 25); //These are method arguments.
    }


}
