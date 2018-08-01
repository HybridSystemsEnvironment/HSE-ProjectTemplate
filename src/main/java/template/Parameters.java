
package template;

import edu.ucsc.cross.hse.core.modeling.DataStructure;

/**
 * A parameter data structure
 * 
 * @author Brendan Short
 *
 */
public class Parameters extends DataStructure {

	/**
	 * Example parameter value 1
	 */
	public double parameterValue1;

	/**
	 * Example parameter value 2
	 */
	public double parameterValue2;

	/**
	 * Construct the parameters
	 * 
	 * @param parameter_value_1
	 *            value of parameter 1
	 * @param parameter_value_1
	 *            value of parameter 2
	 */
	public Parameters(double parameter_value_1, double parameter_value_2) {

		parameterValue1 = parameter_value_1;
		parameterValue2 = parameter_value_2;
	}
}
