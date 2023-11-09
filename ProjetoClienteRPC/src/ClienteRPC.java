import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {

    private XmlRpcClient cliente;
    public ClienteRPC(String urlServidor) {
        try {
            // Configura o cliente para que ele possa se conectar ao servidor
            XmlRpcClientConfigImpl configuracaoCliente = new XmlRpcClientConfigImpl();
            configuracaoCliente.setServerURL(new URL(urlServidor));
            cliente = new XmlRpcClient();
            cliente.setConfig(configuracaoCliente);
        } catch (Exception exception) {
            System.err.println("JavaClient: " + exception);
        }
    }

    // Métodos para chamar as funções do servidor RPC

    public double calculaAreaQuadrado(double lado) throws Exception {
        Object[] parametros = new Object[]{lado};
        Double resultado = (Double) cliente.execute("Calc.calculaAreaQuadrado", parametros);
        return resultado;
    }

    public double calculaAreaTrianguloRetangulo(double base, double altura) throws Exception {
        Object[] parametros = new Object[]{base, altura};
        Double resultado = (Double) cliente.execute("Calc.calculaAreaTrianguloRetangulo", parametros);
        return resultado;
    }

    public double calculaAreaCircunferencia(double raio) throws Exception {
        Object[] parametros = new Object[]{raio};
        Double resultado = (Double) cliente.execute("Calc.calculaAreaCircunferencia", parametros);
        return resultado;
    }

    public double calculaAreaEsfera(double raio) throws Exception {
        Object[] parametros = new Object[]{raio};
        Double resultado = (Double) cliente.execute("Calc.calculaAreaEsfera", parametros);
        return resultado;
    }

    public double calculaVolumeEsfera(double raio) throws Exception {
        Object[] parametros = new Object[]{raio};
        Double resultado = (Double) cliente.execute("Calc.calculaVolumeEsfera", parametros);
        return resultado;
    }

    public double calculaAreaCilindro(double raio, double altura) throws Exception {
        Object[] parametros = new Object[]{raio, altura};
        Double resultado = (Double) cliente.execute("Calc.calculaAreaCilindro", parametros);
        return resultado;
    }

    public double calculaVolumeCilindro(double raio, double altura) throws Exception {
        Object[] parametros = new Object[]{raio, altura};
        Double resultado = (Double) cliente.execute("Calc.calculaVolumeCilindro", parametros);
        return resultado;
    }

    public double calculaAreaSuperficieCubo(double lado) throws Exception {
        Object[] parametros = new Object[]{lado};
        Double resultado = (Double) cliente.execute("Calc.calculaAreaSuperficieCubo", parametros);
        return resultado;
    }

    public double calculaVolumeCubo(double lado) throws Exception {
        Object[] parametros = new Object[]{lado};
        Double resultado = (Double) cliente.execute("Calc.calculaVolumeCubo", parametros);
        return resultado;
    }

    public boolean shutdownServer() throws Exception {
        Boolean resultado = (Boolean) cliente.execute("Calc.shutdownServer", new Object[]{});
        return resultado;
    }
}
