package fabricadeautomoveis;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        LeitorDeDados leitor = new LeitorDeDados();
        ImpressorDeSolicitacaoDeCompra impressor = new ImpressorDeSolicitacaoDeCompra();
        boolean permanecerNoPrograma = true;
        do {
            SolicitacaoDeFabricacao solicitacao = new SolicitacaoDeFabricacao();
            solicitacao.potencia = leitor.lerPotencia();
            solicitacao.quantidadeDePortas = leitor.lerQuantidadeDePortas();
            solicitacao.cor = leitor.lerCor();
            solicitacao.cambioAutomatico = leitor.lerCambioAutomatico();
            solicitacao.modelo = leitor.lerModelo();
            solicitacao.direcao = leitor.lerDirecao();
            
            impressor.imprimir(solicitacao);
            
            permanecerNoPrograma = leitor.lerContinuarNoPrograma();
        } while (permanecerNoPrograma);
    }
    
}
