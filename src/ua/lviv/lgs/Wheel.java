package ua.lviv.lgs;

public class Wheel {
    double diameter;
    String material;

    Wheel(double diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
