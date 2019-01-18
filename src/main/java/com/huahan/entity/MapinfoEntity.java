package com.huahan.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MapinfoEntity {
	@JsonProperty(value = "ID")
	private int ID;
	
	@JsonProperty(value = "Appid")
	private String Appid;
	@JsonProperty(value = "Sign1")
	private String Sign1;
	@JsonProperty(value = "Sign2")
	private String Sign2;
	@JsonProperty(value = "Sign3")
	private String Sign3;
	@JsonProperty(value = "Sign4")
	private String Sign4;
	@JsonProperty(value = "Sign5")
	private String Sign5;
	
	@JsonProperty(value = "Shape")
	private String Shape;
	
	
	public int getID() {
		return ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}
	
	public String getAppid() {
		return Appid;
	}

	public void setAppid(String Appid) {
		this.Appid = Appid;
	}
	
	public String getSign1() {
		return Sign1;
	}

	public void setSign1(String Sign1) {
		this.Sign1 = Sign1;
	}
	
	public String getSign2() {
		return Sign2;
	}

	public void setSign2(String Sign2) {
		this.Sign2 = Sign2;
	}
	
	public String getSign3() {
		return Sign3;
	}

	public void setSign3(String Sign3) {
		this.Sign3 = Sign3;
	}
	
	public String getSign4() {
		return Sign4;
	}

	public void setSign4(String Sign4) {
		this.Sign4 = Sign4;
	}
	
	public String getSign5() {
		return Sign5;
	}

	public void setSign5(String Sign5) {
		this.Sign5 = Sign5;
	}
	
	public String getShape() {
		return Shape;
	}

	public void setShape(String Shape) {
		this.Shape = Shape;
	}
}
