public class Main {
    public static void main(String[] args) {
        Checker[] transoprt = {
                new Bicycle("Stels",2),
                new Car("BMW", 4),
                new Truck("MAN",4)
        };

        ServiceCentre.checks(transoprt);
    }
}