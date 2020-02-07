package edu.asu.diging.tutorial.spring.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService {
	
	ArrayList<String> moods =  new ArrayList<String>();
	Random rand;
	
	@PostConstruct
	public void initMood() {
		moods.add("happy");
		moods.add("sad");
		moods.add("emotional");
		rand = new Random(); 
	}
	
    public Mood getCurrentMood() {		
        return new Mood(moods.get(rand.nextInt(moods.size())));
    }

	public String getExplanation(String mood) {		
		return "I am " + mood.toUpperCase();
	}
}
