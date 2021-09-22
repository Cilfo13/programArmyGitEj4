


public class Pajaro {
    private String nombre;
    //Cantidad de tiempo que permanece en el aire en metros
    private int Capacidad;
    private Double peso;
    private String color;

    public Pajaro(String nombre, int Capacidad, Double peso, String color) {
        this.nombre = nombre;
        this.Capacidad = Capacidad;
        this.peso = peso;
        this.color = color;
    }
    
    public void volar(){
        System.out.println("El pajaro "+this.nombre+" voló "+ this.Capacidad+" mts");
    }
    public void hablar(){
        System.out.println("El pajaro "+this.color+" dijo pio pio");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
