
package hybridsystem;

import edu.ucsc.cross.hse.core.modeling.JumpSet;

/**
 * A jump set
 */
public class Dp implements JumpSet<State> {

	/**
	 * Parameters
	 */
	public Parameters parameters;

	/**
	 * Constructor for jump set
	 */
	public Dp(Parameters parameters) {

		this.parameters = parameters;
	}

	/**
	 * Flow set
	 * 
	 * @param x
	 *            current state
	 */
	@Override
	public boolean D(State x) {

		boolean inD = false; // add logic to determine if x in jump set
		return inD;
	}

}
