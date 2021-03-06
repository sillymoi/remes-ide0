/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public abstract class ModeExitSystemTransition extends SystemTransition {

	/**
	 * @param from
	 * @param to
	 */
	public ModeExitSystemTransition(Mode from) {
		super(from, null);
	}
	
	/**
	 * Performs the transition.
	 * @see hr.fer.rasip.remes.simulator.core.Transition#performTransition(hr.fer.rasip.remes.simulator.core.SimulatorState)
	 */
	@Override
	public void performTransition(SimulatorState ss) throws SimulatorDeadlockException {
		assert(ss != null);

		Mode leaving = getConnectFrom();

		// Leave mode
		ss.removeActiveMode(leaving);
		ss.removeWaitingTransitions(leaving);
		ss.removeActiveTransition(this);
		leaving.onExitMode();
		leaving.performRenamings();
	}
}
