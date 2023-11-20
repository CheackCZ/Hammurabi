package Opakovani2112_slozitejsi_zadani;

import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
	
	Scanner sc = new Scanner(System.in);
	
	
//--------------METODA ZÁKLADNÍ VÝPIS-----------------
	
	
	public String ZakladVypis() {
		return "<<---------------------------------------->>\n>> Na co chcete použít vaše bušle zrní? \n"
				+ "> 1)Na nákup akrù \n"
				+ "> 2)Na prodej akrù \n"
				+ "> 3)Na krmení populace(povinné pole) \n"
				+ "> 4)Na sázení obilí na pøíští rok \n"
				+ "> 5)Další kolo(konec)."; 
	}
	
	
//--------------METODA VÝPIS PRAVIDEL-----------------
	
	
	public String VypisPravidel() {
		return    ">>------------------------------------PRAVIDLA HRY------------------------------------<< \r\n"
				+ "                                                                                         \r\n"
				+ "1. Hra trvá 10 let, jeden rok je jedno kolo.\r\n"
				+ "2. Každý rok hráè zadá, kolik bušlù zrní chce použít na nákup (nebo prodej) akrù zemì,\r\n"
				+ "krmení populace a sázení obilí na pøíští rok.\r\n"
				+ "3. Každá osoba potøebuje na rok 20 bušlù zrní a mùže obhospodaøovat maximálnì 10 akrù\r\n"
				+ "zemì.\r\n"
				+ "4. Na osetí jednoho akru zemì se spotøebuje jeden bušl zrní.\r\n"
				+ "5. Úroda z jednoho akru se pohybuje od 2 do 5 bušlù (náhodné èíslo v tomto rozsahu).\r\n"
				+ "6. Cena za jeden akr zemì se pohybuje od 17 do 26 bušlù (náhodné èíslo v tomto rozsahu).\r\n"
				+ "7. Pokud mají obyvatelé nadbytek jídla (více než 20 bušlù na osobu), pøicházení lidé z\r\n"
				+ "okolních království.\r\n"
				+ "8. Pokud není dostatek jídla pro všechny obyvatele, odejde tolik lidí, pro kolik se jídla\r\n"
				+ "nedostává.\r\n"
				+ "9. Kdykoliv se stav zemì dostateènì zhorší (poèet lidí poklesne o více než pìtinu oproti\r\n"
				+ "minulému roku), obyvatelé vládce svrhnou a hráè nedokonèí svoji desetiletou vládu.\r\n"
				+ "10. Pokud hráè vydrží vládnout 10 let, tak vyhrál. A bude navždy v pamìti lidí tohoto \r\n"
				+ "kráovství                                                                             \r\n"
				+ "                                                                                      \r\n"
				+ ">>------------------------------------PRAVIDLA HRY------------------------------------<<\r\n"
				+ "                                                                                            ";
	}
	
//-------------------POÈÁTEÈNÍ HODNOTY--------------
	
	
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
	
	
//-------------------VÝPIS POÈÁTEÈNÍCH HODNOT-------------------	
	
	
	public String VypisPocatHodnot1() {
		return    "Poèáteèní hodnoty: \r\n" 
				+ "> Rok vlády: " + dobaVlady + "\r\n"
				+ "> Velikost populace: " + this.populace + "\r\n"
				+ "> Poèet hladových lidí(emigrantù): " + pocetHladLidi + "\r\n"
				+ "> Poèet nových obyvatel (imigrantù): " + this.pocetNovyLidi + "\r\n"
				+ "> Poèet bušlù obilí na skladì: " + this.pocetBusluNaSklade + "\r\n"
				+ "> Poèet akrù zemì: " + this.pocetAkru + "\r\n"
				+ "> Poèet osazených akrù zemì: " + this.osazeneAkry + "\r\n" 
				+ "> Úroda bušlù obilí na jeden akr(náhodné èíslo od 2 do 5): " + this.getUrodaBusluNaAkr()+ "\r\n"
				+ "> Za kolik bušlù na akr se prodává zemì(náhodné èíslo od 17 do 26):" + this.kolikBusluNaAkrZaZem;
	}
	
	
	public String VypisPocatHodnot() {
		return    "HODNOTY: \r\n" 
				+ "> Rok vlády: " + dobaVlady + "\r\n"
				+ "> Velikost populace: " + this.getPopulace() + "\r\n"
				+ "> poèet hladovýh lidí (emigrantù): " + this.pocetHladLidi + "\r\n"
				+ "> Poèet nových obyvatel (imigrantù): " + this.pocetNovyLidi + "\r\n"
				+ "> Poèet bušlù obilí na skladì: " + this.pocetBusluNaSklade + "\r\n"
				+ "> Poèet akrù zemì: " + this.getPocetAkru() + "\r\n"
				+ "> Poèet osazených akrù zemì: " + this.osazeneAkry + "\r\n" 
				+ "> Úroda bušlù obilí na jeden akr(náhodné èíslo od 2 do 5): " + this.getUrodaBusluNaAkr() + "\r\n"
				+ "> Za kolik bušlù na akr se prodává zemì(náhodné èíslo od 17 do 26):" + this.getKolikBusluNaAkrZaZem();     
	}
	

