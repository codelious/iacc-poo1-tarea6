package cl.iacc.rodrigoespinozatarea6.configuration;

import cl.iacc.rodrigoespinozatarea6.entity.Notebook;

import java.util.ArrayList;
import java.util.List;

public class NotebookData {
    private final List<Notebook> notebookList;

    public NotebookData() {
        this.notebookList = new ArrayList<>();
    }

    public Notebook add(Notebook notebook) {
        notebookList.add(notebook);
        return notebook;
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public Notebook get(String serial) {
        return notebookList.stream().filter(notebook -> notebook.getSerial().equalsIgnoreCase(serial)).findFirst().get();
    }

    public List<Notebook> getAll() {
        return notebookList;
    }

    public void delete(String serial) {
        this.notebookList.remove(get(serial));
    }
}
