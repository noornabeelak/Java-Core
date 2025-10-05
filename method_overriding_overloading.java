class keyboard{
    public void pressed(){
        System.out.println("got hit");
    }

    // 🔹 Method Overloading (Compile-time Polymorphism)
    public void pressed(int times) {
        System.out.println("got hit " + times + " times");
    }


    public void light(){
        System.out.println("light on");
    }
}

class advancedKeyboard extends keyboard{
   public void pressed(){//overriding method
        System.out.println("got hit hard");
    }
}

public class method_overriding_overloading {
    public static void main(String[] args) {
        keyboard obj;
        obj = new advancedKeyboard();// also can be keyboard obj = new keyboard();
        // 🔹  Method Overriding -> Runtime
        obj.pressed();
        obj.light();// accessing parent class method using child object reference
        
        // 🔹 Method Overloading -> compile time
        obj.pressed(28);// accessing overloaded method
        
    }
}