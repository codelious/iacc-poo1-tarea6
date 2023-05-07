package cl.iacc.rodrigoespinozatarea6.service;

import cl.iacc.rodrigoespinozatarea6.entity.Notebook;
import cl.iacc.rodrigoespinozatarea6.repository.NotebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotebookServiceImpl implements NotebookService {

    final NotebookRepository notebookRepository;

    @Autowired
    public NotebookServiceImpl(NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    @Override
    public Notebook create(Notebook notebook) {
        return notebookRepository.create(notebook);
    }

    @Override
    public Notebook findById(String serial) {
        return notebookRepository.findById(serial);
    }

    @Override
    public List<Notebook> findAll() {
        return notebookRepository.findAll();
    }

    @Override
    public void remove(String serial) {
        notebookRepository.remove(serial);
    }
}
