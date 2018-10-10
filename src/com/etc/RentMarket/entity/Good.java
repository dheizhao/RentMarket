package com.etc.RentMarket.entity;

import java.io.Serializable;


/**
 * The persistent class for the goods database table.
 * 
 */
  
public class Good implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int goodId;

	private int goodCount;

	private String goodImgAdd;

	private String goodName;

	private double goodPrice;

	private int goodState;

	private int typeId;

	public Good() {
	}

	public int getGoodId() {
		return this.goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public int getGoodCount() {
		return this.goodCount;
	}

	public void setGoodCount(int goodCount) {
		this.goodCount = goodCount;
	}

	public String getGoodImgAdd() {
		return this.goodImgAdd;
	}

	public void setGoodImgAdd(String goodImgAdd) {
		this.goodImgAdd = goodImgAdd;
	}

	public String getGoodName() {
		return this.goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public double getGoodPrice() {
		return this.goodPrice;
	}

	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}

	public int getGoodState() {
		return this.goodState;
	}

	public void setGoodState(int goodState) {
		this.goodState = goodState;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

}