/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util. *;
public class Umur {
    public static void main(String[] args){
        
        int Umur;
        String Ulasan;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan umur anda: " );
        Umur=input.nextInt();
        
        if (Umur <= 45){
            Ulasan="Anda masih muda dan cantik";
            
        }else{
            Ulasan="Anda sudah tua dan perlukan rehat";
        }
        System.out.println (Ulasan );
            
        
        }
    }