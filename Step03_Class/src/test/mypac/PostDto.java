package test.mypac;

import test.auto.Car;

public class PostDto {
	private int id;
	private String content;
	private String author;
	private Car car1=new Car();
	
	public PostDto() {};
	public PostDto(int id, String content, String author, Car car1) {
		this.id = id;
		this.content = content;
		this.author = author;
		this.car1 = car1;
		
	};
	
	//getter, setter 지정
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Car getCar1() {
		return car1;
	}
	public void setCar1(Car car1) {
		this.car1 = car1;
	}
	
	
}
