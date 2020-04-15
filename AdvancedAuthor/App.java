package AdvancedAuthor;

public class App {

	public static void main(String[] args) {
		Author authors[] = new Author[3];
		
		 authors[0] = new Author("Jo Po", 21, "JoPo@gmail.com", 'm');
		 authors[1] = new Author("JoJo McQween", 19, "JoJoMcQween@gmail.com", 'm');
		 authors[2] = new Author("Alexandro", 32, "AlexabdroAlxandro@gmail.com", 'm');
		
		Book book1 = new Book(authors, "Keyboard advanture's", 30, 2000);
		System.out.println(book1.toString());
		

	}

}
