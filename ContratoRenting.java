public class ContratoRenting{
    private String IdContrato;
    private String CedulaCliente;
    private String PlacaVehiculo;
    private String FechaInicio;
    private String FechaFin;
    private int DiasAlquilados;
    private float ValorTotal;
    public ContratoRenting(){
    }
    public ContratoRenting(String idContrato, String cedulaCliente, String placaVehiculo, String fechaInicio,
            String fechaFin, int diasAlquilados, float valorTotal) {
        IdContrato = idContrato;
        CedulaCliente = cedulaCliente;
        PlacaVehiculo = placaVehiculo;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
        DiasAlquilados = diasAlquilados;
        ValorTotal = valorTotal;
    }
    public String getIdContrato() {
        return IdContrato;
    }
    public void setIdContrato(String idContrato) {
        IdContrato = idContrato;
    }
    public String getCedulaCliente() {
        return CedulaCliente;
    }
    public void setCedulaCliente(String cedulaCliente) {
        CedulaCliente = cedulaCliente;
    }
    public String getPlacaVehiculo() {
        return PlacaVehiculo;
    }
    public void setPlacaVehiculo(String placaVehiculo) {
        PlacaVehiculo = placaVehiculo;
    }
    public String getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return FechaFin;
    }
    public void setFechaFin(String fechaFin) {
        FechaFin = fechaFin;
    }
    public int getDiasAlquilados() {
        return DiasAlquilados;
    }
    public void setDiasAlquilados(int diasAlquilados) {
        DiasAlquilados = diasAlquilados;
    }
    public float getValorTotal() {
        return ValorTotal;
    }
    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }
    public void mostrarContrato(){
        System.out.println("ID Contrato: " + IdContrato);
        System.out.println("Cédula Cliente: " + CedulaCliente);
        System.out.println("Placa Vehículo: " + PlacaVehiculo);
        System.out.println("Días Alquilados: " + DiasAlquilados);
        System.out.println("Valor Total: " + ValorTotal);
    }
}