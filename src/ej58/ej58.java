package ej58;

public class ej58 {
    public static class Tiempo{
        private int Hora;
        private int Minuto;
        private int Segundo;


        public Tiempo(int hora, int minuto, int segundo) {
            Hora = hora;
            Minuto = minuto;
            Segundo = segundo;
        }

        public int getHora() {
            return Hora;
        }

        public void setHora(int hora) {
            Hora = hora;
        }

        public int getMinuto() {
            return Minuto;
        }

        public void setMinuto(int minuto) {
            Minuto = minuto;
        }

        public int getSegundo() {
            return Segundo;
        }

        public void setSegundo(int segundo) {
            Segundo = segundo;
        }

        @Override
        public String toString() {
            return "Hora: " +
                    Hora + "h" +
                    ", " + Minuto + "m"
                    + ", " + Segundo + "s";
        }
    }
}
