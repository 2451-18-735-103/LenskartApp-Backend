package com.capgemini.lenskart.dto;


public class SunGlassesDTO extends ProductDTO{
	
	private String brand;
	private String image;
	private String frameColor;
	private String frameShape;
	//private String glassColor;
	private double weight;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getFrameColor() {
		return frameColor;
	}
	public void setFrameColor(String frameColor) {
		this.frameColor = frameColor;
	}
	public String getFrameShape() {
		return frameShape;
	}
	public void setFrameShape(String frameShape) {
		this.frameShape = frameShape;
	}
//	public String getGlassColor() {
//		return glassColor;
//	}
//	public void setGlassColor(String glassColor) {
//		this.glassColor = glassColor;
//	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	


}
