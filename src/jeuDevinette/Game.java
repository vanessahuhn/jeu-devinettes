package jeuDevinette;

import java.util.Scanner;

public class Game 
{
	//proposer un secretNumber au hasard
	public static int setSecretNumber() {
		int secretNumber = (int) (Math.random() * 1000 + 1);
		return secretNumber;
	}
	
	//demander � l'user un num�ro entre 1 et 1000
	public static int getUserInput() {
		Scanner getUserInput = new Scanner(System.in);
		System.out.println("Input a number [1-1000]: ");
		int userInput = getUserInput.nextInt();
		return userInput;
	}
	
	//savoir si le nombre a �t� trouv�
	public static boolean nbFound(int secretNumber, int userInput) {
		//si userInput est sup�rieur � secretNumber
		if (userInput > secretNumber) {
			//afficher Your guess is greater than the secret number.
			System.out.println("Your guess is greater than the secret number.");
			//retourner false
			return false;
		}
		//sinon si userInput est inf�rieur � secretNumber
		else if (userInput < secretNumber) {
			//afficher Your guess is smaller than the secret number.
			System.out.println("Your guess is smaller than the secret number.");
			//retourner false
			return false;
		}
		//sinon (c'est-�-dire si userInput est identique � secretNumber)
		else {
			//afficher Your guess is correct. Congratulations!
			System.out.println("Your guess is correct. Congratulations!");
			//retourner true;
			return true;
		}
	}
	
	//m�thode guess() qui permet de lancer le jeu
	public static void guess() {
		//stocke le nombre d'essais restant
		int remainingAttempts = 10;
		//stocke le secretNumber
		int number = setSecretNumber();
				
		//tant que essais > 0 && nbFound(false)
		while(remainingAttempts > 0 && nbFound(number, getUserInput()) == false) {
			//d�cr�menter le nombre d'essais
			remainingAttempts--;
		}
		//afficher le secretNumber en fin de partie
		System.out.println("The secret number was " + number + ".");
	}
	
	
	
		
	
		
		
			
		
}
