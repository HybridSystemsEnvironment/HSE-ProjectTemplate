
package template;

import edu.ucsc.cross.hse.core.modeling.HybridSystem;

/**
 * A hybrid system template
 * 
 * @author Brendan Short
 *
 */
public class System extends HybridSystem<State> {

	/**
	 * System parameters
	 */
	public Parameters parameters;

	/**
	 * Constructor for the system
	 * 
	 * @param state
	 *            state
	 * @param parameters
	 *            parameters
	 */
	public System(State state, Parameters parameters) {

		super(state);
		this.parameters = parameters;
	}

	/**
	 * Flow set
	 * 
	 * @param x
	 *            current state
	 */
	@Override
	public boolean C(State x) {

		return true;
	}

	/**
	 * Flow map
	 * 
	 * @param x
	 *            current state
	 * @param x_dot
	 *            state derivative
	 */
	@Override
	public void F(State x, State x_dot) {

	}

	/**
	 * Jump set
	 * 
	 * @param x
	 *            current state
	 */
	@Override
	public boolean D(State x) {

		return false;
	}

	/**
	 * Jump map
	 * 
	 * @param x
	 *            current state
	 * @param x_dot
	 *            updated state
	 */
	@Override
	public void G(State x, State x_plus) {

	}

}
