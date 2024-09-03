package nova.infrastructure.unidad.adapter.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "unidad", schema = "comialex")
public class UnidadModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @NotNull
    @Column(name = "clave", nullable = false, length = 10)
    private String clave;

    @Size(max = 100)
    @NotNull
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @OneToOne(mappedBy = "unidad")
    private UnidadDireccionModel direccion;

    @OneToOne(mappedBy = "unidad")
    private UnidadTelefonoModel telefono;

}