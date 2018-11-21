package solid;
import java.io.File;

public class Program {

	public static void main(String[] args) {
		ShoppingList list = new ShoppingList();
		list.addEntry("Bananen");
		list.addEntry("Äpfel");
		list.addEntry("Gurke");
		
		//list.saveToFile(list.getEntries(), new File("einkaufsliste.txt"));
		Persistence p = new Persistence();
		p.saveToFile(list.getEntries(), new File("einkaufsliste2.txt"));

	}

}
