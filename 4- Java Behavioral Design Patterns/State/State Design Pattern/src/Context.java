public class Context {
    private RemoteControl state;

    public Context(RemoteControl state) {
        this.state = state;
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void pressedPowerButtonRemote() {
        state.pressSwitch(this);
    }
}
