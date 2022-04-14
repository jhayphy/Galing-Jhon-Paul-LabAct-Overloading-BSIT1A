public class App {
     /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }
    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */
    
     /**
     * 
     * Create method that returns the greater integer value
     */

    public static int greaterValue(int Num1, int Num2) {

        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }
    
    public static double greaterValue(double Num1, double Num2) {

        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }

    /**
     * 
     * Create method that returns the greater double value
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */

        System.out.println("Sum of two numbers 10 and 20: " + computeSum(10, 20));
        System.out.println("Sum of three numbers 10, 20 , 30: " + computeSum(10, 20, 30));
        System.out.println("================================================");
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 50 is " + greaterValue(45,50));

         /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 6.8 and 5.5 is " + greaterValue(6.8,5.5));

    }
}