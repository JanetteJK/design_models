import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> redoList; // Redo history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoList = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            saveToRedoList();
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redoList.isEmpty()) {
            System.out.println("Redoing last action");
            IMemento nextState = redoList.remove(redoList.size() - 1);
            model.restoreState(nextState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
        redoList.clear();
    }

    private void saveToRedoList() {
        IMemento currentState = model.createMemento();
        redoList.add(currentState);
    }

    public List<IMemento> getHistory() {
        return history;
    }

    public void restoreFromHistory(int index) {
        if (index >= 0 && index < history.size()) {
            IMemento memento = history.get(index);
            model.restoreState(memento);
            gui.updateGui();
        }
    }
}