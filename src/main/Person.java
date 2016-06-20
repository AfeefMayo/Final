/**
 * 
 */
package main;

/**
 * @author Afeef Ahmed
 *
 */
public class Person extends Account {
	
	private String name;
	private double salary;
	/**
	 * 
	 * @param n
	 * @param s
	 */
	public Person (String n, double s)
	{
		
	}
	/**
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
		
	}
	/**
	 * 
	 * @return
	 */
	public double getSalary()
	{
		return salary;
		
	}
/**
 * 
 */
	@Override
	public boolean withdraw(double d) {
		// TODO Auto-generated method stub
		return false;
	}

}

