package com.controller.bean;

import com.primefaces.dao.ContactoEmergenciaDAO;
import com.primefaces.dto.ContactoEmergencia;
import com.primefaces.dto.Persona;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author OscarEsteban
 */
@SessionScoped
@ManagedBean
@ViewScoped
public class ListaBeanContactoEmergencia extends Persona {

    private List<ContactoEmergencia> ContactosEmergencia;
    private ContactoEmergencia contactoEmergencia;
    private ContactoEmergenciaDAO emergenciaDAO;

    public List<ContactoEmergencia> getContactosEmergencia() {
        this.ContactosEmergencia = emergenciaDAO.obtenerTodos();
        return ContactosEmergencia;
    }

    public void setContactosEmergencia(List<ContactoEmergencia> ContactosEmergencia) {
        this.ContactosEmergencia = ContactosEmergencia;
    }

    public ListaBeanContactoEmergencia() {
        emergenciaDAO = new ContactoEmergenciaDAO();
    }

    @PostConstruct
    public void init() {
        contactoEmergencia = new ContactoEmergencia();
    }
//
//    private List<ContactoEmergencia> cargarContactos() {
//        ContactoEmergenciaDAO personaDAO = new ContactoEmergenciaDAO();
//        return personaDAO.obtenerTodos();
//    }

    public String regresar() {
        return "index";
    }

}
