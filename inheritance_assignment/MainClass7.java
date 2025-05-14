package inheritance_assignment;

public class MainClass7 
{
	public static void main(String[] args) 
	{
        SmartPhone phone = new SmartPhone();
        
        
       phone.initializeProduct("iPhone", 1200, 10);
       phone.initializeElectronics(12, 20);
       phone.initializeSmartphone(8, 256, 48);
        
       
        phone.displaySmartphone();

        
        double discountedPrice = phone.calculateDiscount(10);
        System.out.println("Discounted Price: $" + discountedPrice);

    
        int newStock = phone.restock(5);
        System.out.println("Updated Stock: " + newStock);

 
        String warrantyStatus = phone.checkWarranty("2024-01-10");
        System.out.println("Warranty Status: " + warrantyStatus);


        double energyCost = phone.calculateEnergyCost(5);
        System.out.println("Energy Cost for 5 hours: $" + energyCost);

     
        String photo = phone.capturePhoto("Portrait");
        System.out.println(photo);
        
        String appStatus = phone.installApp("Instagram");
        System.out.println(appStatus);
}
}
