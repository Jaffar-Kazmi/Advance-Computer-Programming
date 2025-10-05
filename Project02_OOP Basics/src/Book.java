import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String author;
    private String category;

    private ArrayList<Book> books = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    Book(){
        this(0,"","","");
    }

    Book(int id, String name, String author, String category ){
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    void  setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

    void  setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void  setAuthor(String author){
        this.author = author;
    }

    String getAuthor(){
        return author;
    }

    void  setCategory(String category){
        this.category = category;
    }

    String getCategory(){
        return category;
    }

    void addBook(int id, String name, String author, String category){
        books.add(new Book(id, name, author, category));
        System.out.println("Book added successfully.\n");
    }

    void viewBooks(){
        if(books.isEmpty()){
            System.out.println("No Books.");
            return;
        }
        System.out.println("-------------All Books-------------");
        for(Book b : books) {
            System.out.println("Book id: " + b.id);
            System.out.println("Book name: " + b.name);
            System.out.println("Book author: " + b.author);
            System.out.println(("Book category: " + b.category));
            System.out.println("--------------------------------");
        }
    }

    void searchBook(int search){
        boolean found = false;
        for (Book b : books){
            if(b.getId() == search){
                found = true;
                System.out.println("Book is found.");
                System.out.println("Book id: " + b.id);
                System.out.println("Book name: " + b.name);
                System.out.println("Book author: " + b.author);
                System.out.println(("Book category: " + b.category));
                System.out.println("--------------------------------");
            }
        }

        if(!found){
            System.out.println("Book not found.");
        }
    }

    void updateBook(int update){
        if(books.isEmpty()){
            System.out.println("No Books");
            return;
        }

        boolean found = false;

        for (Book b : books) {
            if(b.getId() == update){
                found = true;
                while (true) {
                    System.out.println("Choose what you want to update: ");
                    System.out.println("1. Update Id.");
                    System.out.println("2. Update Name.");
                    System.out.println("3. Update Author.");
                    System.out.println("4. Update Category.");
                    System.out.println("5. Return to Main Menu");
                    System.out.print("\nEnter your choice: ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter new id: ");
                            int newId = sc.nextInt();
                            b.setId(newId);
                            break;
                        case 2:
                            System.out.print("Enter new name: ");
                            sc.nextLine();
                            String newName = sc.nextLine();
                            b.setName(newName);
                            break;
                        case 3:
                            System.out.print("Enter new author: ");
                            sc.nextLine();
                            String newAuthor = sc.nextLine();
                            b.setAuthor(newAuthor);
                            break;
                        case 4:
                            System.out.print("Enter new category: ");
                            sc.nextLine();
                            String newCategory = sc.nextLine();
                            b.setCategory(newCategory);
                            break;
                        case 5:
                            return;
                        default:
                            System.out.println("Invalid choice");
                    }
                }
            }
        }
    }

    void sortBooks(){

    }



}
