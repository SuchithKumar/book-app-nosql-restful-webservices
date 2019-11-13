package com.mphasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.domain.Book;
import com.mphasis.repository.BookRepository;

@SpringBootApplication
public class BookAppNosqlRestfulWebservicesApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("BookRepository")
	private BookRepository bookRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BookAppNosqlRestfulWebservicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepo.save(new Book(".Net Core in Action","Dustin Metzgar","978-1-61729-427-3",288,2018));
		bookRepo.save(new Book(".Net Development using Compiler API","Jason Bock","978-1-484221-10-5",176,2016));
		bookRepo.save(new Book(".Net Framework 4.5 Expert Programming Cookbook","A. P. Rajshekhar","978-1-84968-742-3",276,2013));
		bookRepo.save(new Book("20 Easy Raspberry Pi Projects","Sara Santos, Rui Santos","978-1-59327-843-4",288,2018));
		bookRepo.save(new Book("21st Century C","Dustin Metzgar","978-1-4493-2714-9",296,2012));
		bookRepo.save(new Book("21st Century C 2nd Edition","Dustin Metzgar","978-1-49190-389-6",408,2014));
		bookRepo.save(new Book("21st Century Robot","Brian David Johnson","978-1-44933-821-3",278,2014));
		
		System.out.println(bookRepo.findAll());
	}

}
