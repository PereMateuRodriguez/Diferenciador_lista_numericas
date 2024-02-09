public class Main {
  public static void main(String[] args) {
    int[] a = {1,2,3,3,3,4,5};
    int[] b = {1,3}; 
    
    for (int i = 0; i < b.length ; i++){
    	for (int j = 0; j < a.length; j++){
        	if(a[j] == b[i]){
            	a[j] = -1;
            }
        }
    }
    int con = 0;
    for (int i = 0; i < a.length ; i++){
    	if (a[i] >=0){
        	con++;
        }
    }
    
    int[] c = new int[con];
    int contador =0;
    for (int i = 0; i < a.length ; i++){
    	if(a[i] >= 0){
        	c[contador] = a[i];
            System.out.println(c[contador]);
            contador++;
            
        }
    }
  }
}
