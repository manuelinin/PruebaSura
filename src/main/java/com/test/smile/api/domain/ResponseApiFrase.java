package com.test.smile.api.domain;

public class ResponseApiFrase {
	
	 private String quote;
     private String author;
     private String category;
     
     
     public ResponseApiFrase( ) {
    	 
     }


	public String getQuote() {
		return quote;
	}


	public void setQuote(String quote) {
		this.quote = quote;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

     
     
}
