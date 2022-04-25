public class Truck extends Transport implements CheckTransport,CheckWheels,Checker {
    @Override
    public void checkTransport() {
            System.out.println("Проверяем двигатель");
            System.out.println("Проверяем прицеп");
    }

    @Override
    public void serviceCheck() {
        System.out.println("Название Грузовика:" + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            checkWheels();
        }
        checkTransport();
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}