public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        Dog dog = new Dog();

        Vehicle<Car> carVehicle = new Vehicle<>(car);
        carVehicle.drive();

        Vehicle<Bus> busVehicle = new Vehicle<>(bus);
        busVehicle.drive();

        //Generics are safe to use since during compile time they through errors
        //Here creation of Dog object is not allowed
        //Vehicle<Dog> dogVehicle = new Vehicle<Dog>(dog);

    }

}
