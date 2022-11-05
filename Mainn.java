package Biblio;

import java.util.Scanner;
public class Mainn {
    public static void main(String[] args) {
        Study Study = new Study();
        Mechanism mechanism = new Mechanism(Study);

        mechanism.mechanismCome();

        System.out.println("Welcome to AITU bookstore");

        Factory factory = new Factory();
        Library Head_First_Java = factory.create("Head_First_Java");
        Library Philosophy_Java = factory.create("Philosophy_Java");
        Head_First_Java.choose();
        Philosophy_Java.choose();

        String[] books = new String[]{"Head_First_Java","philosophy_Java","Learn_Java","start_with_us"};

        printMenu();
        Scanner console = new Scanner(System.in);

        System.out.println("Enter menu number");
        int menuNum =console.nextInt();

        while(true){
            if(menuNum == 1){
                printAllBooks(books);
            }
            else if(menuNum==2){
                books=addBook(console,books);
            }
            else if(menuNum ==3){
                books=removeBook(console,books);
            }

            else if (menuNum == 4) {
                books=characteristicBook(console,books);
            }
            else if (menuNum == 5) {
                books=downloadBook(console, books);
            }

            else if(menuNum == 0){
               books=exitBook(console, books);
                System.exit(0);
            }
            System.out.println("Enter menu number");
            menuNum=console.nextInt();
        }
    }



    private static String[] characteristicBook(Scanner console, String[] books) {

        Book book = new Book.Builder("Head_First_Java").setColor("blue").setMaxPage(500).publish();
        System.out.println(book . getName());
        System.out.println(book . getColor());
        System.out.println(book . getMaxPage());
        String inputbook = console.next();
        return books;
    }

    private static String[] downloadBook(Scanner console, String[] books) {
        Project project = new Proxy("https://www.oreilly.com/library/view/head-first-java/9781492091646/");
        project.run();
        return books;
    }

    private static String[] exitBook(Scanner console, String[] books) {
        Exit Exit = Biblio.Exit.getInstance();
        Exit Exit2 = Exit.getInstance();
        System.out.println(Exit2.i);

        return books;
    }





    private static String[] removeBook(Scanner console, String[] books) {
        System.out.println("Enter book title");
        String inputbook = console.next();
        String[] resArray = new String[books.length - 1];

        int delIndex = 0;
        for (int i = 0; i < books.length; i++) {

            if (!books[i].equals(inputbook)) {
                resArray[i]=books[i];
            }
            else{
                delIndex=i;
                break;
            }

            resArray[delIndex] = books[delIndex];
        }

        for(int i =delIndex;i<resArray.length;i++){
            resArray[i] = books[i+1];

        }
        return resArray;
    }




    private static String[] addBook(Scanner console, String[] books) {
        System.out.println("Enter book title");
        String inputBook = console.next();
        String[] resArray = new String[books.length + 1];

        for (int i = 0; i<books.length;i++){
            resArray[i]=books[i];
        }
        resArray[books.length]=inputBook;
        return resArray;
    }

    private static void printAllBooks(String[] books) {
        System.out.println("Our books:");
        for(int i=0;i<books.length;i++){
            System.out.println(books[i]+"");
        }
    }

    public static void printMenu(){
        System.out.println("Menu:\n"+
                "1. Display all books\n" +
                "2. Add books\n" +
                "3. Delete books\n" +
                "4. Characteristic Books\n" +
                "5. Downloading\n" +
                "0. Exit ");
    }
}
