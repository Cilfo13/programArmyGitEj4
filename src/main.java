
public class main {
    public static void main(String[] args) {
        //Pongan las clases acá :)
        Pajaro piolin = new Pajaro("Piolin", 15, 20d, "Amarillo");
        piolin.hablar();
        piolin.volar();
        Conejo conejo = new Conejo("Copito","Blanco","El conejo duracell", 48.6, 10, true);
        System.out.println(conejo.toString());
    }    
}
