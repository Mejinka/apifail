package com.test2.test2.dtos;


import javax.validation.constraints.NotBlank;


public class DtoProd {

    @NotBlank
    private String produtos;

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }
}
