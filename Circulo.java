public class Circulo {
    private double raio;

    public Circulo() {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
