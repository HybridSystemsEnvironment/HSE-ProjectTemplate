
package template;

import edu.ucsc.cross.hse.core.modeling.DataStructure;

/**
 * A state template
 * 
 * @author Brendan Short
 *
 */
public class State extends DataStructure {

	/**
	 * Example state value 1
	 */
	public double stateValue1;

	/**
	 * Example state value 2
	 */
	public double stateValue2;

	/**
	 * Construct the states
	 * 
	 * @param state_value_1
	 *            value of state 1
	 * @param state_value_1
	 *            value of state 2
	 */
	public State(double state_value_1, double state_value_2) {

		stateValue1 = state_value_1;
		stateValue2 = state_value_2;
	}

}
