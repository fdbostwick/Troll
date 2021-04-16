/**
* This class holds a method to remove the vowels from 
* an original String
*/
package disemvoweler;

public class Disemvoweler{
   /**
   * Returns a new String with all the vowels removed
   * @param originStr the original string
   * @return originStr without the vowels AeIiOoUu
   */
   public static String disemvowel(String originStr){
      return originStr.replaceAll("[AaEeIiOoUu]","");
   }
}