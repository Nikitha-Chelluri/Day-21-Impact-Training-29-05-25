// Hierarchy Inheritence *

import java.util.*;
class parent {
    void display(){
        System.out.println("Parent class");
    }
}
class child1 extends parent {
    void displaychild1() {
        System.out.println("Child1 Class");
    }
}

class child2 extends parent {
    void displaychild2() {
        System.out.println("Child2 Class");
    }
}
class HierarchyLvl {
    public static void main(String[] args){
        child1 obj = new child1();
        child2 obj1 = new child2();
        obj.display();
        obj.displaychild1();
        obj1.displaychild2();
    }
}