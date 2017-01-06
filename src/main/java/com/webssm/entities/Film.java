package com.webssm.entities;

import java.util.Date;
import java.util.Set;

public class Film {

	private Integer film_id;
	private String title;
	private String description;
	private String releaseYear;
	
	private Integer language_id;
	private Language language;
	
	private Integer originalLanguageId;
	private Integer rentalDuration;
	private Double rentalRate;
	private Integer length;
	private Double replacementCost;
	private Enum rating;
	private Set special_features;
	private Date last_update;
	
	public Film() {}
	public Film(Integer film_id, String title, String description, String releaseYear, Integer language_id,
			Language language, Integer originalLanguageId, Integer rentalDuration, Double rentalRate, Integer length,
			Double replacementCost, Enum rating, Set special_features, Date last_update) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.language_id = language_id;
		this.language = language;
		this.originalLanguageId = originalLanguageId;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.special_features = special_features;
		this.last_update = last_update;
	}


	public Integer getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}
	public Integer getFilm_id() {
		return film_id;
	}
	public void setFilm_id(Integer film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Integer getOriginalLanguageId() {
		return originalLanguageId;
	}
	public void setOriginalLanguageId(Integer originalLanguageId) {
		this.originalLanguageId = originalLanguageId;
	}
	public Integer getRentalDuration() {
		return rentalDuration;
	}
	public void setRentalDuration(Integer rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	public Double getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Double getReplacementCost() {
		return replacementCost;
	}
	public void setReplacementCost(Double replacementCost) {
		this.replacementCost = replacementCost;
	}
	public Enum getRating() {
		return rating;
	}
	public void setRating(Enum rating) {
		this.rating = rating;
	}
	public Set getSpecial_features() {
		return special_features;
	}
	public void setSpecial_features(Set special_features) {
		this.special_features = special_features;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", title=" + title + ", description=" + description + ", releaseYear="
				+ releaseYear + ", language=" + language + ", originalLanguageId=" + originalLanguageId
				+ ", rentalDuration=" + rentalDuration + ", rentalRate=" + rentalRate + ", length=" + length
				+ ", replacementCost=" + replacementCost + ", rating=" + rating + ", special_features="
				+ special_features + ", last_update=" + last_update + "]";
	}
	
}
