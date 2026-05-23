// ManagerUser.java
public class ManagerUser extends User {
    public ManagerUser(String userId, String name) {
        super(userId, name, Role.MANAGER);
    }

    @Override
    public void displayDashboard() {
        System.out.println(" MANAGER DASHBOARD ");
        System.out.println("Welcome, " + getName() + ". Reviewing team performance metrics");
    }
}