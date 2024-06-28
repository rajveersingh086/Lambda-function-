// Rajveer singh
@FunctionalInterface
interface V {
    void show (int i );
}
public class lamda {
    public static void main(String[] args) {
        V obj = i -> System.out.println("in show " + i);
        obj.show(8);
    }
}
