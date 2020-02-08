package testinterview.zipranges;

/**
 * @author Javier Robles
 *
 */
public class ZipCodeRange {

	/***
	 * This is The constructor
	 * @param lowerBound
	 * @param upperBound
	 */
	public ZipCodeRange(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound =upperBound;
	}
	/**
	 * Gets the lower bound
	 * @return lowerBound
	 */
	public int getLowerBound() {
		return lowerBound;
	}
	/***
	 * Sets the lower bound
	 * @param lowerBound
	 */
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}
	/***
	 * Gets the lower bound
	 * @return upperBound
	 */
	public int getUpperBound() {
		return upperBound;
	}
	/***
	 * Sets the lower bound
	 * @param upperBound
	 */
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}
	
	@Override
	public String toString()
	{
		return "["+this.getLowerBound()+","+this.getUpperBound()+"]";
	}
	private int lowerBound;
	private int upperBound;
}

