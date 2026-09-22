import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
    
        // Registration
        System.out.println("Register your account first");
        System.out.println("********************************************************");
        System.out.print("Username: ");
        String user = o.nextLine();
        System.out.print("Password: ");
        String pass = o.nextLine();
        System.out.println("********************************************************");
            
        // Login Verification
        System.out.println("Welcome to the Login System");
        System.out.println("Please Login ");
        System.out.print("Username: ");
        String username = o.nextLine();
        System.out.print("Password: ");
        String password = o.nextLine();

        if (username.equals(user) && password.equals(pass)) {
            System.out.println("=======================================================");
            System.out.println("Login Successful");
            System.out.println("Welcome, " + username + "!");
            System.out.println("=======================================================");
            
        } else {
            System.out.println("=======================================================");
            System.out.println("Login Failed");
            System.out.println("Invalid username or password. Please try again.");
            System.out.println("=======================================================");
        }

        o.close();
    }
}

// check mo tito otep
// ayos, gumana! hehe