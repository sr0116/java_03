package lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10,30,40,20,10,20,30);
		stream.forEach(i -> System.out.println(i));
		stream = Stream.of(10,30,40,20,10,20,30);
		stream.forEach(i -> System.out.println(i));
		
		int[]arr = {1,2,3,4,5};
		IntStream is = Arrays.stream(arr);
		
		
		List<String> list = List.of("새똥이", "개똥이");
		System.out.println("================");
		
		
		Stream<String>stream2 = list.stream();
		stream2.forEach(s-> System.out.println(s));
		System.out.println("================");
		Stream<Object> stream3 = Stream
		.builder().add("가").add("나").add("다").build();
		stream3.forEach(s-> System.out.println(s));
		System.out.println("================");
		Stream<String> stream4 = Stream.generate(() -> "abcd").limit(10);
		stream4.forEach(s-> System.out.println(s));
		System.out.println("================");
		Stream<Integer>stream5 = Stream.iterate(1, i->i+1).limit(10);
		stream5.forEach(s-> System.out.println(s));
		
	}
}
