package tp02IntroOOP;

public class Book {
	

	    // 1. Private Attributes (Encapsulation)
	    private String title;
	    private String author;
	    private double price;
        private int year; // Task 1: Added year attribute
        
	    // 2. Getters (public read access)
	    public String getTitle()  { return title; }
	    public String getAuthor() { return author; }
	    public double getPrice()  { return price; }
        public int getYear() { return year; } // Task 1: Getter for year
        
	    // 3. Setters (public write access)
	    public void setTitle(String title)   { this.title  = title; }
	    public void setAuthor(String author) { this.author = author; }
	    public void setPrice(double price)   { this.price  = price; }
        public void setYear(int year) { this.year = year; } // Task 1: Setter for year
        
	    // 4. Behavior
	    public void displayInfo() {
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	        System.out.println("Price  : " + price + " DA");
	        System.out.println("Year   : " + year); // Task 1: Print year
	        System.out.println("------------------------------");
	    }
	
	   
	    }
	

