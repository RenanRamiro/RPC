import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ);
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do triângulo retângulo");
            System.out.println("3. Calcular área da circunferência");
            System.out.println("4. Calcular área da esfera");
            System.out.println("5. Calcular volume da esfera");
            System.out.println("6. Calcular área do cilindro");
            System.out.println("7. Calcular volume do cilindro");
            System.out.println("8. Calcular área de superfície do cubo");
            System.out.println("9. Calcular volume do cubo");
            System.out.println("10. Sair");
            
            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o lado do quadrado:");
                    double lado = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaAreaQuadrado(lado));
                    break;
                case 2:
                    System.out.println("Digite a base do triângulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Digite a altura do triângulo:");
                    double altura = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaAreaTrianguloRetangulo(base, altura));
                    break;
                    case 3:
                    System.out.println("Digite o raio da circunferência:");
                    double raio = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaAreaCircunferencia(raio));
                    break;
        
                case 4:
                    System.out.println("Digite o raio da esfera:");
                    raio = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaAreaEsfera(raio));
                    break;
        
                case 5:
                    System.out.println("Digite o raio da esfera:");
                    raio = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaVolumeEsfera(raio));
                    break;
        
                case 6:
                    System.out.println("Digite o raio do cilindro:");
                    raio = scanner.nextDouble();
                    System.out.println("Digite a altura do cilindro:");
                    altura = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaAreaCilindro(raio, altura));
                    break;
        
                case 7:
                    System.out.println("Digite o raio do cilindro:");
                    raio = scanner.nextDouble();
                    System.out.println("Digite a altura do cilindro:");
                    altura = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaVolumeCilindro(raio, altura));
                    break;
        
                case 8:
                    System.out.println("Digite o lado do cubo:");
                    lado = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaAreaSuperficieCubo(lado));
                    break;
        
                case 9:
                    System.out.println("Digite o lado do cubo:");
                    lado = scanner.nextDouble();
                    System.out.println("Resultado: " + rpc.calculaVolumeCubo(lado));
                    break;

                    
                case 10:
                    System.out.println("Encerrando o programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
