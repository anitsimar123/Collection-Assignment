package Q5;
 public class Main  implements Interf1,Interf2{

    @Override
    public void abc() {
        Interf1.super.abc();
        Interf2.super.abc();
    }

        public static void main(String[] args) {
            Main main = new Main();
            main.abc();
        }
    }
