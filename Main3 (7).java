 class Animal
{
    public void eat(){
         System.out.println("i can eat");
         
    }
}
class Dog extends Animal
{
    public void eat()
    {
    super.eat();
    System.out.println(" i eat dog food");
    }
    public void bark(){
        System.out.println("i can bark");
        
    }
} 
class Main3{
    
	public static void main(String[] args)
	{
	Dog labrador = new Dog();
	labrador.eat();
	labrador.bark();
	
	}
}
