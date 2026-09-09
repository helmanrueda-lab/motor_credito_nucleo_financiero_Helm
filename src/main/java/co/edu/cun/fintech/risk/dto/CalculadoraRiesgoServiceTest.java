package co.edu.cun.fintech.risk.service;

import co.edu.cun.fintech.risk.dto.RespuestaRiesgoDTO;
import co.edu.cun.fintech.risk.dto.SolicitudCreditoDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraRiesgoServiceTest {

    private CalculadoraRiesgoService riesgoService;

    @BeforeEach
    void setUp() {
        this.riesgoService = new CalculadoraRiesgoService();
    }

    @Test
    @DisplayName("CP-UNI-001: Evaluación de Solicitud de Bajo Riesgo Aprobada")
    void testEvaluarSolicitud_Exitoso() {
        SolicitudCreditoDTO dto = new SolicitudCreditoDTO(28, 4500000.0, 900000.0, 780, 1200000.0);
        RespuestaRiesgoDTO respuesta = riesgoService.evaluarSolicitud(dto);

        assertNotNull(respuesta);
        assertEquals("APROBADO", respuesta.getEstado());
        assertEquals(1.8, respuesta.getTasaInteres(), 0.01);
        assertEquals(1080000.0, respuesta.getMontoMaximoAprobado(), 0.01);
        assertNull(respuesta.getMotivoRechazo());
    }

    @Test
    @DisplayName("CP-UNI-002: Rechazo Automático por Menor de Edad")
    void testEvaluarSolicitud_MenorDeEdad() {
        SolicitudCreditoDTO dto = new SolicitudCreditoDTO(17, 2000000.0, 0.0, 650, 500000.0);
        RespuestaRiesgoDTO respuesta = riesgoService.evaluarSolicitud(dto);

        assertNotNull(respuesta);
        assertEquals("RECHAZADO", respuesta.getEstado());
        assertEquals("El solicitante debe ser mayor de edad", respuesta.getMotivoRechazo());
    }

    @Test
    @DisplayName("CP-UNI-003: Lanzamiento de Excepción ante Monto Negativo")
    void testValidarEntradas_MontoNegativo() {
        SolicitudCreditoDTO dto = new SolicitudCreditoDTO(35, 3500000.0, 0.0, 700, -250000.0);

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> riesgoService.evaluarSolicitud(dto)
        );

        assertEquals("El monto solicitado debe ser mayor a cero", exception.getMessage());
    }
}
