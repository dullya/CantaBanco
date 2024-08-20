public class ContaTerminal {

    int numero = 0;
    String agencia;
    String nomeClinete;
    float  saldo = 0;


    public  void numero(int nummeroConta ){

        numero = nummeroConta;


    }

    public void informarAgencia(String numAgencia) {

        agencia = numAgencia;
    }

    public void incluirNome(String novoNome) {

        nomeClinete = novoNome;
    }

    public void depositar(float novoDesposito) {

        saldo = novoDesposito;
    }


}
