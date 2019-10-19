package com.test.smile.api.domain;

public class RequestApiFrase {
	
	private int count;
	private String cat;
	
	public RequestApiFrase(int count, String cat) {
		this.count =count;
		this.cat = cat;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}
	
	

}
