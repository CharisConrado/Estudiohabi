package Persona;


public class PerfilPersona {
    
    public String name;
    public String lastname;
    public int age;
    public int Id;

    public PerfilPersona(String name, String lastname, int age, int Id) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    
}
