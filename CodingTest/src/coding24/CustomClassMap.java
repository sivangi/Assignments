package coding24;

import java.util.HashMap;

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	 public String getStudentName() {
	        return name;
	 }
	 
	 
	 public void setStudentName(String name) {
	        this.name= name;
	    }
	 
	    public int getStudentId(int id) {
	        return id;
	    }
	 
	 
	 public String toString() {

		return "The name of the student is " + name + "  the id is " + id + "";
	}
	 
	}

public class CustomClassMap {

	public static void main(String[] args) {

		Student c1 = new Student (1, "Ashley");
		Student  c2 = new Student (2, "Bob");
		Student  c3 = new Student (3, "Carla");
		Student c4 = new Student (4, "Dan");
		Student c5 = new Student (5, "Elaine");

		HashMap<Integer, Student > map = new HashMap<Integer,Student >();
		map.put(1, c1);
		map.put(2, c2);
		map.put(3, c3);
		map.put(4, c4);
		map.put(5, c5);

		for (Integer key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}

	}
}


