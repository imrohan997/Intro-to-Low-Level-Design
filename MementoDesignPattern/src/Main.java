import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        State state = new State(5, 12);
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(state);
        ConfigurationMemento configurationMemento1 = configurationOriginator.createConfigurationMemento();

        Caretaker caretaker = new Caretaker(new ArrayList<>());
        caretaker.add(configurationMemento1);


        configurationOriginator.getState().setHeight(7);
        configurationOriginator.getState().setWeight(15);
        ConfigurationMemento configurationMemento2 = configurationOriginator.createConfigurationMemento();
        caretaker.add(configurationMemento2);

        configurationOriginator.getState().setHeight(9);
        configurationOriginator.getState().setWeight(17);


        ConfigurationMemento configurationMemento4 = caretaker.undo();
        configurationOriginator.restoreConfigurationMemento(configurationMemento4);
        System.out.println(configurationOriginator.getState().getHeight() + "   " +  configurationOriginator.getState().getWeight());
    }
}