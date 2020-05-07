package data;

public class Motorbike extends Vehicle{
    private int speedLimit;

    public Motorbike(String name, int year, int speedLimit) {
        super(name, year);
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", speedLimit=" + speedLimit +
                ", direction=" + getDirection().getDescription() +
                '}';
    }
}
