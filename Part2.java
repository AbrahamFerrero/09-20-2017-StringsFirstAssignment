
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
       public String findSimpleGene(String dna, String StartCodon, String StopCodon) {
        String resultTemp = "";
        int atg = dna.indexOf("ATG");
        int taa = dna.indexOf("TAA", atg +3);
        
        if (atg == -1 && taa == -1){
            return "There is no ATG or TAA strand)";
        }
        if (atg == -1) {
            return "There is no ATG strand";
        }
        if (taa == -1) {
            return "There is no TAA strand";
        }
        else {
            resultTemp = dna.substring(atg,taa+3);
            String result= resultTemp.toLowerCase();
            int compare = result.length()% 3;
            if (compare == 0) {
                return result;
            }
            else {
                return "no mames wey, no multiplo";
            }
        }
    }
    
        public void testFindSimpleGene() {
      String gene = "";
      String dna = "AAAATACCAGTACCACTAAGGA";
      String StartCodon = "ATG";
      String StopCodon = "TAA";
      System.out.println("DNA Strand is = " + dna);
      gene = findSimpleGene(dna,StartCodon,StopCodon);
      System.out.println("Gene is = " + gene);
      
      dna = "ATCATGAACAACGGA";
      StartCodon = "ATG";
       StopCodon = "TAA";
      System.out.println("There is a Strand = " + dna);
      gene = findSimpleGene(dna,StartCodon,StopCodon);
      System.out.println("Gene is = " + gene);
      
      dna = "ATCGAATCCAAT";
      StartCodon = "ATG";
      StopCodon = "TAA";
      System.out.println("There is a Strand = " + dna);
      gene = findSimpleGene(dna,StartCodon,StopCodon);
      System.out.println("Gene is = " + gene);
      
      dna = "ATCATCATGGTGGTTTAAGAC";
      StartCodon = "ATG";
      StopCodon = "TAA";
      System.out.println("There is a Strand = " + dna);
      gene = findSimpleGene(dna,StartCodon,StopCodon);
      System.out.println("Gene is = " + gene);
      
      dna = "ATGCGCCGTAA";
      StartCodon = "ATG";
      StopCodon = "TAA";
      System.out.println("There is a Strand = " + dna);
      gene = findSimpleGene(dna,StartCodon,StopCodon);
      System.out.println("Gene is = " + gene);
    }
}
