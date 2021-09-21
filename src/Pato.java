/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cin89
 */
public class Pato {

        private String nombre;
        private String tipo;
        private int edad;

        public Pato(String nombre, String tipo, int edad) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.edad = edad;
        }

        public void volar() {
            System.out.println("el pato esta volando");
        }

        public void nadar() {
            System.out.println("el pato esta nadando");
        }

        public void caminar() {
            System.out.println("el pato esta caminando");
        }

    
}
