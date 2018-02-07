
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
        
    public String findSimpleGene(String dna) {
        String result = "";
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
            result = dna.substring(atg,taa+3);
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
      System.out.println("DNA Strand is = " + dna);
      gene = findSimpleGene(dna);
      System.out.println("Gene is = " + gene);
      
      dna = "ATCATGAACAACGGA";
      System.out.println("There is a Strand = " + dna);
      gene = findSimpleGene(dna);
      System.out.println("Gene is = " + gene);
      
      dna = "ATCGAATCCAAT";
      System.out.println("There is a Strand = " + dna);
      gene = findSimpleGene(dna);
      System.out.println("Gene is = " + gene);
      
      dna = "ATCATCATGGTGGTTTAAGAC";
      System.out.println("There is a Strand = " + dna);
      gene = findSimpleGene(dna);
      System.out.println("Gene is = " + gene);
      
      dna = "ATGCGCCGTAA";
      System.out.println("There is a Strand = " + dna);
      gene = findSimpleGene(dna);
      System.out.println("Gene is = " + gene);
    }
}
