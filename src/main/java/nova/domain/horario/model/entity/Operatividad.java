package nova.domain.horario.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Operatividad {
    private Integer id;
    private String nombre;
    private List<Horario> horarios;

    public Operatividad(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}