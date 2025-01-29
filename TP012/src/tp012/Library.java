package tp012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Library {
	ArrayList<Book> kBooks;
	HashMap<String, Integer> kSearchBook;

	public Library() {
		this.kBooks = new ArrayList<>();
		this.kSearchBook = new HashMap<>();
	}
	public void AddBook(Scanner kValue) {
		Book NewBook = new Book();
		System.out.printf("Entrez le titre du livre : ");
		NewBook.SetTitle(kValue.nextLine());
		System.out.printf("Entrez l'auteur du livre : ");
		NewBook.SetAuthor(kValue.nextLine());
		System.out.printf("Entrez l'année de publication : ");
		NewBook.SetPublication(kValue.nextInt());
		kValue.nextLine();
		NewBook.SetAvailable(true);
		this.kBooks.add(NewBook);
		this.kSearchBook.put(NewBook.GetTitle(), this.kBooks.size() - 1);
	}
	public void RemoveBook() {
		
	}
	public void DisplayBookAvailable() {
		int kk=0;
		if(!this.EmptyLibray()){
			for(Book kElement : this.kBooks) {
				if(kElement.GetAvailable()) {
					System.out.printf(" - %s (%s, %s)\n",kElement.GetTitle(),kElement.GetAuthor(),kElement.GetPublication());
					kk++;
				}
			}
			if(kk==0) System.out.println("Désolé tous les livres sont empruntés.");
		}
	}
	private boolean EmptyLibray() {
		if(this.kBooks.isEmpty()) {
			System.out.println("La librairie est vide, ajouter un livre pour commencer");
			return true;
		}
		return false;
	}
	public void BorrowBook(Scanner kValue) {
		Integer idBook;
		if((idBook=this.kSearchBook(kValue)) != null) {
			System.out.printf("Le livre %s a été emprunté avec succès.\n",this.kBooks.get(idBook).GetTitle());
			this.kBooks.get(idBook).SetAvailable(false);
		}
	}
	public void ReturnBook(Scanner kValue) {
		Integer idBook;
		if((idBook=this.kSearchBook(kValue)) != null) {
			System.out.println("le livre a été rendu");
			this.kBooks.get(idBook).SetAvailable(true);
		}
	}
	public void SearchBook(Scanner kValue) {
		Integer idBook;
		if((idBook=this.kSearchBook(kValue)) != null) {
			System.out.println("Le livre existe dans notre libraire :");
			System.out.printf(" - %s (%s, %s)\n",this.kBooks.get(idBook).GetTitle(),this.kBooks.get(idBook).GetAuthor(),this.kBooks.get(idBook).GetPublication());
			System.out.printf(" Le livre est actuellement ");
			if(!this.kBooks.get(idBook).GetAvailable()) System.out.printf("in");
			System.out.printf("disponible\n");
		}
	}
	private Integer kSearchBook(Scanner kValue) {
		Integer idBook=null;
		if(!this.EmptyLibray()) {
			System.out.printf("Entrez le titre du livre : ");
			if((idBook = this.kSearchBook.get(kValue.nextLine())) == null) {
				System.out.println("Désolé, le livre cherché n'existe pas");				
			}
		}
		return idBook;
	}
}
