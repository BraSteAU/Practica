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

    public void setIdContrato(String idContrato) {
        IdContrato = idContrato;
    }

    public int getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        CedulaCliente = cedulaCliente;
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

    @Override
    public String toString() {
        return "ID contrato: " + IdContrato +
               "\nCedula cliente: " + CedulaCliente +
               "\nPlaca: " + getPlaca() +
               "\nFecha inicio: " + FechaInicio +
               "\nFecha fin: " + FechaFinal +
               "\nTotal dias: " + TotalDias +
               "\nValor total: " + ValorTotal +
               "\n---------------------------";
    }
}