// Interface : special type of class

public interface Car {
    void run();
}

interface Car1{
    void engine();
}

class Bmw implements Car,Car1{

    @Override
    public void run() {
        System.out.println("Bmw runs smoothly");
    }

    @Override
    public void engine() {
        System.out.println("Bmw has powerful engine");
    }
}