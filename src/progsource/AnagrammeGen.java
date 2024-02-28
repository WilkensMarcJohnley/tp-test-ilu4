package progsource;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AnagrammeGen {
	private static int taille_anagramme=0;
	private static Scanner scanner= new Scanner(System.in);
	
	private static char[] lireMot() {
		System.out.println("Entrez un mot :");
		String mot= scanner.next();
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
			while((j>0) && car<anagramme[j-1]) {
				anagramme[j]=anagramme[j-1];
				j=j-1;
			}
			anagramme[j]=car;
		}
	}
	
	public static String tri() {
		char[] mot =lireMot();
		tri_Insertion(mot);
		return Arrays.toString(mot);
	}
	
	public static void main(String[] args) {
		String mot=tri();
		System.out.println("anagramme trie :\n" + mot);
	}
}
