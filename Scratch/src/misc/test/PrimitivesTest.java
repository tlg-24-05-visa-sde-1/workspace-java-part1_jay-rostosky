package misc.test;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 57;
        System.out.println("age is: " + age);

        long population = 8_000_000_000L;
        System.out.println("population is: " + population);

        double temp = 64.5;
        System.out.println("temp is: " + temp);

        boolean isCloudy = true;
        System.out.println("isCloudy is: " + isCloudy);

        char grade = 'A';
        System.out.println("grade is: " + grade);

        String size = "L";
        System.out.println("size is: " + size);

        System.out.println();

        int x = 3;
        System.out.println("x is: " + ++x);

        System.out.println();

        int a = 5;
        int b = a;
        a++;
        System.out.println("b is: " + b);
    }
}