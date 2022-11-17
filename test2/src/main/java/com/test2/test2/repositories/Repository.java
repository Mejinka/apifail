package com.test2.test2.repositories;

import com.test2.test2.models.MatriculasModel;
import com.test2.test2.models.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<MatriculasModel, UUID > {
}


