package com.sorrel012.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


//Stream<T> filter(Predicate<? super T> predicate);
//boolean test(T t);
class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number%2 == 0;
	}
	
}

//void forEach(Consumer<? super T> action);
//void accept(T t);
class PrintlnConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer num) {
		System.out.println(num);
	}
	
}

//Stream<R> map(Function<? super T, ? extends R> mapper);
//R apply(T t);
class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer num) {
		return num*num;
	}
	
}

public class LambdaBehindTheScreensRunner {
	
	public static void main(String[] args) {

		List.of(23,43,34,45,36,48).stream()
									.filter(n -> n%2==0)
									.forEach(System.out::println);
		System.out.println();

		List.of(23,43,34,45,36,48).stream()
									.filter(new EvenNumberPredicate())
									.forEach(System.out::println);
		System.out.println();
		
		List.of(23,43,34,45,36,48).stream()
									.filter(new EvenNumberPredicate())
									.forEach(new PrintlnConsumer());
		System.out.println();
		
		List.of(23,43,34,45,36,48).stream()
									.filter(new EvenNumberPredicate())
									.map(n -> n*n)
									.forEach(new PrintlnConsumer());
		System.out.println();
		
		List.of(23,43,34,45,36,48).stream()
									.filter(new EvenNumberPredicate())
									.map(new NumberSquareMapper())
									.forEach(new PrintlnConsumer());
		
	} //main

}