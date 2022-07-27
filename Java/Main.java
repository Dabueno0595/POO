package Java;

class Main{
     public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("UBZ29D", new Account( "Andres Bueno",  "5778"));
        car.printDataCar();
        Car car2 = new Car("UML112", new Account( "Diego Bueno",  "1245"));
        car2.printDataCar();

    }
}