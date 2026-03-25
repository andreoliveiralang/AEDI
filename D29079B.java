//Nome: André Luiz De Oliveira 
//Matricula:D29079

   import javax.swing.JOptionPane;
public class D29079B
{
     public static void main (String [] args)
    {   String ra;
        
     ra = JOptionPane.showInputDialog(null,"Digite o seu registro academico (RA: ",                  
        "Registro academico",JOptionPane.QUESTION_MESSAGE);  
        
        double raNumber = Double.parseDouble(ra);

        double dV = raNumber % 10/1;  
        String.format("O valor total da conta é: R$ %.0f", dV);
        JOptionPane.showMessageDialog(null, dV," DV:",JOptionPane.INFORMATION_MESSAGE);

    }
}

