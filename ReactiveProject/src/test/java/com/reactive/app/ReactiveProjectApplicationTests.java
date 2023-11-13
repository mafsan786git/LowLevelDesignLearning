package com.reactive.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple3;

import java.time.Duration;

@SpringBootTest
class ReactiveProjectApplicationTests {

	@Test
	void workingWithMono() throws InterruptedException {
//		MONO -----> publisher
//		Created Mono
//		Mono<String> errorMono = Mono.error(new RuntimeException("Error !!"));
//		Mono<String> stringMono = Mono.just("Learning Mono.")
//				.log()
//				.then(errorMono);

//		Consumer the mono by subscribing
//		stringMono.subscribe(data->{
//			System.out.println("Data subscribed : "+data);
//		});
//		errorMono.subscribe(System.out::println);

		Mono<String> m1 = Mono.just("First mono");
		Mono<String> m2 = Mono.just("second mono");
		Mono<Integer> m3 = Mono.just(12345);

//		Mono<String> resultMapMono1 = m1.map(String::toUpperCase);
//		resultMapMono1.subscribe(System.out::println);
//
//		Mono<String[]> resultFlatMapMono1 = m1.flatMap(valueM1 -> Mono.just(valueM1.split(" ")));
//		resultFlatMapMono1.subscribe(data -> {
//			for (String s : data) {
//				System.out.println(s);
//			}
//		});
//
//		Flux<String> stringFlux = m1.flatMapMany(valueM1 -> Flux.just(valueM1.split(" ")));
//		stringFlux.subscribe(data -> {
//				System.out.println(data);
//		});

		System.out.println(Thread.currentThread().getName());
		Flux<String> stringFlux = m1.concatWith(m2)
				.log()
				.delayElements(Duration.ofMillis(2000));
		stringFlux.subscribe(data -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(data);
		});
		Thread.sleep(4000);
		System.out.println("Terminated main thread.");
//		Mono<Tuple3<String, String, Integer>> combinedMono = Mono.zip(m1, m2, m3);
//		combinedMono.subscribe(data->{
//			System.out.println(data.getT1());
//			System.out.println(data.getT2());
//			System.out.println(data.getT3());
//		});
//
		//same as zipWith


	}

}
