package com.marienbergapp;

import android.location.Location;

public class Spot {
	
	private Location position;
	private String description;
	private Question[] questions={};
	

	public Spot(Location l, String description, Question[] questions){
		this.position = l;
		this.description = description;
		this.questions = questions;
	}

	public Location getPosition() {
		return position;
	}

	public Spot setPosition(Location position) {
		this.position = position;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Spot setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public Question[] getQuestions() {
		return questions;
	}

	public Spot setQuestions(Question[] questions) {
		this.questions = questions;
		return this;
	}


}
