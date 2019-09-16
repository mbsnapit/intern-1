/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.gre.vocab;

/**
 *
 * @author afiqah
 */
import java.util.*;
public class JavaApplicationGREVocab {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Initializing a dictionary
        
       String[] GREvocab = new String[10];
       String[] GREans = new String[10];
       Random rand = new Random();
       int n = rand.nextInt(8);
        
        
        GREvocab[0] = "(adj.) subordinate or supplementary\n" +
"(ant.) heart: _ _ _ _ _ _ _ _ _";
        GREvocab[1] = "(n.) a feeling of ill-will that arouses hostility: _ _ _ _ _ _";
        GREvocab[2] = "(n.) a short pithy instructive saying: _ _ _ _ _ _ _ _";
        GREvocab[3] = "(n.) a very small part or quantity: _ _ _ _";
        GREvocab[4] = "(v.) cause to feel shame; hurt the pride of: _ _ _ _ _";
        GREvocab[5] = "(v.) to encourage, assist, aid, support (especially in something wrong or unworthy): _ _ _ _";
        GREvocab[6] = "(adj.) temporarily inactive, stopped or suspended";
        GREvocab[7] = "(v.) seize and take control without authority and possibly with force\n" +
"(syn.) assume, seize, takeover, usurp\n" +
"(ant.) forfeit, forgo, give up, waive: _ _ _ _ _ _ _ _";
        
        GREans[0] = "ANCILLARY";
        GREans[1] = "ANIMUS";
        GREans[2] = "APHORISM";
        GREans[3] = "IOTA";
        GREans[4] = "ABASE";
        GREans[5] = "ABET";
        GREans[6] = "ABEYANT";
        GREans[7] = "ARROGATE";
        
        
        int z = n;
        System.out.println(GREvocab[z]);
        System.out.println(GREans[z]);
        String st = GREans[z];
      
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String j = w;
        String k = "";
        
        while (true) {
        if (j.equals(st)) {
        
            k = "Great job! " + z + st;
            
                   
            
                    
        } else {k = "Your answer is incorrect. Try again." + z + st;}  
             
           String m = sc.nextLine(); 
           
           
           
             
        System.out.println(k); 
        }
    }
    
    
}

