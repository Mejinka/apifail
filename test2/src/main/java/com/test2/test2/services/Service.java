package com.test2.test2.services;

import com.test2.test2.models.MatriculasModel;
import com.test2.test2.repositories.Repository;

@org.springframework.stereotype.Service

public class Service {
    final
    Repository repository;
    public Service(Repository repository) {
        this.repository = repository;
    }

    public MatriculasModel save(MatriculasModel matriculasModel) {
        return repository.save(matriculasModel);
    }
}
