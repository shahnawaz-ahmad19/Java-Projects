package cris;

import com.opensymphony.xwork2.ModelDriven;

public class User {
	private String stuname,stuage,country;
	private int stumarks;
	
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuage() {
		return stuage;
	}
	public void setStuage(String stuage) {
		this.stuage = stuage;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getStumarks() {
		return stumarks;
	}
	public void setStumarks(int stumarks) {
		this.stumarks = stumarks;
	}
	
	
}
