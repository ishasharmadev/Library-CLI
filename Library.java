import java.util.Scanner;

class BookDetails extends Library{
    int choice;
    Scanner sc = new Scanner(System.in);

    BookDetails(){
        bookMenu();
    }

    void bookMenu(){
        System.out.println("1. Find a book");
        System.out.println("2. Rent a book");
        System.out.println("3. Add a book");
        System.out.println("4. Delete a book");
        choice = sc.nextInt();
        sc.close();

        switch(choice){
            case 1 : 
                findBook();
                break;

            case 2 : 
                rentBook();
                break;

            case 3 :
                addBook();
                break;

            case 4 : 
                deleteBook();
                break;

            default :
                System.out.println("Enter a valid choice : ");
                bookMenu();
                break;
        }
    }

    void findBook(){

    }

    void addBook(){

    }

    void deleteBook(){

    }

    void rentBook(){

    }
}

class UserDetails extends Library{
    int choice;
    Scanner sc = new Scanner(System.in);

    UserDetails(){
        userMenu();
    }

    void userMenu(){
        System.out.println("1. Find a user");
        System.out.println("2. Add a user");
        System.out.println("3. Delete a user");
        System.out.println("4. View pending dues");
        choice = sc.nextInt();
        sc.close();

    switch(choice){
            case 1 : 
                findUser();
                break;

            case 2 : 
                addUser();
                break;

            case 3 :
                deleteUser();
                break;

            case 4 : 
                viewPendingDues();
                break;

            default :
                System.out.println("Enter a valid choice : ");
                userMenu();
                break;
        }
    }
    
    void findUser(){

    }

    void addUser(){

    }

    void deleteUser(){

    }

    void viewPendingDues(){

    }
}

public class Library{
    public void displayMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do today? ");
        System.out.println("1. View Books");
        System.out.println("2. View Users");
        int choice = sc.nextInt();
        sc.close();
        
        
        switch(choice){
            case 1: 
                BookDetails bd = new BookDetails();
                break;

            case 2 : 
                UserDetails ud = new UserDetails();
                break;
        }
    }

    public boolean validate(String username, String password){
        return true;
    }

    public void adminLogin(String username, String password){
        Scanner sc = new Scanner(System.in);
        System.out.println("Username : ");
        username = sc.nextLine();
        System.out.println("Password : ");
        password = sc.nextLine();
        sc.close();

        //validate username & password
        boolean areCredentialsRight = validate(username, password);
        if(areCredentialsRight == true){
            //authorize access
            System.out.println("Welcome " + username);
            displayMenu();
        }
        else{
            System.out.println("Looks like the credentials you entered are incorrect. Please try again");
            adminLogin(username, password);
        }

        //
    }

    /**
     * @param args
     */
    public static void main(String args[]){
        String username = "", password = "";
        Library lib = new Library();
        lib.adminLogin(username, password);
    }

    
}