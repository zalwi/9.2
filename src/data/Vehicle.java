package data;

import logic.Direction;
import logic.Moveable;

public class Vehicle implements Moveable {

    private String name;
    private int year;
    private Direction direction;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
        direction = Direction.STOP;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public void turnLeft() {
        direction = Direction.LEFT;
    }

    @Override
    public void turnRight() {
        direction = Direction.RIGHT;
    }

    @Override
    public void goForward() {
        direction = Direction.FORWARD;
    }

    @Override
    public void goBack() {
        direction = Direction.BACK;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", direction=" + direction +
                '}';
    }
}
