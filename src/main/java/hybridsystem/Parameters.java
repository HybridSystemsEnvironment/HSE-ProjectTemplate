
package hybridsystem;

import edu.ucsc.cross.hse.core.modeling.DataStructure;

/**
 * A parameter set
 */
public class Parameters extends DataStructure {

	/**
	 * Example parameter value
	 */
	public double value;

	/**
	 * Construct the parameters
	 * 
	 * @param parameter_value
	 *            value to set
	 * 
	 */
	public Parameters(double parameter_value) {

		value = parameter_value;

	}
}
