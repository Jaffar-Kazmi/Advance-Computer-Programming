import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Library Management System---");

        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();

        boolean runAgain = true;
        do {

            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Sort Books By Id");
            System.out.println("6. Exit");
            System.out.print("\nPlease Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter book id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter book name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter book category: ");
                    String category = sc.nextLine();
                    b1.addBook(id, name, author, category);
                    break;
                case 2:
                    b1.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book Id to search: ");
                    int search = sc.nextInt();
                    b1.searchBook(search);
                    break;
                case 4:
                    b1.viewBooks();
                    System.out.print("Enter Book Id to update: ");
                    int update = sc.nextInt();
                    b1.updateBook(update);
                    break;
                case 5:
                    b1.sortBooks();
                    break;
                case 6:
                    runAgain = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }while(runAgain);


    }
}