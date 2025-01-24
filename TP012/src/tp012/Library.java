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
		for(Book kElement : this.kBooks) {
			if(kElement.GetAvailable()) {
				System.out.println(" - "+kElement.GetTitle()+" ("+kElement.GetAuthor()+", "+kElement.GetPublication()+")");
			}
		}
	}
	public void EmptyLibray() {
		if(this.kBooks.isEmpty()) System.out.println("La librairie est vide, ajouter un livre pour commencer");
	}
}
