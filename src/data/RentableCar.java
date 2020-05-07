package data;

import logic.Rentable;

public class RentableCar extends Car implements Rentable {

    Person person;

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        person = new Person(firstName,lastName,id);
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        if(person != null) return true;
        return false;
    }

    @Override
    public String toString() {
        return "RentableCar{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", seats=" + getSeats() +
                ", direction=" + getDirection().getDescription() +
                ", person=" + person +
                '}';
    }
}
