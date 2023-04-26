package com.kuchi.beans;

public class limit {
	private int minium;
	private int maximum;
	public int getMinium() {
		return minium;
	}
	public void setMinium(int minium) {
		this.minium = minium;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public limit(int minium, int maximum) {
		super();
		this.minium = minium;
		this.maximum = maximum;
	}
	public limit() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
