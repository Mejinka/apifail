package com.test2.test2.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class Dto {

    @NotBlank
    @Size(max = 7)
    private String matriculaCar;

    public String getMatriculaCar() {
        return matriculaCar;
    }

    public void setMatriculaCar(String matriculaCar) {
        this.matriculaCar = matriculaCar;
    }


}
