package com.portfolio.ejz.Security.Service;

import com.portfolio.ejz.Security.Entity.Usuario;
import com.portfolio.ejz.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.context.annotation.MBeanExportConfiguration.SpecificPlatform.get;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
    
}
