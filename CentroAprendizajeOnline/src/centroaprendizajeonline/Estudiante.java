/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroaprendizajeonline;

/**
 *
 * @author CltControl
 */
public class Estudiante extends PersonalAcadémico{
    private Curso curso;   
    public Estudiante(String usuario, String clave, String nombre, String apellido, Curso curso){
        super( usuario, clave,nombre, apellido);
    }
    
    public void solicitarInscripcionCurso(Curso curso){
    //logic
    }
    
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    //logic
    }
}
