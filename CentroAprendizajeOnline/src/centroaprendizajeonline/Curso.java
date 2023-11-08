/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroaprendizajeonline;

/**
 *
 * @author CltControl
 */
public class Curso {
    private String id;
    private String nombre;
    private boolean disponible;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Curso(String id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }
    
}
