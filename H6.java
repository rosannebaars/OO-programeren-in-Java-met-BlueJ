/*************
* Opdracht 2
*************/

public Kind zoekOpGeboorteJaar( int jaar) {
    Kind gezochtKind = null;
    for ( Kind k : lijst ) {
        if ( jaar == k.getGeboortedatum().getJaar() )
        gezochtKind = k;
      }
     return gezochtKind;
}

public void printKinderenMetGeboorteJaar( int jaar) {
    Kind gezochtKind = null;
    for ( Kind k : lijst ) {
        if ( jaar == k.getGeboortedatum().getJaar() )
        System.out.println(k.naam);
      }
}

/*************
* Opdracht 3
*************/


/**
 * De klasse <code>Cijferinvoer</code> is een hulpmiddel voor leraren bij het
 * berekenen van het gemiddelde examencijfer.
 *
 * @author (Rosanne)
 * @version (29-08-2018)
 */
import java.util.*;
public class Cijferinvoer
{
    private ArrayList<Cijfer> cijferlijst;
    private int aantalCijfers;
    private double gemiddelde;
    private int aantalVoldoendes = 0;
    private int aantalOnvoldoendes = 0;

    /**
     * Initieer Cijferinvoer
     */
    public Cijferinvoer()
    {
        cijferlijst = new ArrayList<Cijfer>();
    }

        /**
     * Voeg cijfer toe aan de cijferlijst
     *
     * @param  Cijfer een cijfer tussen 1 en 10
     */
    public void voegCijferToe(Cijfer cijfer){
        if ( cijfer.getCijfer() >= 1 && cijfer.getCijfer() <= 10 ) {

            cijferlijst.add( cijfer );
        } else {
            System.out.println(
            "Cijfer voldoet niet aan eisen. Voer een cijfer tussen 1 en 10 in"
            );
        }
    }


    /**
     * Bereken het aantal cijfers in de cijferlijst
     *
     */
    public void aantalCijfers()
    {
        aantalCijfers = cijferlijst.size();
    }

        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void berekenGemiddelde()
    {
        double sum = 0;
        for( int i  = 0; i < aantalCijfers; i++) {
           sum += cijferlijst.get(i).cijfer;
        }

        gemiddelde = sum / aantalCijfers;
    }

        /**
     * Bereken het aantal voldoendes en aantalOnvoldoendes
     *
     */
    public void voldoendeOfOnvoldoende()
    {
        for( int i  = 0; i < aantalCijfers; i++) {
            if(cijferlijst.get(i).cijfer >= 5.5) {
                aantalVoldoendes += 1;
            } else {
                aantalOnvoldoendes += 1;
            }
        }
    }

    /**
 * Print het aantal cijfers, het gemiddelde en het aantal voldoendes en
 * onvoldoendes
 *
 */
    public void print() {
        System.out.println("Het aantal ingevoerde cijfers is " + aantalCijfers);
        System.out.println("Het gemiddelde is " + gemiddelde);
        System.out.println("Het aantal voldoendes is " + aantalVoldoendes);
        System.out.println("Het aantal onvoldoendes is " + aantalOnvoldoendes);
    }
}




/**
 * In de klasse <code>Cijfer</code> kan een cijfer worden ingevoerd.
 *
 * @author (Rosanne)
 * @version (29-08-2018)
 */
public class Cijfer
{
    protected double cijfer;

    /**
     * Initialisatie Cijfer
     */
    public Cijfer(double cijfer)
    {
        this.cijfer = cijfer;
    }

    public double getCijfer()
    {
        return cijfer;
    }

}
