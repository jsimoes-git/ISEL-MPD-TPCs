package isel.mpd;

import isel.mpd.misc.Utils;

import java.util.Scanner;

public class ChooseStudent {

	public static void main(String[] args) {
		int max;
		if(args.length > 0) {
			max = Integer.parseInt(args[0]);
		} else {
			Scanner s = new Scanner(System.in); 
			System.out.println("Introduza o n�mero m�ximo: ");
			max = s.nextInt();
			s.close();
		}
		
		System.out.println("O n�mero de candidatos � taluda �: " + max);
			
		int chosenOne = Utils.chooseRandom(max);
		System.out.println("O contemplado � o n�: " + chosenOne);
	}

}
