package Generics;

public class Gen <T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public void show(){
        System.out.println("Obj Type: - "+obj.getClass().getName());
    }

    public T print(){
        return obj;
    }
}
