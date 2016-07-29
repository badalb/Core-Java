package com.test.stream.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapMain {

	public static void main(String[] args) {
		List<Foo> foos = new ArrayList<>();

		IntStream.range(1, 4).forEach(i -> foos.add(new Foo("Foo" + i)));

		foos.forEach(foo -> IntStream.range(1, 4).forEach(i -> foo.bars.add(new Bar("Bar" + i + "<-" + foo.name))));

		foos.stream().flatMap(f -> f.bars.stream()).map(s -> s.name).forEach(System.out::println);
	}

}
