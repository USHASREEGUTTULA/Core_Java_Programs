package inheritance_assignment;

public class MainClass1 
{
	public static void main(String[] args)
	{
        SelfDrivingCar myCar = new SelfDrivingCar();
        
        myCar.initialize("Tesla", "Model X", 250);
        myCar.setCarDetails("Electric", 15);
        myCar.setSelfDrivingDetails("NeuralNet", "LIDAR");

        myCar.displayInfo();
        myCar.accelerate(50);
        myCar.refuel(20);
        myCar.autonomousDrive("San Francisco");
        myCar.updateAI("DeepLearningV2");
    }

}
