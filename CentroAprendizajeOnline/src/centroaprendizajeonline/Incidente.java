/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroaprendizajeonline;
import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author CltControl
 */
public class Incidente extends Usuario{
    
    protected int id;
    protected LocalDateTime fechaReportado;
    protected String estado;
    protected String título;
    protected String descripcion;
    protected List<?> logActualizaciones;
    protected LocalDateTime fechaCerrado;
    protected String tipo;
    
    public Incidente(String usuario, String clave, String nombre, String apellido){
        super( usuario, clave,nombre, apellido);
    }
    
    
}
