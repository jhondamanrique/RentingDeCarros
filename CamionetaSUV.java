public class CamionetaSUV extends Vehiculo{
    private String TipoTraccion;
    private int CapacidadMaletero;
    public CamionetaSUV(){
    }
    public CamionetaSUV(String tipoTraccion, int capacidadMaletero) {
        TipoTraccion = tipoTraccion;
        CapacidadMaletero = capacidadMaletero;
    }
    public CamionetaSUV(String placa, String marca, String modelo, float precioDiario, String estado, String tipoTraccion, int capacidadMaletero) {
        super(placa, marca, modelo, precioDiario, estado);
        TipoTraccion = tipoTraccion;
        CapacidadMaletero = capacidadMaletero;
    }
    public String getTipoTraccion() {
        return TipoTraccion;
    }
    public void setTipoTraccion(String tipoTraccion) {
        TipoTraccion = tipoTraccion;
    }
    public int getCapacidadMaletero() {
        return CapacidadMaletero;
    }
    public void setCapacidadMaletero(int capacidadMaletero) {
        CapacidadMaletero = capacidadMaletero;
    }
    
}