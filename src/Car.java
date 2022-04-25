public class Car extends Transport implements CheckTransport,CheckWheels,Checker {

    @Override
    public void checkTransport() {
            System.out.println("Проверяем двигатель");
        }

    @Override
    public void serviceCheck() {
        System.out.println("Название машины:" + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            checkWheels();
        }
        checkTransport();
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}