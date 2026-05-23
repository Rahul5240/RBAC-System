// User.java
public abstract class User {
    private final String userId;
    private final String name;
    private final Role role; // Polymorphism & Composition

    public User(String userId, String name, Role role) {
        this.userId = userId;
        this.name = name;
        this.role = role;
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public Role getRole() { return role; }

    // Common behavior for all users
    public boolean canAccess(Permission permission) {
        return this.role.hasPermission(permission);
    }

    // Abstract method: Every specific user type must define their own onboarding welcome message
    public abstract void displayDashboard();
}