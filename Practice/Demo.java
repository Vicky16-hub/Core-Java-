package Practice;

public interface Demo {
    int test(String s);
}
class Drive{
    public static void main(String[] args) {
        Demo d = (s) -> {return s.length();};
        d.test("Aswanth");
    }
}
