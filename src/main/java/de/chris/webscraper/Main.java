package de.chris.webscraper;

import de.chris.webscraper.core.WebScraper;

public class Main {

	public static void main(String[] args) {
		WebScraper scraper = new WebScraper(false, false);
		System.out.println("Start");

		try {
			scraper.getAllSubredditPostsFromURL("https://www.reddit.com/r/worldnews/");
		}catch(Exception e) {
			
		}
	}
	
}
