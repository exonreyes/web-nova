package nova.domain.horario.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nova.domain.unidad.model.entity.Unidad;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Horario {
    private Integer id;
    private Unidad unidad;
    private Operatividad operatividad;
    private LocalTime apertura;
    private LocalTime cierre;

    public Horario(Integer id, Operatividad operatividad, LocalTime apertura, LocalTime cierre) {
        this.id = id;
        this.operatividad = operatividad;
        this.apertura = apertura;
        this.cierre = cierre;
    }
}