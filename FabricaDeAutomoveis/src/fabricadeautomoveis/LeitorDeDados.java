package fabricadeautomoveis;

import javax.swing.JOptionPane;

public class LeitorDeDados {

    private final int COR_AZUL = 1;
    private final int COR_VERMELHO = 2;
    private final int COR_AMARELO = 3;
    private final int COR_PRETO = 4;
    private final int COR_BRANCO = 5;
    
    private final int MODELO_PALIO = 1;
    private final int MODELO_UNO = 2;
    private final int MODELO_SIENA = 3;
    private final int MODELO_BRAVO = 4;
    private final int MODELO_500 = 5;
    private final int MODELO_IDEA = 6;
    
    private final int DIRECAO_ELETRICA = 1;
    private final int DIRECAO_HIDRAULICA = 2;
    
    int lerQuantidadeDePortas() {
        int qtdPortas = 0;
        while(qtdPortas != 2 && qtdPortas != 4){
            String portasStr = JOptionPane.showInputDialog("Informe a quantidade de portas (2 ou 4):");
            qtdPortas = Integer.parseInt(portasStr);
        }
        return qtdPortas;
    }

    String lerCor() {
        int cor = 99;
        while(cor < 1 || cor > 5) {
            String corStr = JOptionPane.showInputDialog("Selecione a cor desejada: \n"
                    + "1 - Azul \n"
                    + "2 - Vermelho \n"
                    + "3 - Amarelo \n"
                    + "4 - Preto \n"
                    + "5 - Branco");
            cor = Integer.parseInt(corStr);
        }
        String retorno = "";
        switch(cor){
            case COR_AZUL:
                retorno = "Azul";
                break;
            case COR_VERMELHO:
                retorno = "Vermelho";
                break;
            case COR_AMARELO:
                retorno = "Amarelo";
                break;
            case COR_PRETO:
                retorno = "Preto";
                break;
            case COR_BRANCO:
                retorno = "Branco";
                break;
        }
        return retorno;
    }

    double lerPotencia() {
        double potencia = 9.99;
        while (potencia < 1.0 || potencia > 2.2) {
            String potenciaStr = JOptionPane.showInputDialog("Informe a potência do motor:");
            potencia = Double.parseDouble(potenciaStr);
        }
        return potencia;
    }

    boolean lerCambioAutomatico() {
        int cambio = 999;
        while(cambio < 1 || cambio > 2) {
            String corStr = JOptionPane.showInputDialog("Possui câmbio automático?: \n"
                    + "1 - Não \n"
                    + "2 - Sim");
            cambio = Integer.parseInt(corStr);
        }
        return cambio == 2;
    }

    String lerModelo() {
        int modelo = 999;
        while (modelo < 1 || modelo > 6) {
            String modeloStr = JOptionPane.showInputDialog("Selecione o modelo: \n"
                    + "1 - Palio \n"
                    + "2 - Uno \n"
                    + "3 - Siena \n"
                    + "4 - Bravo \n"
                    + "5 - 500 \n"
                    + "6 - Idea");
            modelo = Integer.parseInt(modeloStr);
        }
        String retorno = "";
        switch (modelo) {
            case MODELO_PALIO:
                retorno = "Palio";
                break;
            case MODELO_UNO:
                retorno = "Uno";
                break;
            case MODELO_SIENA:
                retorno = "Siena";
                break;
            case MODELO_BRAVO:
                retorno = "Bravo";
                break;
            case MODELO_500:
                retorno = "500";
                break;
            case MODELO_IDEA:
                retorno = "Idea";
                break;
        }
        return retorno;
    }

    String lerDirecao() {
        int direcao = 999;
        while (direcao < 1 || direcao > 2) {
            String direcaostr = JOptionPane.showInputDialog("Selecione o tipo de direção: \n"
                    + "1 - Elétrica \n"
                    + "2 - Hidráulica");
            direcao = Integer.parseInt(direcaostr);
        }
        String retorno = "";
        switch (direcao) {
            case DIRECAO_ELETRICA:
                retorno = "Elétrica";
                break;
            case DIRECAO_HIDRAULICA:
                retorno = "Hidráulica";
                break;
        }
        return retorno;
    }

    boolean lerContinuarNoPrograma() {
        int opcaoContinuar = 999;
        while (opcaoContinuar < 1 || opcaoContinuar > 2) {
            String opcaoContinuarStr = JOptionPane.showInputDialog("Deseja continuar inserindo solicitações? \n"
                    + "1 - Sim \n"
                    + "2 - Não");
            opcaoContinuar = Integer.parseInt(opcaoContinuarStr);
        }
        
        return opcaoContinuar == 1;
    }

    
}
