package com.example.mandarspring2.controlador;

import com.example.mandarspring2.interfazServicio.InterfazPerfumeServicio;
import com.example.mandarspring2.modelo.Perfume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private InterfazPerfumeServicio servicio;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Perfume> perfumes = servicio.listar();
        model.addAttribute("perfumes", perfumes);
        return "index";
    }
    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("perfume", new Perfume());
        return "form";
    }
    @PostMapping("/save")
    public String save(@Validated Perfume p, Model model){
        servicio.save(p);
        return "redirect:/listar";
    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Perfume>perfume=servicio.listarId(id);
        model.addAttribute("perfume", perfume);
        return "form";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(Model model, @PathVariable int id){
        servicio.delete(id);
        return "redirect:/listar";
    }

}
