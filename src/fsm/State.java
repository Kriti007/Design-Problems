package fsm;

public abstract class State {
    private final StateData stateData;

    protected State(final StateData stateData) {
        if(null == stateData) {
            throw new NullPointerException();
        }
        this.stateData = stateData;
    }
}
