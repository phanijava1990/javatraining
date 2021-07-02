public abstract class RBI {

    public abstract void deposit();

    public void doSomeThing(){

    }
}

class Sbi extends RBI{

    @Override
    public void deposit() {
        System.out.println("in deposit of sbi");
    }
}

class Hdfc extends RBI{

    @Override
    public void deposit() {
        System.out.println("in deposit of hdfc");
    }
}

class MainCheck{
    public static void main(String[] args) {
        Sbi s=new Sbi();
        s.deposit();
        s.doSomeThing();
        Hdfc h=new Hdfc();
        h.deposit();
        h.doSomeThing();
    }
}