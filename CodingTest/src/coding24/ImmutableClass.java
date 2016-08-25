package coding24;

final class MyImmutableClass {

	private final int age;
	private final String name;

	public MyImmutableClass(int paramCount, String paramName) {
		age = paramCount;
		name = paramName;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

public class ImmutableClass {
	public static void main(String[] args) {
		MyImmutableClass mic= new MyImmutableClass(25, "Bob");

		System.out.println(mic.getAge());
		System.out.println(mic.getName());

		
}
}