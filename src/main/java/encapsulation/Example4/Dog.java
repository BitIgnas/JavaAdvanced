package encapsulation.Example4;

public class Dog {

    private String name;
    private int age;
    private String gender;
    private String breed;
    private int weight;

    public Dog(String name, int age, String gender, String breed, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.weight = weight;
    }

    public Dog(String gender, String breed) {
        this("Filo", 1, gender, breed, 5);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
