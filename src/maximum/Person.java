package maximum;

public class Person {
    int age;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
