package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

	//select mid,mname,year,rating from sp_data_movie1 where mname='?';
	public List<Movie> findByMnameEquals(String name);
	public List<Movie> findBymname(String name);
	public List<Movie> findBymnameIs(String name);
	
	
	//select mid, mname,rating,year from so_data_movie1 where mname like 'S%';
	public Iterable<Movie> findByMnameStartingWith(String initChars); 
	
	//select mid, mname,rating,year from so_data_movie1 where mname like 'I%';
	public Iterable<Movie> findByMnameEndingWith(String lastChars); 
	
	//select mid, mname,rating,year from so_data_movie1 where mname like 'GF%';
	public Iterable<Movie> findByMnameContaining(String chars); 


	//select mid, mname,rating,year from so_data_movie1 where mname like 'kgF%';
	public Iterable<Movie> findByMnameEqualsIgnoreCase(String name); 
	
	//select mid, mname,rating,year from so_data_movie1 where mname like 'gF%';
		public Iterable<Movie> findByMnameContainingIgnoreCase(String chars); 

		//select mid, mname,rating,year from so_data_movie1 where mname like 'gF%';
			public Iterable<Movie> findByMnameLike(String chars); 

}
