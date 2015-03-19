package caaixa.eletronico;

import javax.swing.JOptionPane;

public class CaaixaEletronico {
    public static void main(String[] args) {

        Conta c = new Conta();
        
        Banco b = new Banco();
        
        String nome, numero, agencia, deposito, saque;
        Integer opcao = -1;
        Boolean deucerto;
        
        
        
        JOptionPane.showMessageDialog(null,"ABERTURA DE CONTA");
        
        nome = JOptionPane.showInputDialog("Informe o nome: ");
        numero = JOptionPane.showInputDialog("Informe o numero: ");
        agencia = JOptionPane.showInputDialog("Informe a agencia: ");
        
        c.Abrir(nome, agencia, numero);
        
        while(opcao!=0)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Caixa Eletronico\n\n"
                                            +"1 - Abrir\n"
                                            +"2 - Depositar\n"
                                            +"3 - Sacar\n"
                                            +"4 - Saldo\n"
                                            +"5 - Fechar\n"
                                            +"6 - Resumo"
                                            +"7 - Verificar Banco\n"
                                            +"8 - Sair"));
            switch(opcao)
            {
                case 1:
                    
                    break;

                    case 2:
                    
                        break;
                            
                        case 3:
                    
                            break;
                                
                            case 4:
                    
                                break;
                                    
                                case 5:
                    
                                    break;
                                        
                                    case 6:
                    
                                        break;
                                        
                                        case 7:
                    
                                            break;
                                            
                                            case 8:
                    
                                                break;
            }
        }
        JOptionPane.showMessageDialog(null,"DEPOSITO");
        deposito = JOptionPane.showInputDialog("Informe o valor do deposito: ");
        
        if (c.Deposito(Double.parseDouble(deposito)) == false)
        {
            JOptionPane.showMessageDialog(null,"Deposito nao realizado, a conta ainda nao esta aberta");
        }
             
        saque = JOptionPane.showInputDialog("Informe o valor do saque: ");
        if (c.Sacar(Double.parseDouble(saque)) == false)
        {
            JOptionPane.showMessageDialog(null,"Saque nao realizado, a conta nao esta aberta ou nao ha saldo suficiente: ");
        }
        
        JOptionPane.showMessageDialog(null,"Saldo restante: " + c.retornaSaldo()); 
        
        JOptionPane.showMessageDialog(null,"Nome: "+nome+
                                           "\nNúmero: "+numero+
                                           "\nAgência: "+agencia+
                                           "\nSaldo: "+c.retornaSaldo());
    }
    
}
