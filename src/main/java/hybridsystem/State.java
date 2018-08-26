
package hybridsystem;

import edu.ucsc.cross.hse.core.modeling.DataStructure;

/**
 * A state
 */
public class State extends DataStructure {

	/**
	 * Example state value
	 */
	public double value;

	/**
	 * Construct the states
	 * 
	 * @param state_value_1
	 *            value of state 1
	 * @param state_value_1
	 *            value of state 2
	 */
	public State(double default_state_value) {

		value = default_state_value;

	}

}
