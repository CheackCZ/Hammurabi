package Opakovani2112_slozitejsi_zadani;

import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
	
	Scanner sc = new Scanner(System.in);
	
	
//--------------METODA Z�KLADN� V�PIS-----------------
	
	
	public String ZakladVypis() {
		return "<<---------------------------------------->>\n>> Na co chcete pou��t va�e bu�le zrn�? \n"
				+ "> 1)Na n�kup akr� \n"
				+ "> 2)Na prodej akr� \n"
				+ "> 3)Na krmen� populace(povinn� pole) \n"
				+ "> 4)Na s�zen� obil� na p��t� rok \n"
				+ "> 5)Dal�� kolo(konec)."; 
	}
	
	
//--------------METODA V�PIS PRAVIDEL-----------------
	
	
	public String VypisPravidel() {
		return    ">>------------------------------------PRAVIDLA HRY------------------------------------<< \r\n"
				+ "                                                                                         \r\n"
				+ "1. Hra trv� 10 let, jeden rok je jedno kolo.\r\n"
				+ "2. Ka�d� rok hr�� zad�, kolik bu�l� zrn� chce pou��t na n�kup (nebo prodej) akr� zem�,\r\n"
				+ "krmen� populace a s�zen� obil� na p��t� rok.\r\n"
				+ "3. Ka�d� osoba pot�ebuje na rok 20 bu�l� zrn� a m��e obhospoda�ovat maxim�ln� 10 akr�\r\n"
				+ "zem�.\r\n"
				+ "4. Na oset� jednoho akru zem� se spot�ebuje jeden bu�l zrn�.\r\n"
				+ "5. �roda z jednoho akru se pohybuje od 2 do 5 bu�l� (n�hodn� ��slo v tomto rozsahu).\r\n"
				+ "6. Cena za jeden akr zem� se pohybuje od 17 do 26 bu�l� (n�hodn� ��slo v tomto rozsahu).\r\n"
				+ "7. Pokud maj� obyvatel� nadbytek j�dla (v�ce ne� 20 bu�l� na osobu), p�ich�zen� lid� z\r\n"
				+ "okoln�ch kr�lovstv�.\r\n"
				+ "8. Pokud nen� dostatek j�dla pro v�echny obyvatele, odejde tolik lid�, pro kolik se j�dla\r\n"
				+ "nedost�v�.\r\n"
				+ "9. Kdykoliv se stav zem� dostate�n� zhor�� (po�et lid� poklesne o v�ce ne� p�tinu oproti\r\n"
				+ "minul�mu roku), obyvatel� vl�dce svrhnou a hr�� nedokon�� svoji desetiletou vl�du.\r\n"
				+ "10. Pokud hr�� vydr�� vl�dnout 10 let, tak vyhr�l. A bude nav�dy v pam�ti lid� tohoto \r\n"
				+ "kr�ovstv�                                                                             \r\n"
				+ "                                                                                      \r\n"
				+ ">>------------------------------------PRAVIDLA HRY------------------------------------<<\r\n"
				+ "                                                                                            ";
	}
	
//-------------------PO��TE�N� HODNOTY--------------
	
	
	Random rnd = new Random();
	int nahodneCisloUroda;
	int nahodneCisloProdejZeme;
	
	private int dobaVlady;
	private int pocetHladLidi;
	private int pocetNovyLidi;
	private int populace;
	private int pocetAkru;
	private int urodaBusluNaAkr;
	private int pocetBusluNaSklade;
	private int kolikBusluNaAkrZaZem;
	
	public int getKolikBusluNaAkrZaZem() {
		return kolikBusluNaAkrZaZem;
	}

	public void setKolikBusluNaAkrZaZem(int kolikBusluNaAkrZaZem) {
		this.kolikBusluNaAkrZaZem = kolikBusluNaAkrZaZem;
	}

	public int getPocetBusluNaSklade() {
		return pocetBusluNaSklade;
	}

	public void setPocetBusluNaSklade(int pocetBusluNaSklade) {
		this.pocetBusluNaSklade = pocetBusluNaSklade;
	}

	public int getDobaVlady() {
		return dobaVlady;
	}

	public void setDobaVlady(int dobaVlady) {
		this.dobaVlady = dobaVlady;
	}

	public int getPocetHladLidi() {
		return pocetHladLidi;
	}

	public void setPocetHladLidi(int pocetHladLidi) {
		this.pocetHladLidi = pocetHladLidi;
	}

	public int getPocetNovyLidi() {
		return pocetNovyLidi;
	}

	public void setPocetNovyLidi(int pocetNovyLidi) {
		this.pocetNovyLidi = pocetNovyLidi;
	}

	public int getPocetAkru() {
		return pocetAkru;
	}

	public void setPocetAkru(int pocetAkru) {
		this.pocetAkru = pocetAkru;
	}

	public int getPopulace() {
		return populace;
	}

	public void setPopulace(int populace) {
		this.populace = populace;
	}
	
	public int getUrodaBusluNaAkr() {
		return urodaBusluNaAkr;
	}

	public void setUrodaBusluNaAkr(int urodaBusluNaAkr) {
		this.urodaBusluNaAkr = urodaBusluNaAkr;
	}
	
	
