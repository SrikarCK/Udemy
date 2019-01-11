package PolymorphismEx;

class Car {
    private boolean engine;
    private String cylinders;
    private int wheels;
    private String name;

    public Car(String cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }
    public String startEngine(){
        return getClass().getSimpleName() +" -----> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName() +" ----> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName() +" -----> brake()";
    }
    public String getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Bmw extends Car{

    public Bmw(String cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
         return getClass().getSimpleName() +" -----> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -----> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -----> brake()";
    }
}

class Audi extends Car{

    public Audi(String cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" -----> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -----> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -----> brake()";
    }
}

class Benz extends Car{

    public Benz(String cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" -----> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -----> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -----> brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        Audi A4 = new Audi("v8","A4");
        System.out.println(A4.getName());
        System.out.println(A4.startEngine());
        System.out.println(A4.accelerate());
        System.out.println(A4.brake());

        Bmw x3 = new Bmw("v8","X-3");
        System.out.println(x3.startEngine());
        System.out.println(x3.accelerate());
        System.out.println(x3.brake());
    }
}