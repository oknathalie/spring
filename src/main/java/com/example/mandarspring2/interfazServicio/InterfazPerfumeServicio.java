package com.example.mandarspring2.interfazServicio;

import com.example.mandarspring2.modelo.Perfume;

import java.util.List;
import java.util.Optional;

public interface InterfazPerfumeServicio {
    public List<Perfume>listar();
    public Optional<Perfume>listarId(int id);
    public int save(Perfume p);
    public void delete(int id);



}
