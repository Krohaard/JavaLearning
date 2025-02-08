/**
 * 
 */
package tp010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * 
 */
public class TP010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> kRandList;
		kRandList = kRandomList(10,1,100);
		try {
			System.out.println("Liste originale : " + kRandList);
			System.out.println("Plus grand : " + kMaxList(kRandList));
			System.out.println("Plus petit : " + kMinList(kRandList));
			System.out.println("Somme : " + kSumList(kRandList));
			System.out.println("Moyenne : " + kMeanList(kRandList));
			System.out.println("Liste après suppression des nombres pairs : " + kRemoverEven(kRandList));
		} catch(Exception e) {
			System.err.println("Une erreur s'est produite : " + e.getMessage());
		}
	}
	/**
	 * Génère une liste de nombres aléatoires dans une plage donnée.
	 * 
	 * @param count  Nombre d'éléments dans la liste
	 * @param min    Borne inférieure des nombres générés
	 * @param max    Borne supérieure des nombres générés
	 * @return Une liste d'entiers aléatoires
	 */
	public static ArrayList<Integer> kRandomList(int kNumber,int kMin,int kMax){
		int kk;
		ArrayList<Integer> kList;
		Random kRandom;

        if (kNumber <= 0) {
            throw new IllegalArgumentException("Le nombre d'éléments doit être positif.");
        }
        if (kMin > kMax) {
            throw new IllegalArgumentException("La borne inférieure doit être inférieure ou égale à la borne supérieure.");
        }
		kList = new ArrayList<>();
		kRandom = new Random();
		for(kk=0;kk<kNumber;kk++) {
			kList.add(kMin + kRandom.nextInt(kMax - kMin + 1));
		}
		return kList;
	}
	/**
	 * Trouve le plus petit nombre dans une liste.
	 * 
	 * @param numbers Liste d'entiers
	 * @return Le plus petit entier
	 */
	public static int kMinList(ArrayList<Integer> kData) {
		if (kData.isEmpty()) {
		    throw new IllegalArgumentException("La liste est vide.");
		}
		return Collections.min(kData);
	}
	/**
	 * Trouve le plus grand nombre dans une liste.
	 * 
	 * @param numbers Liste d'entiers
	 * @return Le plus grand entier
	 */
	public static int kMaxList(ArrayList<Integer> kData) {
		if (kData.isEmpty()) {
		    throw new IllegalArgumentException("La liste est vide.");
		}
		return Collections.max(kData);
	}
	/**
	 * Calcule la somme des éléments d'une liste.
	 * 
	 * @param numbers Liste d'entiers
	 * @return La somme des entiers
 */
	public static int kSumList(ArrayList<Integer> kData) {
		if (kData.isEmpty()) {
		    throw new IllegalArgumentException("La liste est vide.");
		}
		return kData.stream().mapToInt(Integer::intValue).sum();
	}
	/**
	 * Calcule la moyenne des éléments d'une liste en utilisant les Streams.
	 * 
	 * @param numbers Liste d'entiers
	 * @return La moyenne des entiers
	 */
	public static float kMeanList(ArrayList<Integer> kData) {
		if (kData.isEmpty()) {
		    throw new IllegalArgumentException("La liste est vide.");
		}
		return (float) kSumList(kData)/kData.size();
	}
	/**
	 * Supprime les nombres pairs d'une liste.
	 * 
	 * @param numbers Liste d'entiers
	 * @return Une nouvelle liste contenant uniquement les nombres impairs
	 */
	public static ArrayList<Integer> kRemoverEven(ArrayList<Integer> kData){
		Iterator<Integer> cloneData = kData.iterator();
		while (cloneData.hasNext()) {
		    if (cloneData.next() % 2 == 0) {
		    	cloneData.remove();
		    }
		}
		return kData;
	}
}