//-------------------V�PIS PO��TE�N�CH HODNOT-------------------	
	
	
	public String VypisPocatHodnot1() {
		return    "Po��te�n� hodnoty: \r\n" 
				+ "> Rok vl�dy: " + dobaVlady + "\r\n"
				+ "> Velikost populace: " + this.populace + "\r\n"
				+ "> Po�et hladov�ch lid�(emigrant�): " + pocetHladLidi + "\r\n"
				+ "> Po�et nov�ch obyvatel (imigrant�): " + this.pocetNovyLidi + "\r\n"
				+ "> Po�et bu�l� obil� na sklad�: " + this.pocetBusluNaSklade + "\r\n"
				+ "> Po�et akr� zem�: " + this.pocetAkru + "\r\n"
				+ "> Po�et osazen�ch akr� zem�: " + this.osazeneAkry + "\r\n" 
				+ "> �roda bu�l� obil� na jeden akr(n�hodn� ��slo od 2 do 5): " + this.getUrodaBusluNaAkr()+ "\r\n"
				+ "> Za kolik bu�l� na akr se prod�v� zem�(n�hodn� ��slo od 17 do 26):" + this.kolikBusluNaAkrZaZem;
	}
	
	
	public String VypisPocatHodnot() {
		return    "HODNOTY: \r\n" 
				+ "> Rok vl�dy: " + dobaVlady + "\r\n"
				+ "> Velikost populace: " + this.getPopulace() + "\r\n"
				+ "> po�et hladov�h lid� (emigrant�): " + this.pocetHladLidi + "\r\n"
				+ "> Po�et nov�ch obyvatel (imigrant�): " + this.pocetNovyLidi + "\r\n"
				+ "> Po�et bu�l� obil� na sklad�: " + this.pocetBusluNaSklade + "\r\n"
				+ "> Po�et akr� zem�: " + this.getPocetAkru() + "\r\n"
				+ "> Po�et osazen�ch akr� zem�: " + this.osazeneAkry + "\r\n" 
				+ "> �roda bu�l� obil� na jeden akr(n�hodn� ��slo od 2 do 5): " + this.getUrodaBusluNaAkr() + "\r\n"
				+ "> Za kolik bu�l� na akr se prod�v� zem�(n�hodn� ��slo od 17 do 26):" + this.getKolikBusluNaAkrZaZem();     
	}
	

//-------------------3.PRAVIDLO---------------------(Nepou��v�m)
	

	public int KazdaOsobaPotrebuje() {
		if (this.populace * 20 < this.pocetBusluNaSklade) {
			int PrebytekBuslu = this.pocetBusluNaSklade - this.populace * 20;
			int pribydeObyvatel = PrebytekBuslu / 20;
			this.pocetBusluNaSklade = PrebytekBuslu;
			setPocetNovyLidi(pribydeObyvatel);
			return this.getPopulace() + pribydeObyvatel;
		} else if (this.populace * 20 > this.pocetBusluNaSklade ) {
			int NedostatekBuslu = this.populace * 20 - this.pocetBusluNaSklade;
			int ubydeObyvatel = NedostatekBuslu / 20;
			this.pocetBusluNaSklade = 0;
			setPocetHladLidi(ubydeObyvatel + getPocetNovyLidi());
			return this.getPopulace() - ubydeObyvatel;
		} else if ((this.populace * 20) == this.pocetBusluNaSklade) {
			this.pocetBusluNaSklade = 0;
			return this.populace;
		} else {
			return this.populace;
		}
	}

	
//-----------------METODA KONEC--------------
	
	
	public boolean KonecHry() {
		if (getPocetHladLidi() > (this.getPopulace() / 5)) {
			return false;
		} else {
			return true;
		}
	}
	
	public String VypisKonecHry() {
		return( "---------->>!!KONEC HRY!!<<-----------");
	}
	 
	
//----------------METODA ZVL�DNUT� VL�DY-----
	
	
	public String UspesneVyhra() {
		return "<<----------�SP̊N� JSTE TO ZVL�DL.---------->>";
	}
	
	
