public class Conejo {

    String nombre, color, raza;
    Double peso;
    Integer edad;
    Boolean estaVivo;

    public Conejo() {
    }

    public Conejo(String nombre, String color, String raza, Double peso, Integer edad, Boolean estaVivo) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.estaVivo = estaVivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(Boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    @Override
    public String toString() {
        return "Conejo{" + "nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", peso=" + peso + ", edad=" + edad + ", estaVivo=" + estaVivo + '}';
    }
    
}