package Java.Core.Streams.Stream;

import java.util.stream.*;
import java.util.*;
import java.util.Random;

public class StreamGenerateExample {
        public static void main(String[] args) {
                Random random = new Random();

                Stream.generate(() -> random.nextInt(100))
                                .limit(10)
                                .filter(x -> x < 80)
                                .forEach(System.out::println);
                System.out.println();

                Stream.generate(() -> "hello")
                                .limit(3)
                                .forEach(System.out::println);
                System.out.println();

                Stream.iterate(0, n -> n + 2)
                                .limit(5)
                                .forEach(System.out::println);
                // Stream.iterate(0, n -> n < 10, n -> n + 2)
                // .forEach(System.out::println);
                System.out.println();
                Stream.of(1, 2, 3, 4, 5, 6, 1, 2)
                                .takeWhile(n -> n < 5)
                                .forEach(System.out::println);

                System.out.println();
                Stream.of(1, 2, 3, 4, 5, 6, 1, 2)
                                .dropWhile(n -> n < 5)
                                .forEach(System.out::println);
        }
}
