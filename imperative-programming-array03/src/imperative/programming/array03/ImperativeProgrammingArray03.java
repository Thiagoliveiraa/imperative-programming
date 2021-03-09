package imperative.programming.array03;

/*
 * @author Thiago
 */
public class ImperativeProgrammingArray03 {

    public static void main(String[] args) {
        int[] setA = {3,8,4,2,1,6,8,7,11,9}; 
        int equalsAeB = 0;
        int[] setB = {2,1,5,12,3,0,1,4,5,6};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (setA[i] == setB[j]) {
                    equalsAeB++;
                }
            }
        }
        int[] unionAeB = new int[(setA.length + setB.length) - equalsAeB];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (setA[i] == setB[j]) {
                    unionAeB[j] = setA[i];
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(unionAeB[i]);
        }
        //System.out.println(equalsAeB);
        //int[] unionAeB = new int[10];
        /*for(int i = 0; i < setA.length; i++){
            for (int j = 0; j < setB.length; j++) {
               if(setA[i] == setB[j]){
                    unionAeB[i] = setA[i];
                } 
            }
            
           // System.out.println(setA[i]);
           // System.out.println(setB[i]);
        }*/
        //System.out.println(unionAeB.length);
       /* for(int i = 0 ; i < unionAeB.length; i++){
            System.out.println(unionAeB[i]);
        }*/
        
        
    }
    
}
