package supertateti;

import java.util.ArrayList;
import java.util.Iterator;

public class Sistema {
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    public void pushUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    public boolean usuarioValido(Usuario usuario){
        Iterator<Usuario> it = listaUsuarios.iterator();
        boolean esta = false;
        while(!esta || it.hasNext()){
            Usuario a = it.next();
            if(a.getAlias().equals(usuario.getAlias())){
                esta = true;
            }
        }
        if(!esta){
            pushUsuario(usuario);
        }
        else{
            System.out.println("Usuario ya ingresado, intente nuevamente");
        }
    }
    
}
