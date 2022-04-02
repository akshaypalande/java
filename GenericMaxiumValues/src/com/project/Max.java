package com.project;

        import java.lang.String;
        import org.junit.Test;

public class Max {
    public static <E extends Comparable<E>> E maximum(E a, E b, E c) {
        E max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }

    @Test
    public static void main(String[] args) {
        System.out.println("Maximum number is " + maximum(32, 26, 11));
        System.out.println("Maximum number is " + maximum(13, 47, 29));
        System.out.println("Maximum number is " + maximum(21, 48, 58));
        System.out.println("*********************************");
        System.out.println("Maximum float number is " + maximum(3.2, 2.6, 1.1));
        System.out.println("Maximum float number is " + maximum(1.3, 4.7, 2.9));
        System.out.println("Maximum float number is " + maximum(2.1, 4.8, 5.8));
        System.out.println("*********************************");
        System.out.println("Maximum float number is " + maximum("Peach", "Apple", "Banana"));
        System.out.println("Maximum float number is " + maximum("Apple", "Peach", "Banana"));
        System.out.println("Maximum float number is " + maximum("Apple", "Banana", "Peach"));
    }
}