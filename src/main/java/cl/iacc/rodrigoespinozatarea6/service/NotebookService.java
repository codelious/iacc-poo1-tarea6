package cl.iacc.rodrigoespinozatarea6.service;

import cl.iacc.rodrigoespinozatarea6.entity.Notebook;

import java.util.List;

public interface NotebookService {
    Notebook create(Notebook notebook);
    Notebook findById(String serial);
    List<Notebook> findAll();
    void remove(String serial);
}
