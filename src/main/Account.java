/**
 * 
 */
package main;

/**
 * @author Afeef Ahmed
 *
 */
public abstract class Account extends Bank {
	
	protected int number;
	protected double bal;
	/**
	 * 
	 * @return
	 */
	public int getNumber()
	{
		return number;
		
	}
	/**
	 * 
	 * @return
	 */
	public double getBal()
	{
		return bal;
		
	}
	/**
	 * 
	 * @return
	 */
	public Person getOwner()
	{
		return null;
		
	}
	/**
	 * 
	 * @param d
	 */
	public void deposit(double d)
	{
		
	}
	/**
	 * 
	 * @param d
	 * @return
	 */
	public abstract boolean withdraw(double d);
	

}
