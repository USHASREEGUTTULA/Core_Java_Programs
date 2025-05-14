package validation_assignment;

public class CarInformationSystem 
{
		public String brand;
		public String model;
		public int year;
		public int price;
		public String fueltype;
		public float mileage;
		
		public int carage;
		public int resalevalue;
		public double resale;
		public double efficiency;
		public double ugprice;
		
		//Validation methods
		public boolean validatebrand(String brand)
		{
			if(brand.length()>=3)
			{
				return true;
			}
			return false;
		}
		public boolean validatemodel(String model)
		{
			if(model.length()>=2)
			{
				return true;
			}
			return false;
		}
		public boolean validateyear(int year)
		{
			if(year>=2000 && year<=2025)
			{
				return true;
			}
			return false;
		}
		public boolean validateprice(int price)
		{
			if(price>=500000 && price<=5000000)
			{
				return true;
			}
			return false;
		}
		public boolean validatefueltype(String fuel)
		{
			if(fueltype=="Petrol"||fueltype=="Diesel"||fueltype=="Electric")
			{
				return true;
			}
			return false;
		}
		public boolean validatemileage(float mileage)
		{
			if(mileage>5)
			{
				return true;
			}
			return false;
		}
		
		//initialize method
		public void initialize(String brand, String model, int year, int price, String fueltype, float mileage)
		{
			if(validatebrand(brand)&& validatefueltype(fueltype)&&validatemileage(mileage)&&validatemodel(model))
			
				{
				this.brand=brand;
				
			this.model=model;
			this.year=year;
			this.price=price;
			this.fueltype=fueltype;
			this.mileage=mileage;
		}
		}
		//Methods
		public int carage()
		{
		    carage=2025-year;
			return carage;
		}
		
		public double resalevalue()
		{
		    resalevalue=carage();
			resale=this.price;
			for(int i=0;i<resalevalue;i++)
			{
				resale=resale-(resale*10/100);
			}
			return resale;	
		}
		
		public double fuelefficieny(double distance)
		{
			efficiency=distance/this.mileage;
			return efficiency;
		}
		public double upgradeprice(double increment)
		{
			ugprice=this.price+increment;
			return ugprice;
		}
		public void displayinfo()
		{
			System.out.println("Car specifications");
			System.out.println("brand: "+this.brand);
			System.out.println("model: "+this.model);
			System.out.println("year: "+this.year);
			System.out.println("price: "+this.price);
			System.out.println("fuel type: "+this.fueltype);
			System.out.println("mileage: "+this.mileage);
			System.out.println("car age: "+this.carage());
			System.out.println("resalevalue: "+this.resalevalue());
			System.out.println("fuel efficiency: "+this.fuelefficieny(90));
			System.out.println("upgrade price: "+this.upgradeprice(50000));
		}
		public static void main(String[]args)
		{
			CarInformationSystem car1=new CarInformationSystem();
			car1.initialize("kia","XUV", 2024, 4500000,"Petrol",50);
			car1.displayinfo();
		}
	}

