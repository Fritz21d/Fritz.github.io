package Interview;

public class While {
    public static void main(String[] args) {
    	for(int i=1; i<10;i++) {
    		for(int j=1; j<10; j++)
    			System.out.print(" "+i+"X"+j+"="+(i*j)+"\t");
    		System.out.println();
    	}
 	}
}
    
//    	  int i=1,k;
//
//          while(i<=9){
//
//              int j=1;
//
//              while(j<=9){
//
//              k=i*j;
//
//              System.out.print(i+"x"+j+"=");
//
//                 if(k<10){
//                    System.out.print(" "+k+" ");
//                 }else{
//                    System.out.print(k+" ");
//
//                 }
//              j++;
//
//              }
//          System.out.println();
//
//          i++;
//
//          }
//    }  

