class SuperClass {
    int num;

    public SuperClass(int num) {
        this.num = num;
        System.out.println("SuperClass constructor called. Value: " + num);
    }

    public void display() {
        System.out.println("SuperClass display method. num = " + num);
    }
}

class SubClass extends SuperClass {
    int num;

    public SubClass(int num) {
        super(num);
        this.num = num;
        System.out.println("SubClass constructor called. Value: " + num);
    }

    public void display() {
        System.out.println("SubClass display method. num = " + num);
    }

    public void showSuperClassNum() {
        System.out.println("SuperClass num from SubClass: " + super.num);
    }
}

public class MainDispaly {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100);
        obj.display();
        obj.showSuperClassNum();
    }
}
