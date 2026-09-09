package co.edu.cun.fintech.risk.dto;

public class RespuestaRiesgoDTO {
    private String estado;
    private double tasaInteres;
    private double montoMaximoAprobado;
    private String motivoRechazo;

    public RespuestaRiesgoDTO() {}

    public RespuestaRiesgoDTO(String estado, double tasaInteres, double montoMaximoAprobado, String motivoRechazo) {
        this.estado = estado;
        this.tasaInteres = tasaInteres;
        this.montoMaximoAprobado = montoMaximoAprobado;
        this.motivoRechazo = motivoRechazo;
    }

    public String getEstado() { return estado; }
    public double getTasaInteres() { return tasaInteres; }
    public double getMontoMaximoAprobado() { return montoMaximoAprobado; }
    public String getMotivoRechazo() { return motivoRechazo; }
}
