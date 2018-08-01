
package template;

import org.jfree.chart.ChartPanel;

import edu.ucsc.cross.hse.core.chart.ChartUtils;
import edu.ucsc.cross.hse.core.environment.HSEnvironment;
import edu.ucsc.cross.hse.core.figure.Figure;
import edu.ucsc.cross.hse.core.trajectory.HybridTime;
import edu.ucsc.cross.hse.core.trajectory.TrajectorySet;

/**
 * A template application that prepares and operates the environment, and
 * generates a figure.
 * 
 * @author Brendan Short
 *
 */
public class Application {

	/**
	 * Main method for running application
	 * 
	 * @param args
	 *            none
	 */
	public static void main(String args[]) {

		// Initialize environment
		HSEnvironment environment = new HSEnvironment();
		// Initialize parameters
		Parameters parameters = new Parameters(0, 0);
		// Initialize state
		State state = new State(0, 0);
		// Initialize system
		System system = new System(state, parameters);
		// Add system to environment
		environment.getSystems().add(system);
		// Run environment (max time duration, max jumps)
		environment.run(10.0, 10);
		// Generate a figure of the trajectories
		Figure figure = generateVerticalStateFigure(environment.getTrajectories());
		// Display the figure in new window
		figure.display();

	}

	/**
	 * Generate a figure
	 * 
	 * @param solution
	 *            trajectory set containing data to load into figure
	 * @return a figure displaying state values
	 */
	public static Figure generateVerticalStateFigure(TrajectorySet solution) {

		// Create figure w:1000 h:600
		Figure figure = new Figure(1000, 600);
		// Assign title to figure
		figure.getTitle().setText("Template Simulation");
		// Create charts
		ChartPanel yPos = ChartUtils.createPanel(solution, HybridTime.TIME, "stateValue1");
		ChartPanel yVel = ChartUtils.createPanel(solution, HybridTime.TIME, "stateValue2");
		// Label chart axis and configure legend visibility
		ChartUtils.configureLabels(yPos, "Time (sec)", "State Value 1", null, false);
		ChartUtils.configureLabels(yVel, "Time (sec)", "State Value 2", null, false);
		// Add charts to figure
		figure.addComponent(0, 0, yPos);
		figure.addComponent(0, 1, yVel);
		// Return generated figure
		return figure;
	}

}