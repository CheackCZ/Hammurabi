package Opakovani2112_slozitejsi_zadani;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		Hammurabi h = new Hammurabi();
		
		int cislo;
		int rok = -1;	
		
		h.setPopulace(100);
    	h.setPocetAkru(1000);
    	h.setPocetBusluNaSklade(4000);
    	h.setDobaVlady(rok);
    	
    	System.out.println(h.VypisPravidel());
    	
	    for (int i = 0; i < 11; i++) {
	    	
    		if ((h.xTrojka == false) && ( i > 0 )) {
    			System.out.println(h.NesplneniPravidel());
    			break;
    		}
	    	
	    	h.setUrodaBusluNaAkr(rnd.nextInt(4) + 2);
	    	h.setKolikBusluNaAkrZaZem(rnd.nextInt(10) + 17);
	    	rok++;
	    	h.setDobaVlady(rok);
	    	h.osazeneAkry = 0;
	    	
	    	if (i == 0) {
	    		System.out.println(h.VypisPocatHodnot1());
	    	} else if (i >= 1) {
	    		System.out.println(h.VypisPocatHodnot());
	    	}
		    
	    	if (h.KonecHry() == false) {
	    		System.out.println();
	    		for (int e = 0; e < 10; e++) {
	    			System.out.print(h.VypisKonecHry());
	    		}
	    		break;
	    	} else {	
	     }
	    	
	    	if (i == 10) {
	    		System.out.println(h.UspesneVyhra());
	    		break;
	    	}
	    	
	    	do {
	    		System.out.println(h.ZakladVypis());
	    		cislo = sc.nextInt();
	    		
	    		h.VyberCisla(cislo);
	    		
	    	} while ((cislo == 1) || (cislo == 2) || (cislo == 3) || (cislo == 4)); 	
	    }
		 sc.close();
	}
}
