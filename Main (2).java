/*class Data {
    
    private String name;

    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Data d = new Data();

        d.setName("akshay jain");

        String dataName = d.getName();

        System.out.println("Name: " + dataName);
    }
}


 class Animal
{
    protected String name;
    protected void display()
    {
         System.out.println("I am an animal");
    }
    
}
class Dog extends Animal
{
	public static void main(String[] args)
	{
	    Dog dog= new Dog();
	    dog.display();
		dog.name = "java";
		 System.out.println(dog.name);
		 
	}
}

    
class Animal{
    public int legCount;
    public void display()
    {
         System.out.println("I am an animal");
          System.out.println("I have "+legCount+"legs.");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Animal animal = new Animal();
	    animal.legCount = 4;
	    animal.display();
		
	}
}*/

class Animal {
    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }

    public void bark() {
        System.out.println("I can bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

