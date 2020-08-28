

/**
 * A class that contains a couple of useful mathematical
 * functions.
 * You may NOT modify method names, parameters, return types.
 * Add your code only where the comment asks you
 * to replace with your own code.
 */
public class MathUtil {
    public final static double EPS = 0.01;

    /**
     * Computes the distance between two points
     * defined by (x1, y1) and (x2, y2).
     * Use the distance formula from this source:
     * https://www.purplemath.com/modules/distform.htm
     *
     * @param x1 x coordinate of the first point
     * @param y1 y coordinate of the first point
     * @param x2 x coordinate of the second point
     * @param y2 y coordinate of the second point
     * @return distance between two points
     */
    public static double computeDistance(int x1, int y1, int x2, int y2) {
        double aSquared = Math.pow((x1 - x2), 2);
        double bSquared = Math.pow((y1 - y2), 2);

        return Math.sqrt((aSquared + bSquared));

    }

    /**
     * Computes a sum of terms 1.0/2^i, where i
     * goes from 1 to n (inclusive).
     *
     * @param n the number of terms to include in the summation
     * @return the sum of the geometric series
     */
    public static double computeGeomSeries(int n) {
        double total = 0.0;

        for (int i = 1; i <= n; i++) {
            total += (1 / Math.pow(2, i));
        }

        return total;
    }

    /**
     * Computes and returns n! = 1 * 2 * 3 * ... * n
     *
     * @param n
     * @return
     */

    public static int factorial(int n) {
        int total = 1;

        for (int i = 2; i <= n; i++) {
            total *= i;
        }

        return total;
    }

    /**
     * maximum. Takes as input two numbers and returns the one that is larger.
     *
     * @param i1
     * @return
     */
    public static double maximum(double i1, double i2) {
        // Can also use Math.max(i1, i2)

        if (i1 > i2) {
            return i1;
        } else {
            return i2;
        }
    }

    /**
     * Takes as input two numbers and returns the one that is smaller
     *
     * @param i1
     * @return
     */

    public static double minimum(double i1, double i2) {
        // Can also use Math.min(i1, i2)

        if (i1 < i2) {
            return i1;
        } else {
            return i2;
        }
    }

    /**
     * power. Raise the number in base to the power in exponent. For example, power(2,5) = 32.
     *
     * @param base
     * @param exponent
     * @return
     */
    public static int power(int base, int exponent) {
        // Can also use (int) Math.pow(base, exponent)

        if (exponent < 0) {
            System.out.println("Negative exponent - error");
            return 0;
        }

        int total = 1;

        for (int i = 0; i < exponent; i++) {
            total *= base;
        }

        return total;
    }


    /**
     * Do not change this code. This is used to check
     * if your answer is correct
     *
     * @param methodName  the name of the method being tested
     * @param studentRes  result computed by your program
     * @param expectedRes result that was expected
     * @return true if student's result matches expected result,
     * false otherwise.
     */
    public static boolean compareResults(String methodName,
                                         double studentRes,
                                         double expectedRes) {
        if (Math.abs(studentRes - expectedRes) > EPS) {
            System.out.println("Sorry, incorrect result in " + methodName);
            System.out.println("Expected: " + expectedRes);
            System.out.println("Your code returned: " + studentRes);
            System.out.println("----------------------------------");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("------Checking class MathUtil------- ");
        // Check if computeDistance is correct
        double res1 = MathUtil.computeDistance(10, 10, 20, 30);
        double res2 = MathUtil.computeDistance(-100, 0, 10, -5);

        double expectedRes1 = 22.36;
        double expectedRes2 = 110.113;

        int expectedFactRes = 120;
        int factRes = MathUtil.factorial(5);

        boolean testDist1 = MathUtil.compareResults("computeDistance", res1, expectedRes1);
        boolean testDist2 = MathUtil.compareResults("computeDistance", res2, expectedRes2);
        if (testDist1 && testDist2)
            System.out.println("computeDistance seems to work correctly.");
        System.out.println();

        // Check if computeGeomSeries is correct
        res1 = MathUtil.computeGeomSeries(3);
        res2 = MathUtil.computeGeomSeries(6);
        expectedRes1 = 0.875;
        expectedRes2 = 0.984375;


        boolean testGeomSeries1 = MathUtil.compareResults("factorial", res1, expectedRes1);
        boolean testGeomSeries2 = MathUtil.compareResults("computeGeomSeries", res2, expectedRes2);
        if (testGeomSeries1 && testGeomSeries2)
            System.out.println("computeGeomSeries seems to work correctly.");


        boolean testFac = MathUtil.compareResults("factorial", expectedFactRes, factRes);
        if (testFac)
            System.out.println("factorial seems to work correctly.");

        double maxRes = MathUtil.maximum(3.4, 4.5);

        boolean testMax = MathUtil.compareResults("maximum", maxRes, 4.5);
        if (testMax)
            System.out.println("Maximum seems to work correctly.");

        double minRes = MathUtil.minimum(3.4, 4.5);

        boolean testMin = MathUtil.compareResults("minimum", minRes, 3.4);
        if (testMin)
            System.out.println("Maximum seems to work correctly.");

        double powerResult = MathUtil.power(3, 4);

        boolean testPower = MathUtil.compareResults("power", powerResult, 81);
        if (testPower)
            System.out.println("Maximum seems to work correctly.");

    }

}



