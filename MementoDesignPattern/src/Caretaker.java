import java.util.List;

public class Caretaker {
    List<ConfigurationMemento> mementoList;

    public Caretaker(List<ConfigurationMemento> mementoList) {
        this.mementoList = mementoList;
    }

    public void add(ConfigurationMemento configurationMemento) {
        this.mementoList.add(configurationMemento);
    }

    public ConfigurationMemento undo() {
        if(!mementoList.isEmpty()) {
            int lastMementoIx = mementoList.size() - 1;
            ConfigurationMemento configurationMemento = mementoList.get(lastMementoIx);
            mementoList.remove(lastMementoIx);
            return configurationMemento;
        }
        return null;
    }
}
