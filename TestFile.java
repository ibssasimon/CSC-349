public class TestFile {
	public static void main(String[] args) {
		System.out.println("Hello world, welcome to Algorithms");
		

		int i = 0;
		if (i == 0) {
			System.out.println("i is: " + i);
			System.out.println("Yippee!");
		}
		printNums();
	}

	private static void printNums() {
		int k = 1;

		for(int i = 0; i < 5; i++) {
			k++;
			System.out.println("K is now: " + k);
		}
	}


}