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
public class Tarea extends ActividadSumativa {
  private LocalDateTime fechaDePublicacion;

    public LocalDateTime getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDateTime fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Tarea(LocalDateTime fechaDePublicacion, String título, LocalDateTime fechaDeEntrega, float puntajeMáximo, String contenido, float calificacion, String id) {
        super( título,  fechaDeEntrega,  puntajeMáximo,  contenido,  calificacion,  id);
        this.fechaDePublicacion = fechaDePublicacion;
    }
  
}
