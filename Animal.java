class Animal{
     void makeSound()
     {

     };
}
class Dog extends Animal {
    public void makeSound()
    {
        System.out.println("Vhuu.... Vhuu....");
    }
}
class Cat extends Animal {
    public void makeSound()
    {
        System.out.println("Meuu.... Meuu....");
    }
}
class Cow extends Animal {
    public void makeSound()
    {
        System.out.println("Humbaaaaaaa....");
    }
}
    public class Main {
        public static void main(String[] args) {
            Animal DO = new Dog();
            Animal CA = new Cat();
            Animal CO = new Cow();
            DO.makeSound();
            CA.makeSound();
            CO.makeSound();
        }
    }

