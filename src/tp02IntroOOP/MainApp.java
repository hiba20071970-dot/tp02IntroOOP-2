package tp02IntroOOP;

public class MainApp {

	
	    public static void main(String[] args) {

	        // --- Part 2 ---
	        Book book1 = new Book();
	        book1.setTitle("Clean Code");
	        book1.setAuthor("Robert C. Martin");
	        book1.setPrice(3200.0);
	        book1.setYear(2008);

	        Book book2 = new Book();
	        book2.setTitle("Effective Java");
	        book2.setAuthor("Joshua Bloch");
	        book2.setPrice(4500.0);
	        book2.setYear(2018);

	        System.out.println("=== Book 1 ===");
	        book1.displayInfo();

	        System.out.println("=== Book 2 ===");
	        book2.displayInfo();

	        System.out.println("Book 1 price is: " + book1.getPrice() + " DA");

	        book1.setPrice(2900.0);
	        System.out.println("=== Book 1 after price update ===");
	        book1.displayInfo();


	        // --- Part 3 (Tasks 2 to 4) ---

	        // Task 2: A Third Book That Represents You
	        Book book3 = new Book();
	        book3.setTitle("Atomic Habits");
	        book3.setAuthor("James Clear");
	        book3.setPrice(2500.0);
	        book3.setYear(2018);

	        System.out.println("=== Book 3 (My Favorite Book) ===");
	        book3.displayInfo();

	        // Task 3: Explore Encapsulation — Private Access Error
	        // book1.title = "Hacked!";
	        // Explanation: This compile-time error is a feature, not a bug, because encapsulation protects private attributes from direct unauthorized changes.

	        // Task 4: Modify a Book's Price via Setter
	        book2.setPrice(3999.0);
	        System.out.println("=== Book 2 after price update ===");
	        book2.displayInfo();
	    }
	

	        // F. Try to access a private field directly (UNCOMMENT TO SEE ERROR)
	        // book1.price = 5.0;  // Compile error: price has private access in Book
	    }
	
	    
	

