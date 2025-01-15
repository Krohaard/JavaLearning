package tp008;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TP008 {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
            // Lecture des nombres
			float number1 = readFloat(scanner, "Entrez le premier nombre : ");
			float number2 = readFloat(scanner, "Entrez le second nombre : ");
			
			// Lecture du choix de l'opération
			int operation = readOperation(scanner);
			
			// Gestion des cas particuliers
			if (operation == 0) {
			System.out.println("Opération annulée.");
			return;
			}
			
			// Calcul du résultat
			float result = calculate(number1, number2, operation);
			System.out.printf("Résultat : %.2f\n", result);
			} catch (ArithmeticException e) {
				System.out.println("Erreur : Division par zéro.");
			} catch (InputMismatchException e) {
				System.out.println("Erreur : Entrée invalide. Veuillez entrer un nombre.");
			}
		}

	/**
	 * Lit un nombre flottant avec validation.
	 */
	public static float readFloat(Scanner scanner, String prompt) {
		System.out.print(prompt);
		return scanner.nextFloat();
	}

/**
 * Lit et valide le choix de l'opération.
 */
	public static int readOperation(Scanner scanner) {
		int operation;
		do {
			System.out.print("Choisissez une opération (0=Annuler, 1=Addition, 2=Soustraction, 3=Multiplication, 4=Division) : ");
			operation = scanner.nextInt();
		} while (operation < 0 || operation > 4);
		return operation;
	}

/**
 * Effectue le calcul en fonction de l'opération choisie.
 */
	public static float calculate(float number1, float number2, int operation) {
		switch (operation) {
			case 1: // Addition
				return number1 + number2;
			case 2: // Soustraction
				return number1 - number2;
			case 3: // Multiplication
				return number1 * number2;
			case 4: // Division
				if (number2 == 0) {
					throw new ArithmeticException("Erreur : Division par zéro.");
				}
				return number1 / number2;
				default:
					throw new IllegalArgumentException("Opération invalide.");
		}
	}
}
