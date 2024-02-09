package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.repository.IMovieRepo;

@SpringBootApplication
public class BootDataJpaProj04FinderMethodTestApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(BootDataJpaProj04FinderMethodTestApplication.class, args);
	
	IMovieRepo repo=ctx.getBean(IMovieRepo.class);
	System.out.println(repo.getClass());
	System.out.println("========Finder method=================");
	//all these 3 methods are same 
	repo.findByMnameEquals("KGF").forEach(System.out::println);	
	System.out.println("--------------------------------------------------------------");
	repo.findBymname("Puspa2").forEach(System.out::println);
	System.out.println("--------------------------------------------------------------");
	repo.findBymnameIs("Salar").forEach(System.out::println);
	System.out.println("--------------------------------------------------------------");
	
	
	System.out.println("--------------------------------------------------------------------");
	repo.findByMnameStartingWith("S").forEach(System.out::println);
	
	System.out.println("--------------------------------------------------------------------");
	repo.findByMnameEndingWith("I").forEach(System.out::println);
	
	System.out.println("--------------------------------------------------------------------");
	repo.findByMnameContaining("GF").forEach(System.out::println);
	
	System.out.println("--------------------------------------------------------------------");
	repo.findByMnameEqualsIgnoreCase("kgf").forEach(System.out::println);
	

	System.out.println("--------------------------------------------------------------------");
	repo.findByMnameContainingIgnoreCase("gf").forEach(System.out::println);
	  
	
	System.out.println("--------------------------------------------------------------------");
	//repo.findByMnameLike("k%").forEach(System.out::println);
	//repo.findByMnameLike("___").forEach(System.out::println);
	//repo.findByMnameLike("%C%").forEach(System.out::println);
	repo.findByMnameLike("%2").forEach(System.out::println);
}   

}
																													