//-----------------METODA PRO 2.PRAVIDLO------------------
	
	int BusleNakup;
	int BusleNakup2;
	int BusleProdej;
	int BusleProdej2;
	int BusleNakrmeni;
	int BusleNakrmeni2;
	int BusleVysazeni;
	int BusleVysazeni2;
	
	int osazeneAkry;
	int BusleVysazeniVetsi;
	int BusleVysazeniVetsi2;
	
	boolean xTrojka;
	
	public void VyberCisla(int cislo) {
		if (cislo == 1) {
			System.out.println("Kolik akr� chcete koupit(Pod�vejte se na ceny za akr!): " );
			BusleNakup = sc.nextInt();
			if (BusleNakup <= this.pocetBusluNaSklade) {
				this.pocetAkru = this.pocetAkru + BusleNakup;
                this.pocetBusluNaSklade = this.pocetBusluNaSklade - (BusleNakup * this.kolikBusluNaAkrZaZem); 
                System.out.println("V� aktu�ln� po�et akr� je: " + this.getPocetAkru() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
			} else if (BusleNakup > this.pocetBusluNaSklade) {
				do {
					System.out.println("Nem�te tolik bu�l� na sklad�. Tud� tolik utratit nem��ete. "
							+ "\nZadejte nov� po�et bu�l�, pro n�kup akr� zem�.");
					BusleNakup2 = sc.nextInt();
					
				} while (BusleNakup2 > this.pocetBusluNaSklade);
				this.pocetAkru = this.pocetAkru + BusleNakup2;
				this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleNakup2;
                System.out.println("V� aktu�ln� po�et akr� je: " + this.getPocetAkru() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
			}
		} else if (cislo == 2) {
			System.out.println("Kolik akr� chcete prodat(Pod�vejte se na ceny za akr!): ");
			BusleProdej = sc.nextInt();
			if (BusleProdej <= this.pocetAkru) {
				this.pocetAkru = this.pocetAkru - BusleProdej;
				this.pocetBusluNaSklade = this.pocetBusluNaSklade + (BusleProdej * this.kolikBusluNaAkrZaZem);
                System.out.println("V� aktu�ln� po�et akr� je: " + this.getPocetAkru() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
			} else if (BusleProdej > this.pocetAkru) {
				do {
					System.out.println("Nem�te tolik akr�. Tud� tolik jich prodat nem��ete. "
							+ "\nZadejte nov� po�et akr�, kter� chcete prodat.");
					BusleProdej2 = sc.nextInt();
					
			} while (BusleProdej2 > this.pocetAkru);
				this.pocetAkru = this.pocetAkru - BusleProdej2;
				this.pocetBusluNaSklade = this.pocetBusluNaSklade + (BusleProdej2 * this.kolikBusluNaAkrZaZem);
                System.out.println("V� aktu�ln� po�et akr� je: " + this.getPocetAkru() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
		  }	
		} else if (cislo == 3) {
			xTrojka = true;
			System.out.println("Kolik bu�l� chcete pou��t na nakrmen� populace: ");
			BusleNakrmeni = sc.nextInt();	
			if (BusleNakrmeni <= this.pocetBusluNaSklade) {
				this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleNakrmeni;
				if (BusleNakrmeni > (20 * this.populace)) {
					int PrebytekBuslu = BusleNakrmeni - (this.populace * 20);
					int pribydeObyvatel = PrebytekBuslu / 20;
					setPocetNovyLidi(pribydeObyvatel);
					this.populace = getPopulace() + pribydeObyvatel;
					System.out.println("V� aktu�ln� po�et obyvatel je: " + this.getPopulace() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
				} else if (BusleNakrmeni < (this.populace * 20)) {
					int NedostatekBuslu = this.populace * 20 - BusleNakrmeni;
					int ubydeObyvatel = NedostatekBuslu / 20;
					setPocetHladLidi(ubydeObyvatel);
					this.populace = getPopulace() - ubydeObyvatel;
					System.out.println("V� aktu�ln� po�et obyvatel je: " + this.getPopulace() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
				} else if (BusleNakrmeni == (this.populace * 20)) {
					this.populace = this.getPopulace();
					System.out.println("V� aktu�ln� po�et obyvatel je: " + this.getPopulace() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
				} else {
					this.populace = this.getPopulace();
					System.out.println("V� aktu�ln� po�et obyvatel je: " + this.getPopulace() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
				}
			} else if (BusleNakrmeni > this.pocetBusluNaSklade) {
				do {
					System.out.println("Nem�te tolik bu�l� na sklad�. Tud� tolik utratit nem��ete. "
							+ "\nZadejte nov� po�et bu�l�, pro n�kup akr� zem�.");
					BusleNakrmeni2 = sc.nextInt();
					
				} while (BusleNakrmeni2 > this.pocetBusluNaSklade);
				this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleNakrmeni2;
				System.out.println("V� aktu�ln� po�et obyvatel je: " + this.getPopulace() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
				if (BusleNakrmeni2 > (20 * this.populace)) {
					int PrebytekBuslu = BusleNakrmeni2 - this.populace * 20;
					int pribydeObyvatel = PrebytekBuslu / 20;
					setPocetNovyLidi(pribydeObyvatel);
					this.populace = getPopulace() + pribydeObyvatel;
					System.out.println("V� aktu�ln� po�et obyvatel je: " + this.getPopulace() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
				} else if (BusleNakrmeni2 < (this.populace * 20)) {
					int NedostatekBuslu = this.populace * 20 - BusleNakrmeni2;
					int ubydeObyvatel = NedostatekBuslu / 20;
					setPocetHladLidi(ubydeObyvatel);
					this.populace = getPopulace() - ubydeObyvatel;
					System.out.println("V� aktu�ln� po�et obyvatel je: " + this.getPopulace() + ".\nV� zbytek bu�l� je: " + this.getPocetBusluNaSklade());
				} else if (BusleNakrmeni2 == (this.populace * 20)) {
					this.populace = this.getPopulace();
				} else {
					this.populace = this.getPopulace();
				}
			}
		} else if (cislo == 4) {
			System.out.println("Kolik bu�l� chcete pou��t na vys�zen� zrn� na p��t� rok:");
			BusleVysazeni = sc.nextInt();
			if (BusleVysazeni <= this.pocetBusluNaSklade) {
				if (BusleVysazeni > this.populace * 10) {
					do {
						System.out.println("Tolik akr� osadit nem��ete. Ka�d� obyvatel se m��e starat pouze o 10 akr�.\nZadejte nov� po�et bu�l�, kter� chcete pou��t na vys�zen� zrn� na p��t� rok. ");
						BusleVysazeniVetsi = sc.nextInt();
					} while (BusleVysazeniVetsi > this.populace * 10);
					this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleVysazeniVetsi;
				    osazeneAkry = this.osazeneAkry + BusleVysazeniVetsi;
					System.out.println("M�te " + osazeneAkry + " osazen�ch pol�.");
					System.out.println("V� zbytek bu�l� je: " + this.pocetBusluNaSklade);
				} else {
					this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleVysazeni;
					this.osazeneAkry = this.osazeneAkry + BusleVysazeni;
					System.out.println("M�te " + osazeneAkry + " osazen�ch pol�.");
					System.out.println("V� zbytek bu�l� je: " + this.pocetBusluNaSklade);
				}
			} else if (BusleVysazeni > this.pocetBusluNaSklade) {
				do {
					System.out.println("Nem�te tolik bu�l� na sklad�. Tud� tolik utratit nem��ete. "
							+ "\nZadejte nov� po�et bu�l�, pro n�kup akr� zem�.");
					BusleVysazeni2 = sc.nextInt();	
				} while (BusleVysazeni2 > this.pocetBusluNaSklade);
				if (BusleVysazeni2 > this.populace * 10) {
					do {
						System.out.println("Tolik akr� osadit nem��ete. Ka�d� obyvatel se m��e starat pouze o 10 akr�.\nZadejte nov� po�et bu�l�, kter� chcete pou��t na vys�zen� zrn� na p��t� rok. ");
                        BusleVysazeniVetsi2 = sc.nextInt();
					} while (BusleVysazeni2 > this.populace * 10);
					 this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleVysazeniVetsi2;
                     osazeneAkry = this.osazeneAkry + BusleVysazeniVetsi2;
					 System.out.println("M�te " + osazeneAkry + " osazen�ch pol�.");
					 System.out.println("V� zbytek bu�l� je: " + this.pocetBusluNaSklade);
				} else {
					this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleVysazeni2;
					this.osazeneAkry = this.osazeneAkry + BusleVysazeni2;
					System.out.println("M�te " + osazeneAkry + " osazen�ch pol�.");
					System.out.println("V� zbytek bu�l� je: " + this.pocetBusluNaSklade);	
				}
			}
		} else if (cislo == 5) {
			System.out.println("");
			this.pocetBusluNaSklade = this.pocetBusluNaSklade + this.SklizeniAkru();	
		}
 }	


//----------------METODA SKL�ZEN� AKRY---------------------


	public int SklizeniAkru() {
		return this.osazeneAkry * this.urodaBusluNaAkr;
	}
	
	
//---------------METODA NESPLN�N� PRAVIDEL---------------
	
	
	public String NesplneniPravidel() {
		return "<<-----PROHR�L JSTE----->>\n" +
				"!!Nezadal jste po�et Bu�l�, kter� chcete pou��t na nakrmen� populace!! ";
	}
	
}	





   

 