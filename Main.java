import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        Admin admin = new Admin(hospital.getUsers());//Dependency Injection for Admin class to give access to getUsers function.

        boolean flag = true;
        while(flag)
        {
            System.out.println("**************************");
            System.out.println("Hospital Management System");
            System.out.println("**************************");

            System.out.println("Enter 1 for Registration.");
            System.out.println("Enter 2 for Patient Login.");
            System.out.println("Enter 3 for Doctor Login.");
            System.out.println("Enter 4 for Admin Login.");
            System.out.println("Enter 5 to Exit.");
            System.out.println("Enter your choice: ");

            int userChoice = sc.nextInt();
            switch(userChoice)
            {
                case 1:
                    hospital.registerUser(sc);
                    break;
                
                case 2:
                    System.out.println("Patient Option Selected.");
                    System.out.println("Enter your UserName: ");
                    String patientUserName = sc.next();
                    System.out.println("Enter your Password: ");
                    String patientPassword = sc.next();
                    
                    User verifiedPatient = hospital.verifyPatient(patientUserName, patientPassword);
                    if(verifiedPatient != null)
                    {
                        System.out.println("Patient verified. Welcome " + verifiedPatient.getName());
                    }
                    else
                        System.out.println("Invalid login details for Patient.");
                    break;
                
                case 3:
                    System.out.println("Doctor Option Selected.");
                    System.out.println("Enter your UserName: ");
                    String doctorUserName = sc.next();
                    System.out.println("Enter your Password: ");
                    String doctorPassword = sc.next();
                    
                    User verifiedDoctor = hospital.verifyDoctor(doctorUserName, doctorPassword);
                    if(verifiedDoctor != null)
                    {
                        System.out.println("Doctor verified. Welcome " + verifiedDoctor.getName());
                    }
                    else
                        System.out.println("Invalid login details for Doctor.");
                    break;
                
                case 4:
                    System.out.println("Admin Option Selected.");
                    System.out.println("Enter your UserName: ");
                    String adminUserName = sc.next();
                    System.out.println("Enter your Password: ");
                    String adminPassword = sc.next();
                    
                    User verifiedAdmin = hospital.verifyAdmin(adminUserName, adminPassword);
                    if(verifiedAdmin != null)
                    {
                        System.out.println("Admin verified. Welcome " + verifiedAdmin.getName());
                        System.out.println("Enter 1 to view all registered Users.");
                        int adminChoice = sc.nextInt();
                        switch(adminChoice)
                        {
                            case 1:
                                admin.displayAllUsers();
                                break;
                            default:
                                System.out.println("Please Enter a valid choice.");
                        } 
                    }
                    else
                        System.out.println("Invalid login details for Admin.");
                    break;
                
                case 5: 
                    flag = false;
                    System.out.println("Thank you visit again!");
                default:
                    System.out.println("Invalid Option. Please enter a valid choice");
            }
        }
    }
}