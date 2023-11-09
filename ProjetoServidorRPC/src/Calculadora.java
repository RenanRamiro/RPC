public class Calculadora {
    
    private ServidorRPC servidorRPC; // Referência ao servidor


    // Calcula a área de um quadrado dado o seu lado.
    public double calculaAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Calcula a área de um triângulo retângulo dados sua base e altura.
    public double calculaAreaTrianguloRetangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Calcula a área de uma circunferência dado seu raio.
    public double calculaAreaCircunferencia(double raio) {
        return Math.PI * raio * raio;
    }

    // Calcula a área de superfície de uma esfera dado seu raio.
    public double calculaAreaEsfera(double raio) {
        return 4 * Math.PI * raio * raio;
    }

    // Calcula o volume de uma esfera dado seu raio.
    public double calculaVolumeEsfera(double raio) {
        return (4/3) * Math.PI * raio * raio * raio;
    }

    // Calcula a área de superfície de um cilindro dados seu raio e altura.
    public double calculaAreaCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (altura + raio);
    }

    // Calcula o volume de um cilindro dados seu raio e altura.
    public double calculaVolumeCilindro(double raio, double altura) {
        return Math.PI * raio * raio * altura;
    }

    // Calcula a área de superfície de um cubo dado seu lado.
    public double calculaAreaSuperficieCubo(double lado) {
        return 6 * lado * lado;
    }

    // Calcula o volume de um cubo dado seu lado.
    public double calculaVolumeCubo(double lado) {
        return lado * lado * lado;
    }

}
