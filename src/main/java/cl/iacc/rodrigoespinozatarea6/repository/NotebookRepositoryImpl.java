package cl.iacc.rodrigoespinozatarea6.repository;

import cl.iacc.rodrigoespinozatarea6.configuration.NotebookData;
import cl.iacc.rodrigoespinozatarea6.entity.Notebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NotebookRepositoryImpl implements NotebookRepository {

    final NotebookData notebookData;

    @Autowired
    public NotebookRepositoryImpl(NotebookData notebookData) {
        this.notebookData = notebookData;
    }

    @Override
    public Notebook create(Notebook notebook) {
        return notebookData.add(notebook);
    }

    @Override
    public Notebook findById(String serial) {
        return notebookData.get(serial);
    }

    @Override
    public List<Notebook> findAll() {
        return notebookData.getAll();
    }

    @Override
    public void remove(String serial) {
        notebookData.delete(serial);
    }
}
