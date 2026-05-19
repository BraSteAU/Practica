import java.time.LocalDate;


public class contratoRenting extends Vehiculo {
    private String IdContrato;
    private int CedulaCliente;
    private LocalDate FechaInicio;
    private LocalDate FechaFinal;
    private int TotalDias;
    private float ValorTotal;

    public contratoRenting() {
        super();
    }

    public contratoRenting(String idContrato, int cedulaCliente, LocalDate fechaInicio, LocalDate fechaFinal,
            int totalDias, float valorTotal) {
        IdContrato = idContrato;
        CedulaCliente = cedulaCliente;
        FechaInicio = fechaInicio;
        FechaFinal = fechaFinal;
        TotalDias = totalDias;
        ValorTotal = valorTotal;
    }

    public String getIdContrato() {
        return IdContrato;
    }


    public int getCedulaCliente() {
        return CedulaCliente;
    }


    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        FechaFinal = fechaFinal;
    }

    public int getTotalDias() {
        return TotalDias;
    }

    public void setTotalDias(int totalDias) {
        TotalDias = totalDias;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }   
}