//-------------------3.PRAVIDLO---------------------(Nepoužívám)
	

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
	 
	
//----------------METODA ZVLÁDNUTÍ VLÁDY-----
	
	
	public String UspesneVyhra() {
		return "<<----------ÚSPÌŠNÌ JSTE TO ZVLÁDL.---------->>";
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
			System.out.println("Kolik akrù chcete koupit(Podívejte se na ceny za akr!): " );
			BusleNakup = sc.nextInt();
			if (BusleNakup <= this.pocetBusluNaSklade) {
				this.pocetAkru = this.pocetAkru + BusleNakup;
                this.pocetBusluNaSklade = this.pocetBusluNaSklade - (BusleNakup * this.kolikBusluNaAkrZaZem); 
                System.out.println("Váš aktuální poèet akrù je: " + this.getPocetAkru() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
			} else if (BusleNakup > this.pocetBusluNaSklade) {
				do {
					System.out.println("Nemáte tolik bušlí na skladì. Tudíž tolik utratit nemùžete. "
							+ "\nZadejte nový poèet bušlù, pro nákup akrù zemì.");
					BusleNakup2 = sc.nextInt();
					
				} while (BusleNakup2 > this.pocetBusluNaSklade);
				this.pocetAkru = this.pocetAkru + BusleNakup2;
				this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleNakup2;
                System.out.println("Váš aktuální poèet akrù je: " + this.getPocetAkru() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
			}
		} else if (cislo == 2) {
			System.out.println("Kolik akrù chcete prodat(Podívejte se na ceny za akr!): ");
			BusleProdej = sc.nextInt();
			if (BusleProdej <= this.pocetAkru) {
				this.pocetAkru = this.pocetAkru - BusleProdej;
				this.pocetBusluNaSklade = this.pocetBusluNaSklade + (BusleProdej * this.kolikBusluNaAkrZaZem);
                System.out.println("Váš aktuální poèet akrù je: " + this.getPocetAkru() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
			} else if (BusleProdej > this.pocetAkru) {
				do {
					System.out.println("Nemáte tolik akrù. Tudíž tolik jich prodat nemùžete. "
							+ "\nZadejte nový poèet akrù, které chcete prodat.");
					BusleProdej2 = sc.nextInt();
					
			} while (BusleProdej2 > this.pocetAkru);
				this.pocetAkru = this.pocetAkru - BusleProdej2;
				this.pocetBusluNaSklade = this.pocetBusluNaSklade + (BusleProdej2 * this.kolikBusluNaAkrZaZem);
                System.out.println("Váš aktuální poèet akrù je: " + this.getPocetAkru() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
		  }	
		} else if (cislo == 3) {
			xTrojka = true;
			System.out.println("Kolik bušlù chcete použít na nakrmení populace: ");
			BusleNakrmeni = sc.nextInt();	
			if (BusleNakrmeni <= this.pocetBusluNaSklade) {
				this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleNakrmeni;
				if (BusleNakrmeni > (20 * this.populace)) {
					int PrebytekBuslu = BusleNakrmeni - (this.populace * 20);
					int pribydeObyvatel = PrebytekBuslu / 20;
					setPocetNovyLidi(pribydeObyvatel);
					this.populace = getPopulace() + pribydeObyvatel;
					System.out.println("Váš aktuální poèet obyvatel je: " + this.getPopulace() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
				} else if (BusleNakrmeni < (this.populace * 20)) {
					int NedostatekBuslu = this.populace * 20 - BusleNakrmeni;
					int ubydeObyvatel = NedostatekBuslu / 20;
					setPocetHladLidi(ubydeObyvatel);
					this.populace = getPopulace() - ubydeObyvatel;
					System.out.println("Váš aktuální poèet obyvatel je: " + this.getPopulace() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
				} else if (BusleNakrmeni == (this.populace * 20)) {
					this.populace = this.getPopulace();
					System.out.println("Váš aktuální poèet obyvatel je: " + this.getPopulace() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
				} else {
					this.populace = this.getPopulace();
					System.out.println("Váš aktuální poèet obyvatel je: " + this.getPopulace() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
				}
			} else if (BusleNakrmeni > this.pocetBusluNaSklade) {
				do {
					System.out.println("Nemáte tolik bušlí na skladì. Tudíž tolik utratit nemùžete. "
							+ "\nZadejte nový poèet bušlù, pro nákup akrù zemì.");
					BusleNakrmeni2 = sc.nextInt();
					
				} while (BusleNakrmeni2 > this.pocetBusluNaSklade);
				this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleNakrmeni2;
				System.out.println("Váš aktuální poèet obyvatel je: " + this.getPopulace() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
				if (BusleNakrmeni2 > (20 * this.populace)) {
					int PrebytekBuslu = BusleNakrmeni2 - this.populace * 20;
					int pribydeObyvatel = PrebytekBuslu / 20;
					setPocetNovyLidi(pribydeObyvatel);
					this.populace = getPopulace() + pribydeObyvatel;
					System.out.println("Váš aktuální poèet obyvatel je: " + this.getPopulace() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
				} else if (BusleNakrmeni2 < (this.populace * 20)) {
					int NedostatekBuslu = this.populace * 20 - BusleNakrmeni2;
					int ubydeObyvatel = NedostatekBuslu / 20;
					setPocetHladLidi(ubydeObyvatel);
					this.populace = getPopulace() - ubydeObyvatel;
					System.out.println("Váš aktuální poèet obyvatel je: " + this.getPopulace() + ".\nVáš zbytek bušlù je: " + this.getPocetBusluNaSklade());
				} else if (BusleNakrmeni2 == (this.populace * 20)) {
					this.populace = this.getPopulace();
				} else {
					this.populace = this.getPopulace();
				}
			}
		} else if (cislo == 4) {
			System.out.println("Kolik bušlù chcete použít na vysázení zrní na pøíští rok:");
			BusleVysazeni = sc.nextInt();
			if (BusleVysazeni <= this.pocetBusluNaSklade) {
				if (BusleVysazeni > this.populace * 10) {
					do {
						System.out.println("Tolik akrù osadit nemùžete. Každý obyvatel se mùže starat pouze o 10 akrù.\nZadejte nový poèet bušlù, které chcete použít na vysázení zrní na pøíští rok. ");
						BusleVysazeniVetsi = sc.nextInt();
					} while (BusleVysazeniVetsi > this.populace * 10);
					this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleVysazeniVetsi;
				    osazeneAkry = this.osazeneAkry + BusleVysazeniVetsi;
					System.out.println("Máte " + osazeneAkry + " osazených polí.");
					System.out.println("Váš zbytek bušlù je: " + this.pocetBusluNaSklade);
				} else {
					this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleVysazeni;
					this.osazeneAkry = this.osazeneAkry + BusleVysazeni;
					System.out.println("Máte " + osazeneAkry + " osazených polí.");
					System.out.println("Váš zbytek bušlù je: " + this.pocetBusluNaSklade);
				}
			} else if (BusleVysazeni > this.pocetBusluNaSklade) {
				do {
					System.out.println("Nemáte tolik bušlí na skladì. Tudíž tolik utratit nemùžete. "
							+ "\nZadejte nový poèet bušlù, pro nákup akrù zemì.");
					BusleVysazeni2 = sc.nextInt();	
				} while (BusleVysazeni2 > this.pocetBusluNaSklade);
				if (BusleVysazeni2 > this.populace * 10) {
					do {
						System.out.println("Tolik akrù osadit nemùžete. Každý obyvatel se mùže starat pouze o 10 akrù.\nZadejte nový poèet bušlù, které chcete použít na vysázení zrní na pøíští rok. ");
                        BusleVysazeniVetsi2 = sc.nextInt();
					} while (BusleVysazeni2 > this.populace * 10);
					 this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleVysazeniVetsi2;
                     osazeneAkry = this.osazeneAkry + BusleVysazeniVetsi2;
					 System.out.println("Máte " + osazeneAkry + " osazených polí.");
					 System.out.println("Váš zbytek bušlù je: " + this.pocetBusluNaSklade);
				} else {
					this.pocetBusluNaSklade = this.pocetBusluNaSklade - BusleVysazeni2;
					this.osazeneAkry = this.osazeneAkry + BusleVysazeni2;
					System.out.println("Máte " + osazeneAkry + " osazených polí.");
					System.out.println("Váš zbytek bušlù je: " + this.pocetBusluNaSklade);	
				}
			}
		} else if (cislo == 5) {
			System.out.println("");
			this.pocetBusluNaSklade = this.pocetBusluNaSklade + this.SklizeniAkru();	
		}
 }	


//----------------METODA SKLÍZENÍ AKRY---------------------


	public int SklizeniAkru() {
		return this.osazeneAkry * this.urodaBusluNaAkr;
	}
	
	
//---------------METODA NESPLNÌNÍ PRAVIDEL---------------
	
	
	public String NesplneniPravidel() {
		return "<<-----PROHRÁL JSTE----->>\n" +
				"!!Nezadal jste poèet Bušlù, které chcete použít na nakrmení populace!! ";
	}
	
}	





   

 