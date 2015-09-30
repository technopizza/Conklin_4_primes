/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;

/**
 *
 * @author jconklin2391
 */
public class Primes {

    static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static boolean isPrime2(int number) {
        int devisor = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                devisor++;
            }    
        }
        if(devisor > 0){
            return false;
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            if (isPrime2(i)) {
                System.out.println(i);
            }
        }

    }
}
