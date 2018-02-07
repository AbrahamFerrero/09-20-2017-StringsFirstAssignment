
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public boolean twoOccurrences (String stringa, String stringb) {
        int occurrence = stringb.indexOf(stringa);
        if (occurrence == -1) {
            return false;
   
        }
        else {
            System.out.println("occurrence= "+occurrence);
            return true;
        }
        
    }
    
    public String lastPart(String stringa, String stringb){
        int occurrence = stringb.indexOf(stringa); //This tells you there is an occurrence, and where
        int startFrom = stringa.length(); // This tells you the lenght of the occurrence
        String finalPart = stringb.substring(startFrom+occurrence); //the lenght of the occurrence + the place where the occurrence starts, gives you the solution
        if (occurrence == -1){
            return stringb;
        }
        else {
            //System.out.println("estringalenght= " + startFrom); ---- this command helped me find the solution, just for test purposes
            //System.out.println("occurrence= " + occurrence);  ---- this command helped me find the solution, just for test purposes
            return finalPart;
        }
       
    }
    
    public void testing(){
        String stringa = "by";
        String stringb = "A story by Abby Long";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));
        
        stringa = "a";
        stringb = "banana";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));
        
        stringa = "a";
        stringb = "melocoton";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));
    }
    
    public void testingLastPart(){
        String stringa = "an";
        String stringb = "banana";
        System.out.println("The part of the string after " + stringa + " in " +stringb +" is "+ lastPart(stringa, stringb));
        
        stringa = "rest";
        stringb = "deforestacion";
        System.out.println("The part of the string after " + stringa + " in " +stringb +" is "+ lastPart(stringa, stringb));
        
        stringa = "cio";
        stringb = "deforestacion";
        System.out.println("The part of the string after " + stringa + " in " +stringb +" is "+ lastPart(stringa, stringb));
        
        stringa = "zoo";
        stringb = "forest";
        System.out.println("The part of the string after " + stringa + " in " +stringb +" is "+ lastPart(stringa, stringb));
    }
}
