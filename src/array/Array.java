/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author tanjil
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] word = new String[3];
        word[0] = "Hello";
        word[1] = "To";
        word[2] = "You";
        
        String[] fruits = {"Apple", "Banana", "Pear", "Kiwi"};
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        
        int value=0;
        String text = null;
        System.out.println(text);
        
        String[] texts = new String[2];
        System.out.println(texts[0]);
        texts[0] = "one";
        System.out.println(texts[0]);
    }
    
}
