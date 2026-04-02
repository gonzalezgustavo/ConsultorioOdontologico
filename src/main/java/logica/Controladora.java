
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis=new ControladoraPersistencia();
    
    public void crearUsuario( String nombreUsuario, String contrasenia,String rol){
        
        Usuario usu= new Usuario( );
        
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        controlPersis.crearUsuario(usu);
    
    }

    public List<Usuario> getUsuarios() {
        
        return controlPersis.traerUsuarios();
     }

    public void eliminarUsuario(int id) {
    
        controlPersis.eliminarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
    return controlPersis.traerUsuario(id);
            
            }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

 
    
}
