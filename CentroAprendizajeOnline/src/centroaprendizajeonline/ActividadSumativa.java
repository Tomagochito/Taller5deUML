/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroaprendizajeonline;

import java.time.LocalDateTime;

/**
 *
 * @author CltControl
 */
public class ActividadSumativa {
    private String título;
    private LocalDateTime fechaDeEntrega;
    private float puntajeMáximo;
    private String contenido;
    private float calificacion;
    private String id;

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public LocalDateTime getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(LocalDateTime fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public float getPuntajeMáximo() {
        return puntajeMáximo;
    }

    public void setPuntajeMáximo(float puntajeMáximo) {
        this.puntajeMáximo = puntajeMáximo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActividadSumativa(String título, LocalDateTime fechaDeEntrega, float puntajeMáximo, String contenido, float calificacion, String id) {
        this.título = título;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMáximo = puntajeMáximo;
        this.contenido = contenido;
        this.calificacion = calificacion;
        this.id = id;
    }
    
}
