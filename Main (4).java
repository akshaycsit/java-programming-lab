
class Parent {
    void display() {
        System.out.println("This is the parent class");
    }

    void show(int num) {
        System.out.println("The number in the parent class is: " + num);
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the child class");
    }

    void show(double num) {
        System.out.println("The number in the child class is: " + num);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Parent childObj = new Child();
        
        parentObj.show(5);    
        childObj.show(7);   

        
        parentObj.display();  
        childObj.display();   
    }
}