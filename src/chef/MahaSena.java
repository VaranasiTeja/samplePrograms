package chef;

import java.io.IOException;
import java.util.Scanner;

public class MahaSena {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int numSoldiers = sc.nextInt();
		int input[] = new int[numSoldiers];
		for (int i = 0; i < numSoldiers; i++) {
			input[i] = sc.nextInt();
		}
		MahaSena mahasena = new MahaSena();
		System.out.println(mahasena.isReadyForBattle(input));
		sc.close();
	}

	public String isReadyForBattle(int[] input) {
		int m = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0)
				m++;
		}
		if (m > input.length / 2)
			return "READY FOR BATTLE";
		else
			return "NOT READY";
	}

}
