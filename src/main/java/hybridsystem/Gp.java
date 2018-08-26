
package hybridsystem;

import edu.ucsc.cross.hse.core.modeling.JumpMap;

/**
 * A jump map
 */
public class Gp implements JumpMap<State> {

	/**
	 * Parameters
	 */
	public Parameters parameters;

	/**
	 * Constructor for jump map
	 */
	public Gp(Parameters parameters) {

		this.parameters = parameters;
	}

	/**
	 * Jump map
	 * 
	 * @param x
	 *            current state
	 * @param x_plus
	 *            state update values
	 */
	@Override
	public void G(State x, State x_plus) {

		// compute x_plus values here
	}

}
