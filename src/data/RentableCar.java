package data;

import logic.Rentable;

public class RentableCar extends Car implements Rentable {

    private Person person;

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        if(!isRent()){
        person = new Person(firstName,lastName,id);
        }else{
            System.out.println("Samochód aktualnie wypożyczony przez: " + person);
        }
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
