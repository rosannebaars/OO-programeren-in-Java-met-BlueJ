/**************************
Opdracht 1
**************************/

/**
 * De Klasse <code>Artikel</code> representeert een product aanwezig in de
 * winkel. Deze producten wordt in een <code>Voorraadlijst</code> opgeslagen.
 *
 * @author (Rosanne)
 * @version (1.0)
 * @see Voorraadlijst
 */
public class Artikel
{
    private String omschrijving;
    private int aantal;

    /**
     * Initialiseert een artikel
     * @param omschrijving van de omschrijving van het artikel
     * @param aantal van het aantal producten beschikbaar in de voorraad
     */
    public Artikel(String omschrijving, int aantal){
        this.omschrijving = omschrijving;
        this.aantal = aantal;
    }

    /**
     * Set het aantal aanwezige artikelen
     * @param aantal
     */
     public void aantal(){
       this.aantal = aantal;
     }
        /**
     * Set de omschrijving van het artikel
     * @param omschrijving
     */
    public void setOmschrijving(String omschrijving){
        this.omschrijving = omschrijving;
    }
    /**
     * Print Artikel beschrijving en aantal
     */
    public void print() {
        System.out.println( "Artikel: " + omschrijving );
        System.out.println( "Aantal: " + aantal );
        System.out.println( "------------------" );
  }
}



/**
 * De klasse <code>Voorraadlijst</code> representeert een lijst van de
 * voorraad van artikelen.
 * @author (Rosanne Baars)
 * @version (1.0)
 */
import java.util.*;
public class Voorraadlijst
{
    private ArrayList<Artikel> lijst;

    /**
     * Initialiseert een voorraadlijst
     */
    public Voorraadlijst(){
        lijst = new ArrayList<Artikel>();
    }

    /**
     * Print het overzicht met artikelen
     */
    public void printOverzicht(){
        for( Artikel a : lijst ) {
            a.print();
        }
    }
    /**
     * Voeg artikelen toe aan het overzicht
     */
    public void voegtoe( Artikel artikel ){
      lijst.add( artikel );
    }
}

/**************************
Opdracht 2
**************************/

/**
 * De klasse <code>Student</code> representeer een student in de administratie
 *
 * @author (Rosanne Baars)
 * @version (1.0)
 */
public class Student
{
    public String naam;
    private int dag;
    private int maand;
    private int jaar;

    /**
     *  Initialiseert een student
     */
    public Student(String naam,int dag, int maand, int jaar)
    {
        this.naam = naam;
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    /**
     * Print student
     */
    public void printStudent()
    {
        System.out.println("Naam: " + naam);
        System.out.println("Geboortedatum: " + dag + "-" + maand + "-" + jaar);
        System.out.println("_________________");
    }
}



/**
 * De klasse <code>Studentenlijst</code> representeer een lijst met studenten
 *
 * @author (Rosanne Baars)
 * @version (1.0)
 */
import java.util.*;
public class Studentenlijst
{
    private ArrayList<Student> lijst;

    /**
     *  Initialiseert een studentenlijst
     */
    public Studentenlijst()
    {
        lijst = new ArrayList<Student>();
    }

    /**
     * Voeg een student toe aan de studentenlijst
     *
     * @param  student  de student die moet woren toegevoegd
     */
    public void voegStudentToe(Student student)
    {
       lijst.add( student );
    }

     /**
     * Print de naam en geboortedatum van de studenten in de lijst
     *
     */
    public void printStudentenlijst()
    {
       for ( Student s : lijst ) {
           s.printStudent();
       }
    }
}



/**
 * De klasse <code>Tentamenresultaat</code> representeert het resultaat van een
 * student voor een vak
 * @author (Rosanne Baars)
 * @version (1.0)
 */
public class Tentamenresultaat
{
    private String vak;
    private int cijfer;
    private int dag;
    private int maand;
    private int jaar;
    private Student student;

    /**
     *  Initialiseert een tentamenresultaat
     */
    public Tentamenresultaat(Student student, String vak, int cijfer,
                             int dag, int maand, int jaar)
    {
        this.student = student;
        this.vak = vak;
        this.cijfer = cijfer;
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    /**
     * Print de naam van de student, het vak, het cijfer en de datum
     * gerelateerd aan het resultaat
     *
     */
    public void printResultaat(){
        System.out.println("Naam: " + student.naam);
        System.out.println("Vak: " + vak);
        System.out.println("Cijfer: "+ cijfer);
        System.out.println("Datum: " + dag + "-" + maand + "-" + jaar);
    }

}



/**
 * De klasse <code>Resultatenlijst</code> representeer een lijst met alle
 * resultaten van alle studenten
 * @author (Rosanne Baars)
 * @version (1.0)
 */
import java.util.*;
public class Resultatenlijst
{
    private ArrayList<Tentamenresultaat> lijst;

    /**
     *  Initialiseert een resultatenlijst
     */
    public Resultatenlijst()
    {
       lijst = new ArrayList<Tentamenresultaat>();
    }

    /**
     * Voeg resultaat toe aan de resultatenlijst
     *
     * @param  tentamenresultaat het resultaat dat wordt toegevoegd
     */
    public void voegResultaatToe(Tentamenresultaat tentamenresultaat)
    {
        lijst.add( tentamenresultaat);
    }

    /**
     * Print de resultaten in de lijst
     */
    public void printResultatenoverzicht()
    {
        for ( Tentamenresultaat t : lijst){
            t.printResultaat();
        }
    }
}
