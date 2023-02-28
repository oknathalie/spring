package com.example.mandarspring2.interfaces;

import com.example.mandarspring2.modelo.Perfume;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfazPerfume extends CrudRepository<Perfume, Integer> {
}
