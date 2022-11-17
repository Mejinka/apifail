package com.test2.test2.controllers;

import com.test2.test2.dtos.Dto;
import com.test2.test2.models.MatriculasModel;
import com.test2.test2.services.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin (origins = "*", maxAge =  3600)
@RequestMapping ("/matricula")
public class Controller {

    final Service service;

    public Controller(Service service) {
        this.service = service;
    }


 @PostMapping("/1")
    public ResponseEntity <Object> saveModels(@RequestBody @Valid Dto dto){
        var matriculasModel = new MatriculasModel();
        BeanUtils.copyProperties(dto, matriculasModel);
        matriculasModel.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(matriculasModel));
    }

}
