

/**
 *
 * @author Admin
 */
public class TestingPeople {
    
    
    public static void main (String[] args){
    
        People people1 = new People ("Tuna", "Bostancıbaşı",2001) ;
        
        int Age =people1.getAge();
        int maxPulse = people1.getMaxPulse();
        int idealPulse = people1.getIdealPulse();
        String Name = people1.getName();
        
        System.out.println(Name + "Age:" + Age +" max pulse : "+ maxPulse +" ideal pulse : "+idealPulse);
    
    
    
    
    }
    
    
    
    
}