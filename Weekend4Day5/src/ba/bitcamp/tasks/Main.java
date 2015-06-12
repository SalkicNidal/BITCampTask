package ba.bitcamp.tasks;

public class Main {
	
	public static int countGenreNumber(Albums a, String genre){
		
		int counter = 0;
		if( a.type.equals(genre)){
			counter++;
		}
		return counter;
	}
	
	

	/**
	 * Method which checking older song
	 * 
	 * @param s
	 *            - Song one
	 * @param s2
	 *            - Song two
	 * @return - Older song
	 */
	public static Song getOlderSong(Song s, Song s2) {

		if (s.yearOfSong > s2.yearOfSong) {
			return s2;
		}
		return s;

	}

	/**
	 * Method checking is artist of song single or group
	 * 
	 * @param s2
	 *            - Song
	 * @return - True - artist of song is group False - artist of song is solo
	 */
	public static boolean isFromSoloAuthor(Song s2) {

		if (s2.artist.isGroup.equals(true)) {
			return true;
		}
		return false;
	}

	/**
	 * Method which check is same author
	 * 
	 * @param s1[]
	 *            - song 1
	 * @param s2
	 *            - song 2
	 * @return True - author is same False - author is not same
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {

		if (s1.artist.name.equals(s2.artist.name)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		// Declaration of new Artists with constructor
		Artists Art1 = new Artists("Magla band", true, 2001, "rock");
		Artists Art2 = new Artists("Regina", true, 1995, "pop-rock");
		Artists Art3 = new Artists("Massimo", false, 1895, "pop - rock");
		Artists Art4 = new Artists("KunikoKato", false, 2000, "classic");

		// Declaration the new songs with constructor
		Song[] S = new Song[2];
		 S[0] = new Song(Art1, "Rein", 2002, "rock");
		 S[1] = new Song(Art1, "Ball", 2005, "balads");
		Song[]S1 = new Song[2];
	     S1[0] = new Song(Art2, "Sama", 2011, "rock");
	     S1[1] = new Song(Art2, "Last time", 2007, "Rock");
	    Song[] S2 = new Song[2];
		 S2[0] = new Song(Art3, "Sky", 1999, "balads");
		 S2[1] = new Song(Art3, "Try", 2007, "instrumental");
		Song[] S3 = new Song[2];
		 S3[0] = new Song(Art4, "Ieanis Xenakis", 2010, "classic");
		 S3[1] = new Song(Art4, "Hux Nax", 2003, "classic");
		 
		// Declaration of albums
		Albums a1 = new Albums("Rein", Art1, S, "rock");
		Albums a2 = new Albums("Sama",Art2, S1,"pop rock");
		Albums a3 = new Albums("Try catch the Sky", Art3, S2,"balads");
		Albums a4 = new Albums("Chao Min",Art4, S3,"classic");

		// Printing entered artist and songs
		System.out.println(Art1);
		System.out.println();
		System.out.println(Art2);
		System.out.println();
		System.out.println(S1[0]);
		System.out.println();
		System.out.println(S2[1]);
		System.out.println();
		// Print method 1
		System.out.println(isSameAuthor(S1[0], S2[0]));
		// Print method 2
		System.out.println(isFromSoloAuthor(S2[1]));
		// Print older song
		System.out.println(getOlderSong(S[1], S2[1]));
		//Print the song of artist
		System.out.println();
		//Print the albums 
		System.out.println(a1);
		// Print the number of same genre in the album with method
		System.out.println(countGenreNumber(a3, "balads"));

	}

}
