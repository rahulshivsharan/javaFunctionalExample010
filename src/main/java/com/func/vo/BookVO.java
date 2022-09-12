package com.func.vo;

public class BookVO {
	private String title;
    private float price;
    
    public BookVO() {}
    
    public BookVO (String title, float price) {
    	this.price = price;
    	this.title = title;
    }
    
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		StringBuffer strb = new StringBuffer();
		
		strb.append(this.title).append(" : ").append(this.price);
		
		return strb.toString();
	}
        
}
