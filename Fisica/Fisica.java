/*
**author Rafael
**
*/
import java.util.Scanner;
import java.io.*;

public class Fisica {  
    
    public static void main(String[] args) {  
		double n1;
		double n2;
		double res;	
		Scanner ent = new Scanner(System.in);
		InputStreamReader dados = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(dados);
		
		try{
		
		System.out.println("Digite 1 para calc. a Dist, 2 para Vel  ou 3 para Tempo: ");
			int num = Integer.parseInt(teclado.readLine());
			if (num == 1){
					System.out.println("Digite a VELOCIDADE: "); 
					n1 = ent.nextDouble();
					System.out.println("Digite o TEMPO (EM HORAS): "); 
					n2 = ent.nextDouble();

	
					Distancia d = new Distancia();  
          
					d.setVel(n1);  
					d.setTempo(n2);  
					d.calcular();  
					d.imprimir();
			}
			else if (num == 2){
				System.out.println("Digite a DISTANCIA(EM KM): "); 
					n1 = ent.nextDouble();
					System.out.println("Digite o TEMPO (EM HORAS): "); 
					n2 = ent.nextDouble();

	
					Velocidade v = new Velocidade();  
          
					v.setDist(n1);  
					v.setTempo(n2);  
					v.calcular();  
					v.imprimir();
			}
			else if (num == 3){
				System.out.println("Digite a DISTANCIA (EM KM): "); 
					n1 = ent.nextDouble();
					System.out.println("Digite VELOCIDADE: "); 
					n2 = ent.nextDouble();

	
					Tempo t = new Tempo();  
          
					t.setDist(n1);  
					t.setVel(n2);  
					t.calcular();  
					t.imprimir();
			}else{
				System.out.println("Opcao desejada incorreta");
			}
		
	
	
	}catch(Exception Ex)
		{
			System.out.println("[ERRO] – " + "voce digitou um valor invalido" );
		}
      
}
}	