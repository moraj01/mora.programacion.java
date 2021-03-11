package ej56;

public class ej56 {


    public static class Rectangulo {
        private static float base;
        private static float altura;

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public float getBase() {
            return base;
        }

        public void setBase(float base) {
            this.base = base;
        }

        public Rectangulo(float altura, float base) {
            this.altura = altura;
            this.base = base;
        }

        @Override
        public String toString() {
            return "Rectangulo{" +
                    "altura=" + altura +
                    ", base=" + base +
                    '}';
        }


        public static float calculaArea() {
            float area = base*altura/2;
            return area;
        }
        public static float calculaperimetro() {
            float perimetro = base*2+altura*2;
            return perimetro;
        }
    }


}
