package misc.test;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 57;
        ages[1] = 50;
        ages[2] = 10;
        ages[3] = 10;
        System.out.println(Arrays.toString(ages));  // toString() automatically called

        // iterate using the for-each loop
        for (int age : ages) {
            System.out.println("The age is: " + age);
        }

        System.out.println();

        double[] sizes = { 1.0, 3.2, 8.5, 9.5, 4.4 };
        System.out.println(Arrays.toString(sizes));
        System.out.println();

        boolean[] statuses = new boolean[4];
        System.out.println(Arrays.toString(statuses));
        System.out.println();

        String[] names = { "jay", "martina", "logan", "amilia" };
        System.out.println(Arrays.toString(names));

        // iterate using old-style index loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("The name is: " + names[i]);
        }
    }
}