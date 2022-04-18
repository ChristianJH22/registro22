package pe.com.serviciosrest.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor // METODO DE CONSTRUCCION CON PARAMETROS
@NoArgsConstructor // METODO DE CONSTRUCCION SIN PARAMETROS
@Data //Metodo Get y SET


@Entity(name = "Cliente")
@Table(name = "t_cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
    
    
    @Id //para identificar la clave primaria
    @Column(name = "codcli")//para identificar el nombre de la columna
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincrement
    private long codigo;
    @Column(name = "nomcli")
    private String nombre;
    @Column(name = "apepcli")
    private String apellidopaterno;
    @Column(name = "apemcli")
    private String apellidomaterno;
    @Column(name = "dnicli")
    private String dni;
    @Column(name = "dircli")
    private String direccion;
    @Column(name = "telcli")
    private String telefono;
    @Column(name = "celcli")
    private String celular;
    @Column(name = "corcli")
    private String correo;
    @Column(name = "sexcli")
    private String sexo;
    @Column(name = "estcli")
    private boolean estado;
    @ManyToOne//MUCHOS A UNO
    @JoinColumn(name="coddis",nullable = false)
    private Distrito distrito;
    
    
}
