package card_games;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
import java.util.Date;


// Utilities for card games
// Currently only available for logging

public class CardGameUtil {
	
	// display game collection information
	// on screen
	public static void displayGameCollectionInfo() {
		
		System.out.println("---Welcome to Card Game Collection---");
		System.out.println("");
		System.out.println("Please choose your card game:");
		System.out.println("1. ");
	
	}

	// get game collection information
	// and load info into displayGameCollectionInfo()
	static boolean loadGameCollectionInfo() {
		
		
		return true;
	}
	
	// logging function
	public void logging(String message) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date date = new Date();
		System.out.printf("[%s] Message: %s", dateFormat.format(date), message);
	}
	
	public static void main(String[] args) {
		// do nothing...
	}
}
