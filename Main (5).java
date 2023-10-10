/*
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
}*/

class Shape {
    public double area() {
        return 0.0; // Default implementation for area
    }
    
    public double perimeter() {
        return 0.0; // Default implementation for perimeter
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius; // Override area for circle
    }

    
    public double perimeter() {
        return 2 * Math.PI * radius; // Override perimeter for circle
    }
}


class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

  
    public double area() {
        return side * side; 
    }

  
    public double perimeter() {
        return 4 * side; 
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}