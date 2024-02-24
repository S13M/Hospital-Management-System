import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private ArrayList<User> users = new ArrayList<User>();

    public void registerUser(Scanner sc) {
        System.out.println("Enter your Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter your Username: ");
        String userName = sc.next();
        System.out.println("Enter your Password: ");
        String password = sc.next();

        // Print available user types
        System.out.println("Available User Types:");
        System.out.println("1. Patient");
        System.out.println("2. Doctor");
        System.out.println("3. Admin");
        System.out.println("Enter User Type (1/2/3): ");
        
        int userTypeChoice = sc.nextInt();
        String role;

        switch (userTypeChoice) {
            case 1:
                role = "Patient";
                break;
            case 2:
                role = "Doctor";
                break;
            case 3:
                role = "Admin";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Patient.");
                role = "Patient";
        }

        User newUser = new User(name, userName, password, role);
        users.add(newUser);
        System.out.println("User Registered Successfully!");
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User verifyPatient(String userName, String password) {
        for (User user : users) {
            if (user instanceof Patient && user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Patient not found
    }

    public User verifyDoctor(String userName, String password) {
        for (User user : users) {
            if (user instanceof Doctor && user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Doctor not found
    }

    public User verifyAdmin(String userName, String password) {
        for (User user : users) {
            if (user instanceof Admin && user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Admin not found
    }
}
