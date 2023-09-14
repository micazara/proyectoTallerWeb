package com.tallerwebi.presentacion;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorMostrarArticulo {

@RequestMapping(path = "/darDeAltaArticulo", method = RequestMethod.POST)
    public ModelAndView recibirDatosDelArticulo(@ModelAttribute("articulo") Articulo articulo){

    ModelMap model = new ModelMap();
    model.put("cod", articulo.getCod());
    model.put("descripcion", articulo.getDescripcion());

    return new ModelAndView("mostrarArticulo", model);
    }

    @RequestMapping(path = "/darDeAltaArticulo")
public ModelAndView mostrarArticulo(){
    ModelMap model = new ModelMap();
    return new ModelAndView("darDeAltaArticulo", model);
    }


}
