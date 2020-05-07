import data.Car;
import data.Motorbike;
import data.RentableCar;
import data.Vehicle;
import logic.Moveable;
import logic.Rentable;

public class MobileCenter {
    public static void main(String[] args) {

        Car[] cars = {                  new Car("Skoda", 2002, 5),
                                        new Car("Audi", 2011,4)};

        Vehicle[] vehicles = {          cars[0],
                                        cars[1],
                                        new Motorbike("Suzuki", 1998, 200)};

        Moveable[] moveables =          vehicles;

        RentableCar[] rentableCars = {  new RentableCar("VW", 2015, 5),
                                        new RentableCar("BMW", 2012, 4)};

        //Ustaw kierunek jazdy pojazdów
        moveables[0].goForward();
        moveables[1].goBack();
        moveables[2].turnLeft();
        //Wyświetl dane o pojazdach
        for(Vehicle v: vehicles){
            System.out.println(v.toString());
        }
        System.out.println("---");
        //Wynajmij VW i BMW
        Rentable[] rentables = rentableCars;
        rentables[0].rent("Kamil","Zalwert", "12345");
        rentables[1].rent("Jan","Kowalski", "1/46");
        //Wyświetl status pojazdów do wynajmu
        for(RentableCar rC: rentableCars){
            System.out.println(rC.toString());
        }
        System.out.println("---");
        //Oddaj pojazdy do wypożyczalni
        for(Rentable r: rentableCars){
            r.handOver();
        }
        //Wyświetl status po oddaniu pojazdów do wypożyczalni
        for(RentableCar rC: rentableCars){
            System.out.println(rC.toString());
        }
    }
}
