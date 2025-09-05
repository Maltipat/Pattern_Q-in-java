class Main {
    public static void main(String[] args) {
     int row=3;
     for(int i=1;i<=row;i++){
         for(int j=1;j<=row;j++){
             if((i==1 && j==1)|| i==2 ||(i==3 && j==3)){
                 System.out.print("*");
             }
             else{
                 System.out.print(" ");
             }
         }
         System.out.println();
     }
    }
}
