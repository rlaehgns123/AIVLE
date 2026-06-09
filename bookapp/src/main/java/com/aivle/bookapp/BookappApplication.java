package com.aivle.bookapp;

import com.aivle.bookapp.domain.Book;
import com.aivle.bookapp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookappApplication {
	@Bean
	CommandLineRunner init(BookRepository repo) {
		return args -> {
			//save, findById 예제 코드
			/*Book book = new Book();
			book.setTitle("Spring boot 입문");
			book.setAuthor("임한울");

			Book saved = bookRepository.save(book);

			System.out.println("책 id: " + saved.getId());

			Book book2 = bookRepository.findById(1L).orElseThrow(() -> new RuntimeException("책이 없음"));
			System.out.println("-----------------");
			System.out.println("book2의 Id: " + book2.getId());
			System.out.println("book2의 title: " + book2.getTitle());
			System.out.println("book2의 author: " + book2.getAuthor());*/

			Book b1 = new Book();
			b1.setTitle("자바의 정석");
			b1.setAuthor("남궁석");
			repo.save(b1);

			Book b2 = new Book();
			b2.setTitle("한국사");
			b2.setAuthor("최태성");
			repo.save(b2);

			Book b3 = new Book();
			b3.setTitle("짱깨는 씨발련이다");
			b3.setAuthor("짱깨들 다 뒤져");
			repo.save(b3);

			Book b4 = new Book();
			b4.setTitle("짱깨 천안문");
			b4.setAuthor("짱깨");
			repo.save(b4);

			Book b5 = new Book();
			b5.setTitle("핑핑이 개 씨발련~");
			b5.setAuthor("짱깨2");
			repo.save(b5);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args); //역할 분담, 스프링부트 실행 코드
	}
}
