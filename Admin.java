import java.util.ArrayList;

class Admin extends User {
    ArrayList<User> registeredUsers;

    public Admin(ArrayList<User> registeredUsers) {
        super("Admin", "admin", "Admin123", "Admin");
        this.registeredUsers = registeredUsers; // Dependency Injection
    }

    public Admin(String name, String userName, String password, String role) {
        super(name, userName, password, role);
        this.registeredUsers = new ArrayList<>();
    }

    public void displayAllUsers() {
        for (int i = 0; i < registeredUsers.size(); i++) {
            System.out.println(registeredUsers.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Admin. ";
    }
}
