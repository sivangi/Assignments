package coding24;

public class SingletonPattern {

	private static SingletonPattern singleton = new SingletonPattern();

	private SingletonPattern() {
	}

	public static SingletonPattern getInstance() {
		return singleton;
	}

	protected static void exampleMethod() {
		System.out.println("exampleMethod for singleton");
	}
}
