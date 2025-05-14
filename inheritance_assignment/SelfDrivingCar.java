package inheritance_assignment;

public class SelfDrivingCar extends Car
{
	public String aiModel;
	public String sensorType;

	public boolean validateAIModel(String model) 
    {
        if(model.length() >= 3 )
        {
			return true;
	   }
		return false;
    }

	public boolean validateSensorType(String sensor)
    {
        if(sensor.equals("LIDAR") || sensor.equals("RADAR") || sensor.equals("Camera"))
        		{
			return true;
	   }
		return false;
    }

	public void setSelfDrivingDetails(String aiModel, String sensorType) 
	{
        if (validateAIModel(aiModel) && validateSensorType(sensorType))
        {
            this.aiModel = aiModel;
            this.sensorType = sensorType;
        } 
        else 
        {
            System.out.println("Invalid AI or Sensor Type");
        }
    }

	public void autonomousDrive(String destination)
	{
        System.out.println("Driving autonomously to " + destination);
    }

    void updateAI(String newModel) 
    {
        if (validateAIModel(newModel))
        {
            this.aiModel = newModel;
            System.out.println("AI model updated to " + newModel);
        }
    }

}
