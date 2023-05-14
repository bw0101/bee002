import java.util.stream.IntStream;
 
public class FibonacciWithStream {
    private int last = 0, next = 1; / fib(0), fib(1)
 
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
        fibo.stream().limit(41).forEachOrdered(System.out::println);
    }
}
