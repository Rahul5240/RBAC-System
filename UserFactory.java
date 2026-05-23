// UserFactory.java
public class UserFactory {
    public static User createUser(String type, String userId, String name) {
        if (type == null) return null;
        
        switch (type.toUpperCase()) {
            case "ADMIN":
                return new AdminUser(userId, name);
            case "MANAGER":
                return new ManagerUser(userId, name);
            default:
                throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}