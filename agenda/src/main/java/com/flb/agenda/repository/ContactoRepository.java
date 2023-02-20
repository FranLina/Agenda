package com.flb.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.agenda.models.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}
