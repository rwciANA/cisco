public class calculator{
   public static void main(String[] args) {
      system.out.println("suma "+ add(3,4));
      system.out.println("resta "+ res(13,4));
      system.out.println("producto "+ mul(322,44));
      system.out.println("resta "+ div(313,324));
      system.out.println("modulo "+ mod(33,3));
     
   }
public int add (int a , int b ){
    int suma = a +b ;
      
   return suma ;
}
public int res(int a, int b){

   return a-b;
}public mul(int a. int b){

   return a*b;
}
public div (int a, int b){

   if(b==0)
      system.out.println("error");
   else return a/b;
}
   public mod (int a, int b){

      return a%b;
   }


}
