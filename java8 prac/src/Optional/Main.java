package Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Static method
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        String name = null;

        Optional<String> name1 = Optional.ofNullable(name);
        if(name1.isPresent()) {
            System.out.println(name1.get());
        }
        else {
            System.out.println(Optional.empty());
        }

        System.out.println(name1.orElse("Null"));
        System.out.println(name1.orElseGet(()-> "Null")); //Supplier
    }
}
