//here we have heirarchical inheritance
//one parent class and multiple child classes
/*
    Hierarchical Inheritance Diagram:

                 Animal
                   ↑
     ┌─────────────┼─────────────┐
     │             │             │
 herbivore     carnivore     omnivore

   - Each subclass (herbivore, carnivore, omnivore)
     inherits from the single parent class (Animal).
   - This demonstrates hierarchical inheritance:
     one parent → multiple child classes.
*/


class Animal{
    public void categories(){
        System.out.println("herbivore, carnivore, omnivore");
    }
}

class herbivore extends Animal{
    public void herbivore(){
        System.out.println("goat, cow, deer");
        categories();
        //also the parent class is called
    }
}

class carnivore extends Animal{
    public void carnivore(){
        System.out.println("lion, tiger, leopard");
    }}

class omnivore extends Animal{
    public void omnivore(){
        System.out.println("human, bear,dog");
    }
}

public class inheritance{


    public static void main(String[] args){
        herbivore obj;// this obj will have access to both the classes (Animal and herbivore)
        obj=new herbivore();//new-> constructor (used to inistialize the object)
        obj.herbivore();
        carnivore obj1;// this obj1 will have access to both the classes (Animal and carnivore)
        obj1=new carnivore();
        obj1.carnivore();
        omnivore obj2;// this obj2 will have access to both the classes (Animal and omnivore)
        obj2=new omnivore();
        obj2.omnivore();
    }
}