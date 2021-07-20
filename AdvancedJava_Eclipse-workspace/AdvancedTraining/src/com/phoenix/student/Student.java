package com.phoenix.student;

public class Student {

	// instance of class
	private int id;
	private String name;
	private String place;
	private float marksOfjava;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String place, float marksOfjava) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.marksOfjava = marksOfjava;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public float getMarksOfjava() {
		return marksOfjava;
	}

	public void setMarksOfjava(float marksOfjava) {
		this.marksOfjava = marksOfjava;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", place=" + place + ", marksOfjava=" + marksOfjava + "]";
	}

	public boolean equals(Object ob) {

		if (ob instanceof Student) {
			Student st = (Student) ob;

			if (this.id == st.id && this.name.equals(st.name) && this.place.equals(st.place)
					&& this.marksOfjava == st.marksOfjava) {
					return true;
			} else {
				return false;
			}
		} else {
			return false;
		}	
	}
} // end of the class
 