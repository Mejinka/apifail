package com.test2.test2.services;

import com.test2.test2.models.ProdutosModel;
import com.test2.test2.repositories.RepositoryProd;

@org.springframework.stereotype.Service

public class ServiceProd {
    final
    RepositoryProd repositoryProd;

    public ServiceProd(RepositoryProd repositoryProd) {
        this.repositoryProd = repositoryProd;
    }
    public ProdutosModel save(ProdutosModel produtosModel) {
        return repositoryProd.save(produtosModel);
    }
}
