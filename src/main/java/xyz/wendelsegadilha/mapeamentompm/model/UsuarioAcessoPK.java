package xyz.wendelsegadilha.mapeamentompm.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class UsuarioAcessoPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "usuario_fk"))
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "acesso_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "acesso_fk"))
    private Acesso acesso;
}
