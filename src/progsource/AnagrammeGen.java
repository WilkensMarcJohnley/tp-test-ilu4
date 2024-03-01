package progsource;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AnagrammeGen {
	private static int taille_anagramme=0;
	
	private static char[] lireMot(String mot) {
		taille_anagramme=mot.length();
		char[] anagramme= new char[taille_anagramme];
		
		for(int i=0; i<taille_anagramme; i++) {
			anagramme[i]=mot.charAt(i);
		}
		return anagramme;
	}
	
	private static void tri_Insertion(char[] anagramme) {
		char car;
		int j;
		for (int i = 0; i < taille_anagramme; i++) {
			car=anagramme[i];
			j=i;
			while((j>0) && Character.toLowerCase(car)<Character.toLowerCase(anagramme[j-1])) {
				anagramme[j]=anagramme[j-1];
				j=j-1;
			}
			anagramme[j]=car;
		}
	}
	
	public static String anagramme(String entree) {
		char[] mot =lireMot(entree);
		tri_Insertion(mot);
		return Arrays.toString(mot);
	}
}
