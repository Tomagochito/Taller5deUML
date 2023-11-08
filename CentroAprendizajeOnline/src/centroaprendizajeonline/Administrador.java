/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroaprendizajeonline;

/**
 *
 * @author CltControl
 */
public class Administrador extends Usuario {
    public Administrador(String usuario, String clave, String nombre, String apellido){
    super( usuario, clave,nombre, apellido);
    }
    
    public void agregarUsuarioConRoles(String usuario,String clave){
        //logic
    }

    public void asignarPermiso(String usuario){
    //logic
    }

    public void actualizarSoftware(){
    //logic
    }
    
    public void asignarResponsable(Curso curso, Profesor responsable){
    //logic
    }
}
