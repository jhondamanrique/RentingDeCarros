public class CarroSedan extends Vehiculo{
    private String TipoCombustible;
    private String Transmision;
    public CarroSedan(){
    }
    public CarroSedan(String tipoCombustible, String transmision) {
        TipoCombustible = tipoCombustible;
        Transmision = transmision;
    }
    public CarroSedan(String placa, String marca, String modelo, float precioDiario, String estado, String tipoCombustible, String transmision) {
        super(placa, marca, modelo, precioDiario, estado);
        TipoCombustible = tipoCombustible;
        Transmision = transmision;
    }
    public String getTipoCombustible() {
        return TipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }
    public String getTransmision() {
        return Transmision;
    }
    public void setTransmision(String transmision) {
        Transmision = transmision;
    }
    
}