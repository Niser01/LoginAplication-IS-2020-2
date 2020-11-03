
package Control;

import Entidad.Sistema;
import Entidad.Usuario;
import Frontera.FramePrincipal;

public class ValidarLogin {
    
    private Sistema sistema = FramePrincipal.sistema;

    public ValidarLogin() {
    }
    
    public String verificarLogin(Usuario usuario){
        if(!verificarLogitudNombre(usuario.getNombre())){
           return("Longitud del nombre incorrecta");
        }
        if(!verificarLongitudPassowrd(usuario.getPassword())){
            return("Longitud de la contraseña incorrecta");
        }
        for(Usuario u: sistema.getUsuarios()){
            if(u.getNombre().equals(usuario.getNombre())&&u.getPassword().equals(usuario.getPassword())){
                return("Bienvenido");  
            }
        }
        return("Datos incorrectos");
    }
    
    public boolean verificarLogitudNombre(String nombre){
        return(nombre.length()> 1 && nombre.length()<=6);
    }
    
    public boolean verificarLongitudPassowrd(String password){
        return(password.length()>= 3 && password.length() <6);
    }
    
}
