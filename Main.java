package dualKopen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("ThreeFive, ");
			} else if (i % 3 == 0) {
				System.out.print("Three, ");
			} else if (i % 5 == 0) {
				if (i == 100) {
					System.out.print("Five.");
				} else {
					System.out.print("Five, ");
				}
			} else {
				System.out.print(i + ", ");
			}
		}
	}

}
