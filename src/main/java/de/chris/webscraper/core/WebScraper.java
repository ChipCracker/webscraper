package de.chris.webscraper.core;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class WebScraper {

	private WebClient client;
	
	public WebScraper(boolean cssEnabled, boolean javascriptEnabled)  {
		
		client = new WebClient(BrowserVersion.FIREFOX_60);
		client.getOptions().setCssEnabled(cssEnabled);
		client.getOptions().setJavaScriptEnabled(javascriptEnabled);
		
		
		
	}
	
	public void getAllSubredditPostsFromURL(String searchUrl) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		HtmlPage page = client.getPage(searchUrl);
		
		List<?> cards = page.getByXPath("//*[@id=\"t3_eyq5vp\"]");
		System.out.println(cards);
	}
	
}
