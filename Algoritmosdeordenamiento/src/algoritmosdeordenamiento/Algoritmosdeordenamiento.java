package algoritmosdeordenamiento;
public class Algoritmosdeordenamiento {
    public static void main(String[] args) {
     
      int [] Orden = {2,6,5,3,1};
      
      for(int i = 0; i < Orden.length; i++){
         for(int o = i + 1 ; o < Orden.length; o++){ 
             
        if(Orden[i] > Orden[o]){            
            int num = Orden[i];
            Orden[i] = Orden[o];
            Orden[o] = num;            
        }          
      }
         }
 for(int num : Orden){
             System.out.print(num + " ");
}
} 
}
    
    

