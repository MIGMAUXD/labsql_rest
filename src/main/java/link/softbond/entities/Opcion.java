package link.softbond.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
public class Opcion{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    @ManyToOne
    @JoinColumn(name="id")
    private Consulta consulta;

    @ManyToOne
    @JoinColumn(name="id")
    private Examen examen;

    private Timestamp fecha;

    @ManyToOne
    @JoinColumn(name="id")
    private Usuario usuario;
}
