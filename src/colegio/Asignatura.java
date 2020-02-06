/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.ArrayList;

/**
 *
 * @author luisf
 */
public class Asignatura {
    private String nombre;
    private long codigo;
    private Profesor profesor;
    private Grado grado;
    
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Nota> notas;

    public Asignatura(String nombre, Profesor profesor, long codigo, Grado grado) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.codigo = codigo;
        this.grado = grado;
        
        this.estudiantes = new ArrayList();
        this.notas = new ArrayList();
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
