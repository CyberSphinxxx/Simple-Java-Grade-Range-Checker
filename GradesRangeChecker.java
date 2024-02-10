import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Grades Here: ");

		int n = scan.nextInt();
		System.out.println(n);

		if (n > 5) {
			System.out.println("Not In Range");
		} else if (n < 1) {
			System.out.println("Not In Range");
		} else if (n >= 1 && n < 5) {
			System.out.println("In Range");
		}

	}

}
