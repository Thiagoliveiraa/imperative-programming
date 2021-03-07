/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imperative.programming.array01;

/**
 *
 * @author Thiago
 */
public class ImperativeProgrammingArray01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] firstArr = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
        int[] secondArr = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};
        int[] thirdArr = new int[20];
        for (int i = 0; i < thirdArr.length; i++) {
            thirdArr[i] = (i % 2 == 0) ? firstArr[i / 2] : secondArr[i / 2];
            System.out.println(thirdArr[i]);
        }
    }

}
