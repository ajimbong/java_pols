import java.util.Scanner;

public class ArrayList {
	     
	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);

		// Create an ArrayList
		ArrayList list = new ArrayList();

		// Prompt the user to enter a sequence of numbers ending with 0
		System.out.print("Enter a sequence of numbers ending wih 0: ");
		Integer number = sc.nextInt();
		while (number.intValue() != 0) {
list.add(number);
			number = sc.nextInt();
		}

		// Display the largest number in the input 
		System.out.println("The largest number in the input is " + max(list));
	}

	private void add(Integer number) {
		// TODO Auto-generated method stub
		
	}
private static String max(ArrayList list) {
		// TODO Auto-generated method stub
		return null;
	}

	/** Return the maximum value in an ArrayList of integers */
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0)
			return null;

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}

}
