package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import progsource.AnagrammeGen;

public class Testscript {
    private static String echec = " ❌😡🚫 ";
    private static String succes = " ✅🔥😊";
    
	public static void main(String[] args) {
		FileReader descFich;
		BufferedReader buffRead;
		String ligne, data,oracle, sortie;
		String[] contenu; 
		
		if(args.length!=1) {
			System.out.println("Usage : java Testscript <fichier_test>");
			System.exit(1);
		}
		
		String fichierTest= args[0];
		try {
			descFich= new FileReader(fichierTest);
			buffRead= new BufferedReader(descFich);
			while((ligne=buffRead.readLine())!=null) {
				contenu=ligne.split("/");
				if(contenu.length==2) {
					data=contenu[0];
					oracle=contenu[1];
					sortie= AnagrammeGen.anagramme(data);
					if(sortie.equals(oracle)) {
						System.out.println("Test reussi : "+ data + " = " + oracle + succes);
					}else {
						System.out.println("Test echoue : " + data + " = " + sortie + " (Attendu : "+ oracle +")" + echec);
					}
					
				}else {
					System.out.println("Format de test invalide : " + contenu + echec);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
