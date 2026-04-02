
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    
    HorarioJpaController horaJPA= new HorarioJpaController();
    OdontologoJpaController odontoJPA= new OdontologoJpaController();
    PacienteJpaController pacJPA=new PacienteJpaController();
    PersonaJpaController perJPA=new PersonaJpaController();
    ResponsableJpaController respJPA=new ResponsableJpaController();
    SecretarioJpaController secreJPA=new SecretarioJpaController();
    TurnoJpaController turnJPA=new TurnoJpaController();
    UsuarioJpaController usuJPA=new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
    
        usuJPA.create(usu);
    }

    public List<Usuario> traerUsuarios() {
     
        return usuJPA.findUsuarioEntities();
    }

    public void eliminarUsuario(int id) {
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

    public Usuario traerUsuario(int id) {
      
        return usuJPA.findUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
