package com.proyecto.infinitTask.app.controllers;

import com.proyecto.infinitTask.app.dtos.request.UsuarioDTOLogin;
import com.proyecto.infinitTask.app.dtos.response.UsuarioDTOResponse;
import com.proyecto.infinitTask.app.entities.Usuario;
import com.proyecto.infinitTask.app.services.IUsuarioService;
import com.proyecto.infinitTask.app.util.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("")
    public ResponseEntity<Object> login(@RequestBody UsuarioDTOLogin dtoLogin){
       try{
           UsuarioDTOResponse response= usuarioService.traerUsuarioLogin(dtoLogin);
           return new ResponseEntity<>(response, HttpStatus.OK);

       }catch (Exception e){
           return new ResponseEntity<>(new Mensaje(e.getMessage()), HttpStatus.BAD_REQUEST);
       }
    }

}
