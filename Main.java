// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccessControlEngine securityEngine = new AccessControlEngine();

        // 1. Pre-registering some users using our Factory
        User Ali = UserFactory.createUser("admin", "U001", "Ali");
        User Rahul = UserFactory.createUser("manager", "U002", "Rahul");
        
        securityEngine.registerUser(Ali);
        securityEngine.registerUser(Rahul);

        System.out.println("  WELCOME TO THE RBAC SYSTEM CLI ");
        

        // 2. Interactive Loop
        while (true) {
            System.out.println("\nAvailable Users in System:");
            System.out.println("1. U001 - Ali (ADMIN)");
            System.out.println("2. U002 - Rahul (MANAGER)");
            System.out.println("Type 'exit' to close the application.");
            
            System.out.print("\nEnter User ID to log in: ");
            String userId = scanner.nextLine().trim();

            if (userId.equalsIgnoreCase("exit")) {
                System.out.println("Shutting down security system. Goodbye!");
                break;
            }

            if (!userId.equals("U001") && !userId.equals("U002")) {
                System.out.println(" Error: Invalid User ID. Please try again.");
                continue;
            }

            System.out.println("\nSelect an action to execute:");
            System.out.println("1. READ DATA");
            System.out.println("2. WRITE DATA");
            System.out.println("3. DELETE DATA");
            System.out.println("4. MANAGE USERS");
            System.out.print("Choose option (1-4): ");
            
            String choice = scanner.nextLine().trim();
            Permission requestedPermission = null;

            switch (choice) {
                case "1":
                    requestedPermission = Permission.READ_DATA;
                    break;
                case "2":
                    requestedPermission = Permission.WRITE_DATA;
                    break;
                case "3":
                    requestedPermission = Permission.DELETE_DATA;
                    break;
                case "4":
                    requestedPermission = Permission.MANAGE_USERS;
                    break;
                default:
                    System.out.println(" Error: Invalid option selected.");
                    continue; 
            }

            final Permission permToTest = requestedPermission; 
            securityEngine.executeOperation(userId, requestedPermission, () -> {
                System.out.println("Operation [" + permToTest + "] executed successfully!");
            });
        }

        scanner.close();
    }
}