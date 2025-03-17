package MethodsConstructers;

//Write a method that displays a string of text given number of times..

public class MethodParameters {

    public static void printLines (String text, int count)
    {
        for (int i = 0; i<count; i++)
            System.out.println(text);
    }

    public static void main(String[] args) {

        printLines("Hello", 25);
        printLines("India", 10);
    }
}
