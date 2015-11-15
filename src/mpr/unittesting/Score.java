package mpr.unittesting;

import java.util.*;

public class Score {
	private List<Note> notes = new ArrayList<>(); 
	
	public void add(Note note) {
		notes.add(note);
	}
	
	public int computeScore() {
		int total = notes.stream().mapToInt(Note::get).sum();
		return total / notes.size();
	}
}
