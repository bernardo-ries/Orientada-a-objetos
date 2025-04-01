public class MainCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo();

        double raio = 7;
        c.setRaio(raio);
        System.out.println("Raio: " + c.getRaio());
        double area=c.calcularArea();
        System.out.println("Area: " + area);

    }
}
