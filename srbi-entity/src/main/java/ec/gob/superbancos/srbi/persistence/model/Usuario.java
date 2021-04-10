package ec.gob.superbancos.srbi.persistence.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ec.gob.superbancos.srbi.persistence.deser.MultiDateDeserializer;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "srbi_usuario")
public class Usuario implements Serializable {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    @Column(name = "id_usuario_creacion")
    private long idUsuarioCreacion;
    //@JsonDeserialize(using = MultiDateDeserializer.class)
    @Column(name = "fecha_modificacion")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Timestamp fechaModificacion;
    private long intento;
    private String ip;
    private String contrasenia;
    @Column(name = "id_usuario_modificacion")
    private long idUsuarioModificacion;
    //@JsonDeserialize(using = MultiDateDeserializer.class)
    @Column(name = "fecha_creacion")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Timestamp fechaCreacion;
    private long estado;
    @Column(name = "id_departamento")
    private long idDepartamento;
    @Column(name = "correo_empresarial")
    private String correoEmpresarial;

    public Usuario() {

    }

    public Usuario(long id, String login, long idUsuarioCreacion, Timestamp fechaModificacion, long intento, String ip, String contrasenia, long idUsuarioModificacion, Timestamp fechaCreacion, long estado, long idDepartamento, String correoEmpresarial) {
        //Timestamp tsFM=new Timestamp(fechaModificacion.getTime());
        //Timestamp tsFC=new Timestamp(fechaCreacion.getTime());
        this.id = id;
        this.login = login;
        this.idUsuarioCreacion = idUsuarioCreacion;
        this.fechaModificacion = fechaModificacion;
        this.intento = intento;
        this.ip = ip;
        this.contrasenia = contrasenia;
        this.idUsuarioModificacion = idUsuarioModificacion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.idDepartamento = idDepartamento;
        this.correoEmpresarial = correoEmpresarial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getIdUsuarioCreacion() {
        return idUsuarioCreacion;
    }

    public void setIdUsuarioCreacion(long idUsuarioCreacion) {
        this.idUsuarioCreacion = idUsuarioCreacion;
    }

    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        //Timestamp tsFM=new Timestamp(fechaModificacion.getTime());
        this.fechaModificacion = fechaModificacion;
    }

    public long getIntento() {
        return intento;
    }

    public void setIntento(long intento) {
        this.intento = intento;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public long getIdUsuarioModificacion() {
        return idUsuarioModificacion;
    }

    public void setIdUsuarioModificacion(long idUsuarioModificacion) {
        this.idUsuarioModificacion = idUsuarioModificacion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        //Timestamp tsFC=new Timestamp(fechaModificacion.getTime());
        this.fechaCreacion = fechaCreacion;
    }

    public long getEstado() {
        return estado;
    }

    public void setEstado(long estado) {
        this.estado = estado;
    }

    public long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getCorreoEmpresarial() {
        return correoEmpresarial;
    }

    public void setCorreoEmpresarial(String correoEmpresarial) {
        this.correoEmpresarial = correoEmpresarial;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == 0) ? 0 : Long.valueOf(id).hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id == 0) {
            return other.id == 0;
        } else return id == other.id;
    }

}
