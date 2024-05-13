
public class OverlodingMainMethod {
	static public void main(String[] args) {
		System.out.println("hi");
		main();
        main(5.5);
	}

	public static void main() {
		System.out.println("hello");
	}
	
	public static void main(double k) {
		System.out.println("bye");
	}

}
