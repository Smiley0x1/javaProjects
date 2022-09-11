import java.util.Random;
import java.util.Scanner;
import java.lang.*;


class Main {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int z;
		int x;
		String y = "";
		String z1 = "";
		boolean repeat = true;
		int countSys = 0, countPlay = 0, repeatInt;


		while (repeat == true){
		System.out.println("Lets play a game of Rock Paper Scissors!\n0: Rock \t1: Paper\t2: Scissors\nChose one!:)");
		z = scan.nextInt();
		x = random.nextInt(2);
		
		if (x == 0){
			y = "Rock";
		}else if (x ==1){
			y = "Paper";
		}else if (x == 2){
			y = "Scissors";
		}
			if (z == 0){
			z1 = "Rock";
		}else if (z ==1){
			z1 = "Paper";
		}else if (z == 2){
			z1 = "Scissors";
		}
		System.out.println("The computer chose: " + y + "\nYou chose: " + z1 );
		if (x == 0 && z  == 2){
			System.out.println("Opponent won");
			countSys++;
		}else if (x == 1 && z == 0){
			System.out.println("Opponent won");
			countSys++;
		}else if(x == 2 && z == 1){
			System.out.println("Opponent won");
			countSys++;
		}else if (x == z){
			System.out.println("Tied");
		}else{
			System.out.println("You win!");
			countPlay++;
		}
		System.out.println("Do you want to play again?\n1: Yes\n2: No");
		repeatInt = scan.nextInt();
		if (repeatInt == 2){
			repeat = false;
		}
		System.out.println("The current score is " + countPlay + ":" + countSys);
	}
}
}