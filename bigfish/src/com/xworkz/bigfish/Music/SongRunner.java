package com.xworkz.bigfish.Music;

public class SongRunner {
	public static void main(String [] arg) 
	{
		System.out.println("Declaring the nameOfSong,langOfSong,lyricsOfSong,typeOfSong");
		Song index=new Song();
		System.out.println(index.nameOfSong);
		System.out.println(index.langOfSong);
		System.out.println(index.lyricsOfSong);
		System.out.println(index.typeOfSong);
		index.nameOfSong="Neenu Bagehariyada";
		index.langOfSong="Kannada";
		index.lyricsOfSong="Premakke Kannilla";
		index.typeOfSong="Romatic Song";
		System.out.println(index.nameOfSong);
		System.out.println(index.langOfSong);
		System.out.println(index.lyricsOfSong);
		System.out.println(index.typeOfSong);
		
		
		
	}
}
