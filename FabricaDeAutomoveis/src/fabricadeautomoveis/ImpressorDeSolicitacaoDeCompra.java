package fabricadeautomoveis;

public class ImpressorDeSolicitacaoDeCompra {

    void imprimir(SolicitacaoDeFabricacao solicitacao){
        System.out.println("+--------------------------------------------------------------------------------+");
        System.out.println("Modelo: " +solicitacao.modelo);
        System.out.println("Cor: " +solicitacao.cor);
        System.out.println("Qtd. Portas: " +solicitacao.quantidadeDePortas);
        
        String cambio = "";
        if(solicitacao.cambioAutomatico) {
            cambio = "Sim";
        } else {
            cambio = "Não";
        }
        
        System.out.println("Qtd. Portas: " + cambio);
        System.out.println("Tipo de direção: " + solicitacao.direcao);
        System.out.println("+--------------------------------------------------------------------------------+");
        System.out.println("");
    }
    
}
