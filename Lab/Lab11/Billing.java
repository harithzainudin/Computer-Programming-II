
public class Billing {
	double total;
	protected double previous, current;
	protected String type;
	
	/**
	 * @return getTotal
	 */
	public double getTotal(double previous, double current, Object type) {
		double usage = current - previous;
		total = 0;
		if (type.equals("Fix Rate Method")) 
			if (usage <= 100)
				total = 20;
			else if (usage >100 && usage <= 200)
				total = ((usage - 100) * 0.22) + 20;
			else if (usage >200)
				total = ((usage - 200) * 0.35) + 20 + 22;
		else
			if (usage <= 100)
				total = usage * 0.22;
			else
				total = 22 + ((usage - 100) * 0.35);
		return total;
	}
	
	/**
	 * @param total
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
	/**
	 * @return previous
	 */
	public double getPrevious() {
		return previous;
	}
	
	/**
	 * @param previous
	 */
	public void setPrevious(double previous) {
		this.previous = previous;
	}
	
	/**
	 * @return current
	 */
	public double getCurrent() {
		return current;
	}
	
	/**
	 * @param current
	 */
	public void setCurrent(double current) {
		this.current = current;
	}
	
	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
} //end billing class
