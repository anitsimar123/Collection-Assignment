public class Main  implements Interf2{

//    @Override
//    public void abc() {
//        Interf1.super.abc();
//        Interf2.super.abc();
//        super.abc();
//    }

    static void hello(){
        System.out.println("rr");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.abc();
//        System.out.println(main.hashCode());
          Interf1.hello();
          hello();
    }
    Thread
}