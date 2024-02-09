package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="SP_DATA_MOVIE1")
@RequiredArgsConstructor
@NoArgsConstructor
public class Movie{

	@Id
	@Column(name="MID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mid;
	@Column(name="MNAME",length = 20)
	@NonNull
	private String mname;
	@Column(name="YEAR", length = 20)
	@NonNull
	private String year;
	@Column(name="RATING")
	@NonNull
	private Float rating;

}
