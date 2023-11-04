abstract class RemoteControl {
    abstract void pressSwitch(Context tv);
}

class On extends RemoteControl {
    @Override
    void pressSwitch(Context tv) {
        System.out.println("I am already ON. Going to be turned OFF now.");
        tv.setState(new Off());
    }
}

class Off extends RemoteControl {
    @Override
    void pressSwitch(Context tv) {
        System.out.println("I am already OFF. Going to be turned ON now.");
        tv.setState(new On());
    }
}


