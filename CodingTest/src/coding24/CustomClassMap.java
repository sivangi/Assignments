package coding24;

import java.util.HashMap;
import java.util.LinkedHashMap;

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
		this.name = name;
	}

	public int getStudentId(int id) {
		return id;
	}

	public String toString() {

		return "Student is  " + name + "  the id is " + id + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class CustomClassMap {

	public static void main(String[] args) {

		Student c1 = new Student(1, "Ashley");
		Student c2 = new Student(2, "Bob");
		Student c3 = new Student(3, "Carla");
		Student c4 = new Student(4, "Dan");
		Student c5 = new Student(1, "Ashley");

		HashMap<Student, Integer> map = new LinkedHashMap<Student, Integer>();
		map.put(c1, 1);
		map.put(c2, 2);
		map.put(c3, 3);
		map.put(c4, 4);
		map.put(c5, 1);

		for (Student key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}

	}
}
