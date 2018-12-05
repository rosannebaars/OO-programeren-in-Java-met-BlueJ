
/*************
* Opdracht 5
*************/

/**
 * De klasse <code>FrisdrankAutomaat</code> kan worden gebruikt om een
 * frisdrank trnsactie te doen.
 *
 * @author (Rosanne)
 * @version (1.0)
 */
import static java.lang.System.*;
public class FrisdrankAutomaat
{
    private int kostprijs;
    private int ingeworpenBedrag;

    /**
     * Constructor for objects of class FrisdrankAutomaat
     */
    public FrisdrankAutomaat(int kostprijs)
    {
        this.kostprijs = kostprijs;
    }

    /**
     * Kies Frisdrank soort. Met behulp van het nummer op de automaat
     * wordt de kostprijs van de frisdrank gekozen.
     *
     * @param frisdrankNummer
     */
    public void kiesFrisdrank(int frisdrankNummer)
    {
        switch(frisdrankNummer)
        {
            case 1: kostprijs = 180;
                    break;
            case 2: kostprijs = 150;
                    break;
            default: kostprijs = 250;
        }
    }

    /**
     * Werp geld in het automaat
     *
     * @param ingeworpenBedrag
     */
    public void inwerp(int ingeworpenBedrag)
    {
        this.ingeworpenBedrag = ingeworpenBedrag;
    }

     /**
     * Bereken verschil kostprijs en ingeworpen bedrag
     *
     */
    public void berekenVerschil()
    {
       int verschil = ingeworpenBedrag - kostprijs;

        if(verschil > 0) {
            out.println("Het ingeworpen bedrag is " + verschil + "cent hoger dan de kostprijs");
        } else if (verschil == 0) {
            out.println("Het ingeworpen bedrag is gelijk aan de kostprijs");
        } else {
            out.println("Het ingeworpen bedrag is " + verschil + "cent lager dan de kostprijs");
        }
    }

     /**
     * Print wisselgeld dat wordt gegeven nadat een bedrag is ingeworpen.
     * Alleen de munten die werkelijk worden terrugegeven zijn weergegeven.
     *
     */
    public void printWisselgeld()
    {
        int verschil = ingeworpenBedrag - kostprijs;
        out.println("Inworp: " + ingeworpenBedrag);
        out.println("Kostprijs: " + kostprijs);
        out.println("Wisselgeld totaal: " + verschil + " cent");

        int aantal = 0;
        while(verschil >= 100) {
            aantal += 1;
            verschil -= 100;
        }
        if(aantal == 1) {
            out.println(aantal + " munt van 100 cent");
        }
        if(aantal > 1){
            out.println(aantal + " munten van 100 cent");
        }

        if(verschil >= 50) {
           verschil -= 50;
           out.println("1 munt van 50 cent");
        }

        aantal = 0;
        while(verschil>= 20){
            aantal += 1;
            verschil -= 20;
        }
        if(aantal == 1) {
            out.println(aantal + " munt van 20 cent");
        }
        if(aantal > 1){
            out.println(aantal + " munten van 20 cent");
        }

        if(verschil >= 10) {
           verschil -= 10;
           out.println("1 munt van 10 cent");
        }

        if(verschil >= 5) {
           verschil -= 5;
           out.println("1 munt van 5 cent");
        }

        aantal = 0;
        while(verschil>= 2){
            aantal += 1;
            verschil -= 2;
        }
        if(aantal == 1) {
            out.println(aantal + " munt van 2 cent");
        }
        if(aantal > 1){
            out.println(aantal + " munten van 2 cent");
        }

        if(verschil >= 1) {
           verschil -= 1;
           out.println("1 mun van 1 cent");
        }
    }

}


/*************
* Opdracht 6
*************/


/**
 * De klasse <code>Prijsaanvraag</code> wordt gebruikt voor prijsaanvragen
 * voor overnachtingen in een hotel door potentiële klanten.
 *
 * @author (Rosanne)
 * @version (1.0)
 */
import static java.lang.System.*;
public class Prijsaanvraag
{
    private String naam;
    private String email;
    private int aantalVolwassenen;
    private int aantalKinderen;
    private int aantalOvernachtingen;

    /**
     * Initieer een Prijsaanvraag
     */
    public Prijsaanvraag(String naam, String email, int aantalVolwassenen,
    int aantalKinderen, int aantalOvernachtingen)
    {
        this.naam = naam;
        this.email = email;
        this.aantalVolwassenen = aantalVolwassenen;
        this.aantalKinderen = aantalKinderen;
        this.aantalOvernachtingen = aantalOvernachtingen;
    }

    /**
     * Print een prijsopgave van de aanvraag
     *
     */
    public void printPrijsopgave()
    {
        int prijs = (47 * aantalKinderen + 63 * aantalVolwassenen)
                     * aantalOvernachtingen;
        out.println("Geachte " + naam + ",");
        out.println("");
        out.println("Het totaalbedrag voor een verblijf in ons hotel met");
        out.println("");
        out.println(aantalVolwassenen + " volwassenen");
        out.println(aantalKinderen + " kinderen");
        out.println("");
        out.println("voor " + aantalOvernachtingen +
                    " overnachtingen bedraagt: " + prijs + " Euro.");
        out.println("");
        out.println("Wij bevestigen deze offerte per e-mail op het adres: "
                    + email);
    }
}
