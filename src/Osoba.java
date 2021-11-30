public class Osoba {

    String imie;
    String nazwisko;
    Integer indeks;

    public Osoba(String imie,String nazwisko,Integer indeks){
           this.imie=imie;
           this.nazwisko=nazwisko;
           this.indeks=indeks; }

           public  String getImie(){
               return imie;
           }
    public  String getNaziwsko(){
        return nazwisko;
    }
    public  Integer getIndeks(){
        return indeks;
    }
    public void setImie(String imie)
    {
        this.imie=imie;
    }
    public void setNazwisko(String nazwisko)
    {
        this.nazwisko=nazwisko;
    }
    public void setIndeks(Integer indeks)
    {
        this.indeks=indeks;
    }
    public String PrzedstawSie(){
        return "Nazywam sie"+imie + ""+ nazwisko+ "" + " moj indeks to"+indeks;
    }
    }

