public class FibonacciSeries {
    public static void main(String[] args) {
        /*
        t0 -0 , t1 -  1, t2 = t1 + t0
                        0 + 1 = 1, 2

        t1- 1, t2- 1 , 2, 3, 5, 8, 13, 21, 34, 55,
         */

        // recursion
        // for loop
        int secondLastTerm = 0;
        int lastTerm = 1;
        System.out.print(secondLastTerm + ", " + lastTerm + ", ");
        int nthTerm = 50;

        for (int i = 0; i < nthTerm - 2; i++) {
            int nextTerm = lastTerm + secondLastTerm;
            System.out.print(nextTerm + ", ");
            secondLastTerm = lastTerm;
            lastTerm = nextTerm;
        }

    }
}
