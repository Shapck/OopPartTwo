public class Bicycle extends Transport implements CheckWheels,Checker{
    @Override
    public void serviceCheck() {
        System.out.println("Название велосипеда:" + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            checkWheels();
        }
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}