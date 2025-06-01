// Write a program to create a class called animal with a method named move, create a subclass called cheetah that overwrites the move method to run. 
import java.util.*;
class animalClass{
    public void move() {
        System.out.println("Animal is Moves");
    }
}
class cheetah extends animalClass{
    public void move(){
        System.out.println("Cheetah is Moving");
    }
}
public class Animal{
    public static void main(String[] args) {
        animalClass ani = new animalClass();
        ani.move();
        cheetah chee = new cheetah();0
        chee.move();
    }
} 











