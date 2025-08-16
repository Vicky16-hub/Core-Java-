package Practice;

public interface mrngpract {
     int a(String s);
}
class Driver {
    public void demo(mrngpract m) {
        System.out.println(m.a("mani"));
    }
    public static void main(String[] args) {
        Driver d = new Driver();
      d.demo((n)->n.length());
            }
        }
