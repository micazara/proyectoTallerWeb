package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.ServicioLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorInicio {
    private ServicioLogin servicioLogin;

    @Autowired
    public ControladorInicio(ServicioLogin servicioLogin) {
        this.servicioLogin = servicioLogin;
    }

    @RequestMapping(path = "/inicio")
    public ModelAndView inicioLogueado() {

        return new ModelAndView("inicio");
    }

//    public void instanciarNiveles() {
//    	Nivel tierraDelFuego= new Nivel ();
//
//    }
}