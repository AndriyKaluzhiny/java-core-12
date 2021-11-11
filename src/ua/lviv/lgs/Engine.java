package ua.lviv.lgs;

public class Engine {
    int numberOfCylinders;

    Engine(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
