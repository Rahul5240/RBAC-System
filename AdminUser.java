// AdminUser.java
public class AdminUser extends User {
    public AdminUser(String userId, String name) {
        super(userId, name, Role.ADMIN);
    }

    @Override
    public void displayDashboard() {
        System.out.println(" ADMIN DASHBOARD ");
        System.out.println("Welcome, " + getName() + ". System Health: OK. Total Users: 142.");
    }
}

