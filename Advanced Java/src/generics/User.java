package generics;

public class User implements Comparable<User> {
    private final int point;

    public User(int point) {
        this.point = point;
    }

    @Override
    public int compareTo(User otherUser) {
        return point - otherUser.point;
    }

    @Override
    public String toString() {
        return "Point=" + point;
    }
}
