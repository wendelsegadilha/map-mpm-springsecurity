package xyz.wendelsegadilha.mapeamentompm.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "USUARIO_ACESSO")
public class UsuarioAcesso implements Serializable {

    @EmbeddedId
    private UsuarioAcessoPK usuarioAcessoPK;

}
