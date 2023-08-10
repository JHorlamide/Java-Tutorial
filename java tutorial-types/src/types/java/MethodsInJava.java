package types.java;

public class MethodsInJava {
    public static void main(String[] args) {
        String helloMessage = greetUser("Olamide", "Jubril");
        System.out.println(helloMessage);
    }

    public static String greetUser(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}