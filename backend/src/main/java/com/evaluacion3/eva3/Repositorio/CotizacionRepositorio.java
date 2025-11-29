package com.evaluacion3.eva3.Repositorio;

import com.evaluacion3.eva3.Modelo.Cotizacion;

import org.springframework.data.jpa.repository.JpaRepository;

//maneja la persistencia de las cotizaciones, lo que muestra el detalle
//con mueble, variante
public interface CotizacionRepositorio extends JpaRepository<Cotizacion, Long> {
}