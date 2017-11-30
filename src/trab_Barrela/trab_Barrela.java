package trab_Barrela;

import java.util.Scanner;

public class trab_Barrela {
	
	public static void main(String[]args){
		
		String msg; //recebe a mensagem
		String msgf = "";
		String msgf2 = "";
		int p1, p2;
		String p, pp, s, ss;
		boolean inicio = false;
		
		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a mensagem");
				msg = sc.nextLine().toUpperCase();//recebe a mensagem em maiuscula
//				msg = msg.replace(" ", ""); //tira os espaços
				msg = "7E" + msg + "7E";
		
				if(msg.charAt(msg.length()-2) == '7'&& msg.charAt(msg.length()-1) == 'E'){
				//testar cada par (7E, 7D, 5D)
				for(int i = 0, j=1; i<=msg.length()-2 && j<=msg.length()-1;i=i+1, j=j+1){
					String primeiro, segundo;
					System.out.println("primeiro: " + msg.charAt(i) + " segundo: " + msg.charAt(j));
					p=String.valueOf(msg.charAt(i));
					s=String.valueOf(msg.charAt(j));
					//erro teste p!=7 && s!=e
					if(p.equals("7") && s.equals("E") || p.equals("7") && s.equals("D") ){
						msgf=msgf;
					}
					else if(i!= 0 && j != 1 && i%2 == 0 && j%2 != 0 && !p.equals("7") && !s.equals("E") && !p.equals("7") && !s.equals("D") && i!= msg.length()-2 && j!= msg.length()-1){
						msgf = msgf+ p+s;
					}
					//teste fim e inicio
					if(msg.charAt(i) == '7' && msg.charAt(j) == 'E' || msg.charAt(i) == '7' && msg.charAt(j) == 'D'  ){
						if(i+3 > msg.length() ){
							System.out.println("fim da mensagem");
						}
						else if(inicio == false && i+3 < msg.length() ){
							System.out.println("inicio da mensagem");
							
							inicio = true;
						} //teste fim e inicio
						
						
						
						else if(p.equals("7") && s.equals("E") && inicio == true && i+3 < msg.length()){
							p="7D";
							s="5E";
							msgf = msgf+ p+s;
						}
						else if(p.equals("7") && s.equals("D") && inicio == true && i+3 < msg.length()){
							p="7D";
							s="5D";
							msgf = msgf+ p+s;
						}
						
				
						
						
					
//		msg.replace(msg.substring(4), "7D" );
	}
					if(msg.charAt(msg.length()-2) != '7' && msg.charAt(msg.length()-1) != 'E' ){
					if(i+3 > msg.length() ){
						System.out.println("ERRO");
						System.out.println("mensagem nao possui tag de final");
						System.out.println("Encerrando sistema");
						System.exit(0);
					}}
	}
				System.out.println(msgf);
				
				
				System.out.println("Digite decodificar para continuar");
				
				String dec = sc.next().toUpperCase();
				if(dec.equals("DECODIFICAR")){
					//inicio da mensagem
					System.out.println("Inserindo inicio de mensagem");
					msgf2 = msgf2+"7E";
				
					for(int i = 0, j=1; i<=msgf.length()-2 && j<=msgf.length()-1;i=i+1, j=j+1){
						p=String.valueOf(msgf.charAt(i));
						s=String.valueOf(msgf.charAt(j));
						if(p.equals("7") && s.equals("D") && i<msgf.length()-2 && j<msgf.length()-1){
							pp=String.valueOf(msgf.charAt(i+2));
							ss=String.valueOf(msgf.charAt(j+2));
							if(pp.equals("5") && ss.equals("E")){
								msgf2 = msgf2 + "7E";
								i=i+3;
								j=j+3;
								System.out.println("Decodificando");
							}
							else if(pp.equals("5") && ss.equals("D")){
								msgf2 = msgf2 + "7D";
								i=i+3;
								j=j+3;
								System.out.println("Decodificando");
							} 
							else msgf2 = msgf2 + p + s;
							
						}
						
						
						
						else if(i%2 == 0 && j%2 != 0 ){
							msgf2 = msgf2+ p+s;
						}
						
						
							
						}
					System.out.println("Inserindo fim de mensagem");
					msgf2 = msgf2+"7E";
					System.out.println(msgf2);
					System.out.println("Fim do sistema");
					
					
					
					
				}
				
				}
				
				else{
		System.out.println("ERRO");
		System.out.println("mensagem nao possui tag de final");
		System.out.println("Encerrando sistema");
		System.exit(0);
				
}
	}}
