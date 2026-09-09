package co.edu.cun.fintech.risk.service;

import co.edu.cun.fintech.risk.dto.RespuestaRiesgoDTO;
import co.edu.cun.fintech.risk.dto.SolicitudCreditoDTO;

public class CalculadoraRiesgoService {

    public RespuestaRiesgoDTO evaluarSolicitud(SolicitudCreditoDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("La solicitud no puede ser nula");
        }
        if (dto.getMontoSolicitado() <= 0) {
            throw new IllegalArgumentException("El monto solicitado debe ser mayor a cero");
        }
        if (dto.getEdad() < 18) {
            return new RespuestaRiesgoDTO("RECHAZADO", 0.0, 0.0, "El solicitante debe ser mayor de edad");
        }
        if (dto.getScoreCredito() < 300) {
            return new RespuestaRiesgoDTO("RECHAZADO", 0.0, 0.0, "Score crediticio insuficiente para aprobación");
        }

        double capacidadLibre = dto.getIngresosMensuales() - dto.getDeudasActuales();
        double cupoMaximoCalculado = capacidadLibre * 0.30;

        if (cupoMaximoCalculado <= 0) {
            return new RespuestaRiesgoDTO("RECHAZADO", 0.0, 0.0, "Capacidad de endeudamiento superada");
        }

        double tasaInteres = (dto.getScoreCredito() >= 750) ? 1.8 : 2.5;
        return new RespuestaRiesgoDTO("APROBADO", tasaInteres, cupoMaximoCalculado, null);
    }
}
