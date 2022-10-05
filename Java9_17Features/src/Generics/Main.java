package Generics;

public class Main {

    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<>(20);
        g1.show();
        System.out.println(g1.print());

        Gen<String> g2 = new Gen<>("Amrit");
        g2.show();
        System.out.println(g2.print());
    }
}
