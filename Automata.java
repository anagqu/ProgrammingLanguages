
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pupr.prog.lang.automata;

/**
 *
 * @author Andrew
 */
import java.util.Scanner;
public class Automata {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        boolean real=false;
        int pointQty = 0;
        
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='.'){pointQty++;}
            if(pointQty>1){real=false;break;}
            if(word.charAt(0)=='+'||word.charAt(0)=='-'||(word.charAt(0)<='9'&&word.charAt(0)>='0')||word.charAt(0)=='.')
            {
                if(pointQty<)
                real = true;
            }else
            {
                System.out.println("Not a real number");
                break;
            }

        }
        if(real)
        {System.out.println("Real number");}
        
    }
    
}
