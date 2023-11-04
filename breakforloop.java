//Java Program to demonstrate the use of break statement inside the for loop.  
class breakforloop{
    public static void main(String a[]){
         //using for loop  
        for(int x=1;x<=15;x++){
            if(x==8){
                  //breaking the loop  
                break;
            }
            System.out.println(x);
        }
    }
}