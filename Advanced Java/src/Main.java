import generics.GenericList;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        for (var item : list) {
            System.out.println(item);
        }
    }
}