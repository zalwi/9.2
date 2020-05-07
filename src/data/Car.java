package data;

public class Car extends Vehicle{
    private int seats;

    public Car(String name, int year, int seats) {
        super(name, year);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", seats=" + seats +
                ", direction=" + getDirection().getDescription() +
                '}';
    }
}
