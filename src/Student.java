public class Student {
    private Osoba osoba;
    private Wydzial WydzialEnum;
  public Student(Osoba osoba,Wydzial WydzialEnum){
       this.osoba=osoba;
       this.WydzialEnum=WydzialEnum;
  }

  public Osoba getOsoba(){
      return osoba;
  }
    public Wydzial getWydzialEnum(){
        return WydzialEnum;
    }
    public void setOsoba(Osoba osoba){
      this.osoba=osoba;
    }
    public void setWydzialEnum(Wydzial WydzialEnum){
      this.WydzialEnum=WydzialEnum;
    }
    public String toString(){
      return "Student z wydzialu "+WydzialEnum+"nazywa się "+osoba;
    }

}
