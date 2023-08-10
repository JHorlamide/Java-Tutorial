package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void show() {
        var account = new Account();
//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            System.out.println("Error message logged");
//            throw e;
//        }

        try {
            account.withdraw(100);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }

    public static void readFile() {
        // The Java compiler will close the resource for use.
        // In this case our resource is the file.
        // NOTE: for this to work, the resource class should implement
        // the AutoClosable interface
        try (var fileReader = new FileReader("file.txt")) {
            var value = fileReader.read();
            System.out.println("File open");
        } catch (IOException e) {
            System.out.println("Could not read file");
        }
    }
}
