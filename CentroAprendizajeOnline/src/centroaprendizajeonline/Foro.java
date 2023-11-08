/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroaprendizajeonline;

/**
 *
 * @author CltControl
 */
public class Foro {
    
    private String id;
    private String temática;
    private int numeroDeComentarios;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemática() {
        return temática;
    }

    public void setTemática(String temática) {
        this.temática = temática;
    }

    public int getNumeroDeComentarios() {
        return numeroDeComentarios;
    }

    public void setNumeroDeComentarios(int numeroDeComentarios) {
        this.numeroDeComentarios = numeroDeComentarios;
    }

    public Foro(String id, String temática, int numeroDeComentarios) {
        this.id = id;
        this.temática = temática;
        this.numeroDeComentarios = numeroDeComentarios;
    }
    
    
}
