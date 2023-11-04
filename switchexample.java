class switchexample{
    public static void main(String a[]){
         //Declaring a variable for switch expression  
        int weight=60;
          //Switch expression  
        switch(weight){
              //Case statements  
            case 20: System.out.println("20");
            break;
            case 50: System.out.println("50");
            break;
            case 70: System.out.println("70");
            break;
             //Default case statement 
            default:System.out.println("Not in 20, 50 or 70");
        }
    }
}