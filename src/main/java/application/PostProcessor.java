
package application;

import edu.ucsc.cross.hse.core.environment.HSEnvironment;
import edu.ucsc.cross.hse.core.figure.Figure;
import edu.ucsc.cross.hse.core.trajectory.HybridTime;
import edu.ucsc.cross.hse.core.trajectory.TrajectorySet;

/**
 * A post processor
 */
public class PostProcessor {

	/**
	 * Executes all processing tasks. This method is called by the main applications
	 */
	public static void processEnvironmentData(HSEnvironment environment) {

		Figure figure = generateVerticalStateFigure(environment.getTrajectories());
		figure.exportToFile();
	}

	/**
	 * Generate a figure
	 * 
	 * @param solution
	 *            trajectory set containing data to load into figure
	 * @return a figure displaying state values
	 */
	public static Figure generateVerticalStateFigure(TrajectorySet solution) {

		// Create figure (width, height, title)
		Figure figure = new Figure(600, 600, "Template Simulation");
		// Add charts to figure (
		figure.add(0, 0, solution, HybridTime.TIME, "value", "Time (sec)", "State Value", null, false);
		// Return generated figure
		return figure;
	}
}
