package com.nt.runner;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Movie;
import com.nt.repository.IMovieRepo;

@Component("runner")
public class FinderMethodRunnerTest implements CommandLineRunner {

	private IMovieRepo repo;
	@Override
	public void run(String... args) throws Exception {
		//finder methods

	}  

}
