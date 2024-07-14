public class ConfigurationOriginator {
    private State state;

    public ConfigurationOriginator(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public ConfigurationMemento createConfigurationMemento() {
        return new ConfigurationMemento(new State(this.state.getHeight(), this.state.getWeight()));
    }

    public void restoreConfigurationMemento(ConfigurationMemento configurationMemento) {
        this.state = configurationMemento.getState();
    }
}
