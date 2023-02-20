package com.flb.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flb.agenda.models.Contacto;
import com.flb.agenda.services.ContactoService;

@RestController
public class ContactoController {

    @Autowired
    ContactoService cService;

    @GetMapping("/contactos")
    List<Contacto> all() {
        return cService.findAll();
    }

    @GetMapping("contactos/{id}")
    Contacto findContacto(@PathVariable int id) {
        return cService.findById(id);
    }

    @DeleteMapping("/contactos/{id}")
    void deleteContacto(@PathVariable int id) {
        cService.deleteById(id);
    }

    @PostMapping("/contactos")
    Contacto saveContacto(@RequestBody Contacto contacto) {
        return cService.save(contacto);
    }

    @PutMapping("/contactos/{id}")
    void updateContacto(@PathVariable int id, @RequestBody Contacto contacto) {
        cService.update(id, contacto);
    }
}
