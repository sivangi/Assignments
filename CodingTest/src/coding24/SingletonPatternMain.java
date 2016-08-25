package coding24;

public class SingletonPatternMain {

	public static void main(String[] args) {

		// SingletonPatter object = new SingletonPattern();
		// Compile Time Error: The constructor SingletonPattern() is not
		// visible.

		@SuppressWarnings("unused")
		SingletonPattern object = SingletonPattern.getInstance();

		SingletonPattern.exampleMethod();
	}
}
