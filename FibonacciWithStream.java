import java.util.stream.IntStream;
 
public class FibonacciWithStream {
    private int last = 0, next = 1;
    private static int maxNumberOfFibos= 20;
    public IntStream stream() {
        return IntStream.generate(() -> {
            int oldLast = last;
            last = next;
            next = oldLast + next;
            return oldLast;
        });
    }
 
    public static void main(String[] args) {
        FibonacciWithStream fibo = new FibonacciWithStream();
        fibo.stream().limit(maxNumberOfFibos).forEachOrdered(System.out::println);
    }
}
