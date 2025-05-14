package inheritance_assignment;

public class Employee 
{
	public String name;
    public int salary;
    public String department;

    public boolean validateName(String name)
    {
        if (name.length() >= 3 ) 
        {
            return true;
        }
        return false;
    }

    public boolean validateSalary(int salary)
    {
        if (salary >= 10000 && salary <= 850000) 
        {
            return true;
        }
        return false;
    }

    public boolean validateDepartment(String department) 
    {
        if (department.length() >= 3 ) 
        {
            return true;
        }
        return false;
    }

    public void initializeEmployee(String name, int salary, String department) 
    {
        if (validateName(name) && validateSalary(salary) && validateDepartment(department))
        {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }
        else 
        {
            System.out.println("Invalid Employee Details");
        }
    }

    public void work(int hours) 
    {
        System.out.println(name + " worked for " + hours + " hours.");
    }

    public void requestRaise(int amount)
    {
        if (salary + amount <= 850000) 
        {
            salary += amount;
            System.out.println("Salary increased. New salary: " + salary);
        }
        else 
        {
            System.out.println("Salary increase exceeds the limit.");
        }
    }
}
