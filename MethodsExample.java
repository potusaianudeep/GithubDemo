package MethodsConstructers;

//Print WiFi 10 times using methods..

public class MethodsExample {

    public static void printWiFi10Times()
    {
        for (int i = 0; i < 10; i++)
            printWiFi();
    }

    public static void main(String[] args)
    {
        printWiFi10Times();
    }

    public static void printWiFi()
    {
        System.out.print("Wi-");
        System.out.println("Fi");
    }
}
