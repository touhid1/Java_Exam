class Animal {
void sound() {
System.out.println("Animal sound");
}
}
class Dog extends Animal {
void sound() {
System.out.println("Dog barks");
}
void bark() {
System.out.println("Barking loudly");
}
}
public class Main {
public static void main(String[] args) {
Animal a = new Dog();
a.sound();
Dog d = (Dog) a;
d.bark();


}
}