package com.evaluacion3.eva3.Repositorio;

import com.evaluacion3.eva3.Modelo.Mueble;
import com.evaluacion3.eva3.Modelo.EstadoMueble;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

//se encarga de manejar las operaciones de base de datos relacionadas con los muebles
public interface MuebleRepositorio extends JpaRepository<Mueble, Long> {
    List<Mueble> findByEstado(EstadoMueble estado);
}