class Main{
        public static void sun() {
                System.out.println("glow");
        } 
        public static void summer(int temp) {
                if(temp > 100) { //changed temp to 100
                        System.out.print("!");
                        temp = 1; 
                        summer(temp);
        }
}
  public static void main( String[] args) { 
         summer(91);
         sun(); 
       }
}
