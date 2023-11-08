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
public class Evaluación extends ActividadSumativa {
    private int límiteDeTiempo;

    public int getLímiteDeTiempo() {
        return límiteDeTiempo;
    }

    public void setLímiteDeTiempo(int límiteDeTiempo) {
        this.límiteDeTiempo = límiteDeTiempo;
    }

    public Evaluación(int límiteDeTiempo,String título, LocalDateTime fechaDeEntrega, float puntajeMáximo, String contenido, float calificacion, String id) {
        super( título,  fechaDeEntrega,  puntajeMáximo,  contenido,  calificacion,  id);
        this.límiteDeTiempo = límiteDeTiempo;
    }
    
}
