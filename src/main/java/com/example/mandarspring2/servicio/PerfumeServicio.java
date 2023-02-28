package com.example.mandarspring2.servicio;

import com.example.mandarspring2.interfaces.InterfazPerfume;
import com.example.mandarspring2.interfazServicio.InterfazPerfumeServicio;
import com.example.mandarspring2.modelo.Perfume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PerfumeServicio implements InterfazPerfumeServicio {
    @Autowired
    private InterfazPerfume data;
    @Override
    public List<Perfume> listar() {
        return (List<Perfume>) data.findAll();
    }

    @Override
    public Optional<Perfume> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Perfume p) {
        int respuesta = 0;
        Perfume perfume=data.save(p);
        if (perfume.equals(null)){
            respuesta = 1;
        }
        return 0;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
