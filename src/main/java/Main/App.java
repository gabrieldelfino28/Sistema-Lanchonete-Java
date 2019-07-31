package Main;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Color;

public class App extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public App() {
		getContentPane().setBackground(Color.darkGray);
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(650,450);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
	}
    public static void main( String[] args )
    {
    	int vet[] = new int[4];
    	int c1=0,c2=0,c3=0,c4=0;
    	double total=0;
    	double vlt=0;
    	int maior,menor,x=1,i=0;
  
    	DecimalFormat df = new DecimalFormat("###,##0.00");
    	new App();
    	do {
    		
    		String input = JOptionPane.showInputDialog("MENU\n\n(1) 1x Combo WHOPPER______________________________R$19,90\n\n(2) 1x Cheddar Duplo + 1x Batata Suprema + 1x Free Refill___R$19,90\n\n(3) 1x Combo WHOPPER + 1x Cheedar___________________R$24,90\n\n(4) 2x Combo WHOPPER + 1x Batata Média + 1x Free Refill___R$26,90\n\n");
    		int op = Integer.parseInt(input);
    		System.out.println(input);
        
    		switch (op) {
    		case 1 :
    			int a = JOptionPane.showConfirmDialog(null,"Você Selecionou 1x Combo WHOPPER\n\nDeseja Outro Lanche?");
       			vlt= vlt + 19.90;
    			c1++;
    			if (a==0) {
    				continue;
    			}
    			else {
    				x=0;
    				break;
    			}
        	
    		case 2: 
    			int b = JOptionPane.showConfirmDialog(null,"Você Selecionou 1x Cheddar Duplo + 1x Batata Suprema + 1x Free Refill\n\nDeseja Outro Lanche?");
    			vlt= vlt + 19.90;
    			c2++;
    			if (b==0) {
    				continue;
    			}
    			else {
    				x=0;
    				break;
    			}
        	
    		case 3: 
    			int c = JOptionPane.showConfirmDialog(null,"Você Selecionou 1x Combo WHOPPER + 1x Cheedar\n\nDeseja Outro Lanche?");
    			vlt= vlt + 24.90;
    			c3++;
    			if (c==0) {
    				continue;
    			}
    			else {
    				x=0;
    				break;
    			}
        	
    		case 4: 
    			int d = JOptionPane.showConfirmDialog(null,"Você Selecionou 2x Combo WHOPPER + 1x Batata Média + 1x Free Refill\n\nDeseja Outro Lanche?");
    			vlt= vlt + 26.90;
    			c4++;
    			if (d==0) {
    				continue;
    			}
    			else {
    				x=0;
    				break;
    			}
        	
        	
    		}
    	}while(x!=0);
    	
    	vet[0] = c1;
    	vet[1] = c2;
    	vet[2] = c3;
    	vet[3] = c4;
    	maior = vet [0];
    	int posMaior = 0;
    	for (i=1;i<4;i++) {
    		if(vet[i] > maior) {
    			maior = vet[i];
    			posMaior = i;
    		}
    	}
    	
    	menor = vet [0];
    	int posMenor = 0;
    	for (i=1;i<4;i++) {
    		if(vet[i] < menor) {
    			menor = vet[i];
    			posMenor = i;
    		}
    	}
    	posMaior = posMaior + 1;
    	posMenor = posMenor + 1;
    	total = total + vlt;
    	JOptionPane.showMessageDialog(null, "O combo mais vendido foi: "+ posMaior + "º\nO combo menos vendido foi: "+ posMenor+"º");
    	JOptionPane.showMessageDialog(null, "Quantidade de Combos Vendidos: \n1ºCombo: "+ c1 + " vezes\n" + "2ºCombo: "+ c2 + " vezes\n" + "3ºCombo: "+ c3 + " vezes\n" + "4ºCombo: "+ c4 + " vezes\n");
    	JOptionPane.showMessageDialog(null,"Valor Total: R$" + df.format(total));
    	JOptionPane.showMessageDialog(null, "Clique no X para Fechar a Janela!!");
    }
}
