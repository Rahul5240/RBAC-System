// AccessControlEngine.java
import java.util.HashMap;
import java.util.Map;

public class AccessControlEngine {
    private final Map<String, User> userDatabase = new HashMap<>();

    public void registerUser(User user) {
        userDatabase.put(user.getUserId(), user);
        System.out.println("Registered system user: " + user.getName() + " [" + user.getRole() + "]");
    }

    public void executeOperation(String userId, Permission permission, Runnable operation) {
        User user = userDatabase.get(userId);

        if (user == null) {
            System.out.println("ACCESS DENIED: User ID '" + userId + "' not found in the system.");
            return;
        }

        // Evaluating permissions dynamically (Polymorphism)
        if (user.canAccess(permission)) {
            System.out.print(" ACCESS GRANTED [" + user.getName() + " - " + user.getRole() + "]: ");
            operation.run(); // Execute the task
        } else {
            System.out.println(" ACCESS DENIED [" + user.getName() + " - " + user.getRole() + "]: Cannot perform operation " + permission);
        }
    }
}