package ba.bitcamp.tasks;

import java.util.Arrays;

public class Song {

	public Artists  artist;
	public String nameOfSong;
	public Integer yearOfSong;
	public String typeOfSong;
	
	// Constructor for Song
	public Song(Artists artist, String nameOfSong, Integer yearOfSong,
			String typeOfSong) {
		super();
		this.artist = artist;
		this.nameOfSong = nameOfSong;
		this.yearOfSong = yearOfSong;
		this.typeOfSong = typeOfSong;
	}
	
	// to String
	public String toString() {
		return "Song [artist=" + artist.name + ", nameOfSong=" + nameOfSong
				+ ", yearOfSong=" + yearOfSong + ", typeOfSong=" + typeOfSong
				+ "]";
	}
	
	
	
	
	
	
	
	
}
