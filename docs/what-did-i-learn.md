how to create models in java

- model is a class that represents a real world business concept
- model is usually stored in model folder of the program

what is a constructor

- method that runs when you create a new object
    - usually sets required field, defaults, put objects into valid states, etc.

small example:
```java
public class User {

    private String name;
    private String role;

    public User(String name) {
        this.name = name;
        this.role = "USER";
    }
}
```

this gaurentees that user wil always have a role and a name