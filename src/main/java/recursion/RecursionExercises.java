package recursion;

import java.util.HashMap;
import java.util.Map;

public class RecursionExercises {
    public static Map<Long, Long> result = new HashMap<>();

    public static void main(String[] args) {
        // print all numbers from n to 0
//        printRecursivelyNumbers(10);

        //compute sum of all numbers from n to 1
        System.out.println(sumRecursivelyNumbers(5));

        // fibonacci 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
//        System.out.println(fibonacci(100));

//        System.out.println(sumRecursivelyNumbersAsc(0, 5));
    }

    private static int sumRecursivelyNumbersAsc(int i, int n) {
        System.out.println("Adding " + i);
        if (i == n) {
            return n;
        }
        return i + sumRecursivelyNumbersAsc(i + 1, n);
    }

    private static long fibonacci(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (result.containsKey(n)) {
            return result.get(n);
        }
        System.out.println(n);
        long firstSubResult = fibonacci(n - 1);
        long secondSubResult = fibonacci(n - 2);
        long r = firstSubResult + secondSubResult;
        result.put(n, r);
        return r;
    }

    private static int sumRecursivelyNumbers(int n) {
        // exit condition
        System.out.println("Adding " + n);
        if (n == 1) {
            return 1;
        }

        return n + sumRecursivelyNumbers(n - 1);
        // n + sumRecursivelyNumbers(n-1)
        // n + (n-1) + sumRecursivelyNumbers(n-2)
        // n + (n-1) + (n-2) + sumRecursivelyNumbers(n-3)
        // ...
        // n + (n-1) + (n-2) + ... + 2 + sumRecursivelyNumbers(1)
        // n + (n-1) + (n-2) + ... + 2 + 1
    }


    private static void printRecursivelyNumbers(int n) {
        // exit condition
        if (n == -1) {
            return;
        }
        // part 1: print n
        System.out.println(n);

        // part 2: print all numbers from (n-1) to 0
        printRecursivelyNumbers(n - 1);
    }


}
