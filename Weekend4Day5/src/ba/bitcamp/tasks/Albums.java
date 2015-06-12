package ba.bitcamp.tasks;

import java.util.Arrays;

public class Albums {
     String name;
     Artists artist;
     Song[] songs;
     String type;
     
     
	public Albums(String name, Artists artist, Song[] songs, String type) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = songs;
		this.type = type;
	}


	@Override
	public String toString() {
		String line = "";
		 line+=	"Albums [name="+ name + ", artist= " + artist.name + " ";
		for (int i= 0; i< songs.length; i ++) {
		
		line+= "Song is "+songs[i].nameOfSong +" ";
		}
		line+= " type=" + type + "]";
		
		return line;
	
     
	}
     
     
    
}
