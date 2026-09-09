package co.edu.cun.fintech.risk.dto;

public class SolicitudCreditoDTO {
    private int edad;
    private double ingresosMensuales;
    private double deudasActuales;
    private int scoreCredito;
    private double montoSolicitado;

    public SolicitudCreditoDTO() {}

    public SolicitudCreditoDTO(int edad, double ingresosMensuales, double deudasActuales, int scoreCredito, double montoSolicitado) {
        this.edad = edad;
        this.ingresosMensuales = ingresosMensuales;
        this.deudasActuales = deudasActuales;
        this.scoreCredito = scoreCredito;
        this.montoSolicitado = montoSolicitado;
    }

    public int getEdad() { return edad; }
    public double getIngresosMensuales() { return ingresosMensuales; }
    public double getDeudasActuales() { return deudasActuales; }
    public int getScoreCredito() { return scoreCredito; }
    public double getMontoSolicitado() { return montoSolicitado; }
}
