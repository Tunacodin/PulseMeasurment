

public class People {
    
   private String Name;
   private String SecondName;
   private int Birthday;
    
    public People(String Name, String SecondName, int Birthday){
this.Name=Name;
this.SecondName = SecondName;
this.Birthday=Birthday;
}
 public String getName(){
    
    return this.Name;
    
    }
    public void setName(String Name){
     this.Name = Name;
    
    }
 public String getSecondame(){
    
    return this.SecondName;
    
    }
    public void setSecondName(String accountName){
     this.SecondName = SecondName;
    
    }

    public int getBirthday(){
        return Birthday;
    
    }
    public void setBirthday(int Birthday){
        this.Birthday = Birthday;
    
    }
    public int getAge(){
        return 2022-getBirthday();
}

    public int getMaxPulse(){

        return 220 - getAge();

}
    public int getIdealPulse(){

        return getMaxPulse()/2;

}

}


