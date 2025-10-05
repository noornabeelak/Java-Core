/*
    Encapsulation in Java

    ------------------------------------
            Encapsulation Flowchart
    ------------------------------------
           ┌─────────────────────┐
           │       Class         │
           │ (Data + Methods)    │
           ├─────────────────────┤
           │   private data      │
           │   (name, age)       │
           ├─────────────────────┤
           │ public getters/setters (are public methods)│
           │  control access     │
           └──────────┬──────────┘
                      │
             ┌────────▼────────┐
             │   Main Method   │
             │ Accesses data   │
             │  via methods    │
             └─────────────────┘

    ------------------------------------
    Concept Summary:
    ------------------------------------
    - Encapsulation binds data & methods inside one unit (class).
    - Makes variables private for security.
    - Provides controlled access using getters & setters.
    - Prevents unauthorized modification of data.
*/

//getters and setters are usually used, not always necessary
// SEE THE MAIN METHOD
// Example of Encapsulation
class confedential {
    private String name;
    private int age;

    // Getter method 
    public String getName() {//specify w data type of return
        return name;
    }

    // Setter method
    public void setName(String newName) {
        name = newName;
    }

    // Getter method
    public int getAge() {//specify w data type of return
        return age;
    }

    // Setter method with basic validation
    public void setAge(int newAge) {//setter can also have logic + validation
        if (newAge > 0) {
            age = newAge;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        confedential obj;
        obj = new confedential();
        obj.setName("Nebula");
        obj.setAge(19);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
