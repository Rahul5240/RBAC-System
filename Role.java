// Role.java
import java.util.Set;

public enum Role {
    ADMIN(Set.of(Permission.READ_DATA, Permission.WRITE_DATA, Permission.DELETE_DATA, Permission.MANAGE_USERS)),
    MANAGER(Set.of(Permission.READ_DATA, Permission.WRITE_DATA)),
    EMPLOYEE(Set.of(Permission.READ_DATA));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public boolean hasPermission(Permission permission) {
        return this.permissions.contains(permission);
    }
}