package private_members;

public class Shape 
{
    private String color;
   private String typeofshape;
   
  public Shape(String color,String typeofshape )
   {
	   if(Validation.validateColor(color)&& Validation.validateTypeOfShape(typeofshape))
	   {
		System.out.println("hii");
	   this.color=color;
	   this.typeofshape=typeofshape;
	   }
	   System.out.println("bye");
   }
  public String getTypeOfShape()
  {
	  return typeofshape;
  }
   public void display()
	{
		System.out.println(this.color+" "+ this.typeofshape);
	}
}
