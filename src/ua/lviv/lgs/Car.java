package ua.lviv.lgs;

public class Car {
    int power;
    int yearOfIssue;
    Car(int power, int yearOfIssue) {
        this.power = power;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
