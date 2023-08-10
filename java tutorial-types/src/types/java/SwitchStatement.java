package types.java;

public class SwitchStatement {
    public static void main(String[] args) {
        String userRole = "admin";

        switch (userRole) {
            case "admin" -> System.out.println("You are an admin user");
            case "management" -> System.out.println("You are a management user");
            case "support" -> System.out.println("You are a support user");
            default -> System.out.println("You are default user");
        }
    }
}
