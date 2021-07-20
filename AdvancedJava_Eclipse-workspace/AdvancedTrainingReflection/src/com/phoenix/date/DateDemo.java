package com.phoenix.date;

public class DateDemo implements Cloneable{

	private int dd;
	private int mm;
	private int yy;

	public DateDemo() {
		// TODO Auto-generated constructor stub
	}

	public DateDemo(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "DateDemo [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
