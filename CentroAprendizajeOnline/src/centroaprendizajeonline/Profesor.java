/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroaprendizajeonline;

/**
 *
 * @author CltControl
 */
public class Profesor extends PersonalAcadémico{
    private Curso curso;
    public Profesor(String usuario, String clave, String nombre, String apellido, Curso curso){
        super( usuario, clave,nombre, apellido);
        
    }
    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    //logic
    }
    
    public void calificarActividadSumativa(Curso curso,Estudiante estudiante, ActividadSumativa actividadSumativa){
    //logic
    }
    
    public void aceptaarInscripcion(Curso curso, String usuarioEstudiante){
    //logic
    }
    
    public void crearNuevoForo(Foro foro){
    //logic
    }
}
