package ej57;

public class ej57 {

    public static class Coche {
        private String Matricula;
        private String Color;
        private int N_puertas;
        private int caballos;
        private String Marca;
        private String Modelo;

        public Coche(String matricula, String color, int n_puertas, int caballos, String marca, String modelo) {
            Matricula = matricula;
            Color = color;
            N_puertas = n_puertas;
            this.caballos = caballos;
            Marca = marca;
            Modelo = modelo;
        }


        public String getMatricula() {
            return Matricula;
        }

        public void setMatricula(String matricula) {
            Matricula = matricula;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String color) {
            Color = color;
        }

        public int getN_puertas() {
            return N_puertas;
        }

        public void setN_puertas(int n_puertas) {
            N_puertas = n_puertas;
        }

        public int getCaballos() {
            return caballos;
        }

        public void setCaballos(int caballos) {
            this.caballos = caballos;
        }

        public String getMarca() {
            return Marca;
        }

        public void setMarca(String marca) {
            Marca = marca;
        }

        public String getModelo() {
            return Modelo;
        }

        public void setModelo(String modelo) {
            Modelo = modelo;
        }

        @Override
        public String toString() {
            return "Coche{" +
                    "Matricula='" + Matricula + '\'' +
                    ", Color='" + Color + '\'' +
                    ", N_puertas=" + N_puertas +
                    ", caballos=" + caballos +
                    ", Marca='" + Marca + '\'' +
                    ", Modelo='" + Modelo + '\'' +
                    '}';
        }
    }
}
