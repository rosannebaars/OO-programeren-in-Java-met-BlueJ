/*************
* Opdracht 1
*************/

/**
 * De klasse <code>Boek</code> bevat boeken uit de Boekhandel
 *
 * @author (Rosanne)
 * @version (30-08-2018)
 */
public class Boek extends Lectuur
{
    /**
     * Initieer een boek
     */
    public Boek(String titel, double prijs, int aantalStuks)
    {
        this.titel = titel;
        this.prijs = prijs;
        this.aantalStuks = aantalStuks;
    }

}


/**
 * De klasse <code>Weekblad</code> bevat weekbladen uit de Boekhandel
 *
 * @author (Rosanne)
 * @version (30-08-2018)
 */
public class Weekblad extends Lectuur
{
    private int weekVanUitgave;

    /**
     * Initieer een weekblad
     */
    public Weekblad(String titel, double prijs, int aantalStuks, int weekVanUitgave)
    {
        this.titel = titel;
        this.prijs = prijs;
        this.aantalStuks = aantalStuks;
        this.weekVanUitgave = weekVanUitgave;
    }

}


/**
 * De klasse <code>Lectuur</code> bevat boeken en weekbladen.
 *
 * @author (Rosanne)
 * @version (30-08-2018)
 */
public class Lectuur
{
    protected String titel;
    protected double prijs;
    protected int aantalStuks;

    /**
     * Pas voorraad van het product aan
     *
     * @param  voorraad het aantal stuks
     */
    public void voorraadAanpassen(int voorraad)
    {
        aantalStuks = voorraad;
    }

    public void print()
    {
        System.out.println("Titel: " + titel + " Voorraad : " + aantalStuks + " Prijs per stuk : " + prijs);
    }

}



/**
 * De klasse <code>Voorraad</code> houdt de voorraaf van de lectuur bij.
 *
 * @author (Rosanne)
 * @version (30-08-2018)
 */
import java.util.*;
public class Voorraad
{
    private ArrayList<Lectuur> lijst;
    private double totaleVerkoopprijs = 0;

    /**
     * Initieer Voorraad
     */
    public Voorraad()
    {
        lijst = new ArrayList<Lectuur>();
    }

    /**
     * Voeg lectuur toe aan de voorraad
     *
     * @param  Lectuur een boek of weekblad
     */
    public void voegLectuurToe( Lectuur l )
    {
        lijst.add(l);
    }

        /**
     * Print een lijst van de voorraad lectuur
     *
     */
    public void printVoorraad()
    {
        for(Lectuur l: lijst){
            l.print();
        }
    }

        /**
     * Print totale Verkoopprijs van de gehele voorraad
     *
     */
    public void printVerkoopprijs(){
        for(Lectuur l: lijst){
            totaleVerkoopprijs += l.prijs * l.aantalStuks;
        }
        System.out.println("De prijs van de totale voorraad is " + totaleVerkoopprijs);
    }
}
