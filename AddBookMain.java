
public class AddBookMain {

	public static void main(String[] args) {
		
		DataManager dm = new DataManager();
		
		AddBookControl control = new AddBookControl(dm);
		
		AddBookUI ui = new AddBookUI(control);
		
		
		
		ui.displayAddBookForm();
		
		ui.displayAddBook();
		
	}

}

