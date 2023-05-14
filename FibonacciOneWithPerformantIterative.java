public class FibonacciOneWithPerformantIterative {
    private static int FibonacciWithPerformantIterative(int n) {
        int last = 0, next = 1;
        for (int i = 0; i < n; i++) {
            int oldLast = last;
            last = next;
            next = oldLast + next;
        }
        return last;
    }

    public static void main(String[] args) {
        int numberOfFiboNumber = 7;
        System.out.println(String.format("The %d. fibo number: ",numberOfFiboNumber));
        System.out.println(FibonacciWithPerformantIterative(numberOfFiboNumber));
    }
}
