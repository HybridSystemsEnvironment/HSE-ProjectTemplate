
package hybridsystem;

import edu.ucsc.cross.hse.core.modeling.FlowMap;

/**
 * A flow map
 */
public class Fp implements FlowMap<State> {

	/**
	 * Parameters
	 */
	public Parameters parameters;

	/**
	 * Constructor for flow map
	 */
	public Fp(Parameters parameters) {

		this.parameters = parameters;
	}

	/**
	 * Flow map
	 * 
	 * @param x
	 *            current state
	 * @param x_dot
	 *            state derivative values
	 */
	@Override
	public void F(State x, State x_dot) {

		// compute x_dot values here
	}

}
