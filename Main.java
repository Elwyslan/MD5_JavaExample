import java.math.BigInteger;
import java.security.MessageDigest;


public class Main {
	
	public static void main(String[] args) throws Exception{
		//Conjunto de Strings para o teste do algoritmo de criptografia MD5
		String[] testeMD5 = {"Santana", "Elwyslan", "admin", "Admin", "Alberto", "senha123", "senha123"};
		
		//A classe MessageDigest, nativa do pacote "java.security", implementa o algoritmo MD5
		MessageDigest msgDigest = MessageDigest.getInstance("MD5");
		
		//Para cada uma das Strings de teste...
		for(int i=0; i<testeMD5.length; i++){
			//Insere a String no objeto "MessageDigest"
			msgDigest.update(testeMD5[i].getBytes(), 0, testeMD5[i].length());
			
			//Aplica do algoritmo MD5 na String e retorna sua representacao
			String md5Hash = new BigInteger(1, msgDigest.digest()).toString(16);
			
			//Imprime o resultado da operacao no console
			System.out.println("Hash MD5 da String \""+testeMD5[i]+"\": "+md5Hash);
		}
		
		System.exit(0);
	}

}
