package com.test2.test2.controllers;

import com.test2.test2.dtos.DtoProd;
import com.test2.test2.models.ProdutosModel;
import com.test2.test2.services.ServiceProd;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge =  3600)
@RequestMapping("/produto")
public class ControllerProd {

    final ServiceProd serviceProd;

    public ControllerProd(ServiceProd serviceProd) {
        this.serviceProd = serviceProd;
    }

    @PostMapping("/2")
    public ResponseEntity <Object> saveModels(@RequestBody @Valid DtoProd dtoProd){
        var produtosModel = new ProdutosModel();
        BeanUtils.copyProperties(dtoProd, produtosModel);
        produtosModel.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceProd.save(produtosModel));
    }
}
