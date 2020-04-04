public class TestFile {
	public static void main(String[] args) {
		System.out.println("Hello world, welcome to Algorithms");
		

		int i = 0;
		if (i == 0) {
			System.out.println("i is: " + i);
			System.out.println("Yippee!");
		}
		printNums();

		while(true) {
			i++;
			System.out.println("I is: " + i);
			if(i > 10) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	private static void printNums() {
		int k = 1;

		for(int i = 0; i < 5; i++) {
			k++;
			System.out.println("K is now: " + k);
		}
	}


}