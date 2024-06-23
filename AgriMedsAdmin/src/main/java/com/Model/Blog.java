package com.Model;

public class Blog {
	
	private int BlogId;
	private String BlogTitle;
	private String BlogDesc;
	private int UserId;
	
	public Blog() {
		super();
		this.BlogId = BlogId;
		this.BlogTitle = BlogTitle;
		this.BlogDesc = BlogDesc;
		this.UserId = UserId;
	}
	
	public int getBlogId() {
		return BlogId;
	}
	public void setBlogId(int blogId) {
		BlogId = blogId;
	}
	public String getBlogTitle() {
		return BlogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		BlogTitle = blogTitle;
	}
	public String getBlogDesc() {
		return BlogDesc;
	}
	public void setBlogDesc(String blogDesc) {
		BlogDesc = blogDesc;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	

}
