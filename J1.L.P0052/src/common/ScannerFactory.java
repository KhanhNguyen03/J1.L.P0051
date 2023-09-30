/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;


public class ScannerFactory {
    
    private Scanner SCANNER;
    
    public Scanner getScanner(){
        if(SCANNER == null){
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }
    
    public String getString(){
        String input;
        while (true) {            
            input = getScanner().nextLine();
            if(!input.isEmpty()){
                break;
            }
        }
        return input;
    }
    
    public int getInt(){
        String input;
        while (true) {            
            input = getScanner().nextLine();
            if(input.matches("^[\\d]+")){
                break;
            }
        }
        return Integer.parseInt(input);
    }
    
    public String getYN(){
        String input;
        while(true){
            input = getScanner().nextLine();
            if(input.matches("^[YyNn]")){
                break;
            }
        }
        return input;
    }
}