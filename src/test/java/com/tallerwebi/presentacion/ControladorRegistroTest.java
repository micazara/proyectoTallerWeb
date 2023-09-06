package com.tallerwebi.presentacion;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ControladorRegistroTest {

    // tdd para testetar controlador de registro. se prueban metodos q estann en el registro
    // la existencia de esta prueba da a entender que tambien hay un controlador registro
    // los metodos q pruebo aca estan en el controlador registro

    // es una clase
    ControladorRegistro controladorRegistro = new ControladorRegistro();

    @Test
    public void siIngresoEmailYClaveSeRegistraCorrectamente() {
        //1 given o dado que-> precondicion
        //2 when o cuando -> ejecucion
        ModelAndView mav = whenRegistroUsuario("mica@gmail.com");
        //3 then -> validacion
        thenElRegistrosoEsExitoso(mav);

        // separar cada etapa en un metodo
    }

    @Test
    public void siElEmailEstaVacioElRegistroFalla() {
        //1 given o dado que-> precondicion
        //2 when o cuando -> ejecucion
        ModelAndView mav = whenRegistroUsuario("");
        //3 then -> validacion
        thenElRegistroFallaPorqueElEmailEstaVacio(mav);

        // separar cada etapa en un metodo
    }

    @Test
    public void siElEmailContieneMenosDe8CaracteresElRegistroFalla() {
        //1 given o dado que-> precondicion
        //2 when o cuando -> ejecucion
        ModelAndView mav = whenRegistroUsuario("@gmail.com");
        //3 then -> validacion
        thenElRegistroFallaPorqueElEmailContieneMenosDe8Caracteres(mav);

        // separar cada etapa en un metodo
    }

    @Test
    public void siElEmailNoContieneArrobaElRegistroFalla() {
        //1 given o dado que-> precondicion
        //2 when o cuando -> ejecucion
        ModelAndView mav = whenRegistroUsuario("sahdkajshdkajshdjashdkgmail.com");
        //3 then -> validacion
        thenElRegistroFallaPorqueElEmailNoContieneArroba(mav);
    }

    @Test
    public void siElEmailContieneMayusculasElRegistroFalla() {
        //1 given o dado que-> precondicion
        //2 when o cuando -> ejecucion
        ModelAndView mav = whenRegistroUsuario("AAAAA@gmail.com");
        //3 then -> validacion
        thenElRegistroFallaPorqueElEmailContieneMayusculas(mav);

        // separar cada etapa en un metodo
    }

    private void thenElRegistroFallaPorqueElEmailEstaVacio(ModelAndView mav) {
        assertThat(mav.getModel().get("mensaje").toString(), equalToIgnoringCase("El email no puede estar vacio"));
        assertThat(mav.getViewName(), equalToIgnoringCase("registro"));

    }

    private void thenElRegistroFallaPorqueElEmailContieneMenosDe8Caracteres(ModelAndView mav) {
        assertThat(mav.getModel().get("mensaje").toString(), equalToIgnoringCase("El email debe tener como minimo 11 caracteres"));
        assertThat(mav.getViewName(), equalToIgnoringCase("registro"));

    }

    private void thenElRegistroFallaPorqueElEmailNoContieneArroba(ModelAndView mav) {
        assertThat(mav.getModel().get("mensaje").toString(), equalToIgnoringCase("El email debe contener el caracter: @"));
        assertThat(mav.getViewName(), equalToIgnoringCase("registro"));

    }

    private void thenElRegistroFallaPorqueElEmailContieneMayusculas(ModelAndView mav) {
        assertThat(mav.getModel().get("mensaje").toString(), equalToIgnoringCase("El email no puede contener mayusculas"));
        assertThat(mav.getViewName(), equalToIgnoringCase("registro"));

    }

    private ModelAndView whenRegistroUsuario(String email) {

        // devuelve model and view. Recuro el mv que duelve el controlador
        ModelAndView mav = controladorRegistro.registrar(email);
        return mav;
    }


    private void thenElRegistrosoEsExitoso(ModelAndView mav) {
        // mensaje: el registro fue exitoso
        // voy a vista login
        //
        assertThat(mav.getModel().get("mensaje").toString(), equalToIgnoringCase("El registro fue exitoso"));
        assertThat(mav.getViewName(), equalToIgnoringCase("login"));
    }


}