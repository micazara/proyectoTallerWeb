package com.tallerwebi.presentacion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorInicio {


        @RequestMapping(path = "/inicio")
        public ModelAndView inicioLogueado() {

            return new ModelAndView("inicio");
        }

    @GetMapping("/inicio")
    public String someCondition(Model model) {

        boolean someCondition = true;
        model.addAttribute("someCondition", someCondition);
        // Retorna la vista que utilizará Thymeleaf
        return "inicio";
    }
}