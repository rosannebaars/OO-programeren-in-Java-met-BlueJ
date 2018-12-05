/**
Opdracht 3: Teller
 */

 public class Teller
 {
     // Attributen
     public int waarde;

     // Constructor
     public Teller (){
         waarde = 0;
     }

     // Methoden
     public void verhoog(){
         waarde = waarde + 1;
     }
     public void verlaag(){
         waarde = waarde - 1;
     }
     public void setWaarde(int waarde){
         this.waarde = waarde;
     }
     public int getWaarde(){
         return waarde;
     }
 }


/**
Opdracht 4: Scorebord
 */

 public class Scorebord
{
    // Attributen
    private Teller teller1, teller2;
    private String stand;

    // Constructor
    public Scorebord(){
        teller1 = new Teller();
        teller2 = new Teller();
    }

    // Methoden
    public void verhoogTeller1(){
        teller1.verhoog();
    }
    public void verhoogTeller2(){
        teller2.verhoog();
    }
    public void verlaagTeller1(){
        teller1.verlaag();
    }
    public void verlaagTeller2(){
        teller2.verlaag();
    }
    public String standToString(){
        return teller1.waarde + "-" + teller2.waarde;
    }
    public void printStand(){
        stand = standToString();
        System.out.println("De score is: " + stand);
    }

}
