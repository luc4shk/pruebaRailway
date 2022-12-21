
package com.servicio.admisiones.controller;

import com.servicio.admisiones.models.Aspirante;
import com.servicio.admisiones.services.AspiranteServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class AspiranteController {
    
    @Autowired
    private AspiranteServicio service;
    
    @GetMapping("/")
    public String listar(Model model){
        List<Aspirante> aspirantes=service.listar();
        model.addAttribute("aspirantes", aspirantes);
        return "index";
    }
    
    @GetMapping("/aspirante/nuevo")
    public String mostrarFormAspirantes(Model model){
        model.addAttribute("aspirante", new Aspirante());
        return "aspirante_form";
    }

    @PostMapping("/aspirante/guardar")
    public String guardarAspirante(Aspirante aspirante){
        service.guardar(aspirante);
        return "redirect:/";
    }

    @GetMapping("/aspirante/editar/{id}")
    public ModelAndView mostrarFormEditarAspirantes(@PathVariable(name = "id") Integer id){
        ModelAndView modelo = new ModelAndView("aspirante_editar");
        modelo.addObject("aspirante", service.listarId(id));
        return modelo;
    }


    @GetMapping("/aspirante/eliminar/{id}")
    public String eliminarAspirante(@PathVariable(name = "id") Integer id){
        service.delete(id);
        return "redirect:/";
    }
}
