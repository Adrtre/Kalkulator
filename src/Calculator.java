public class Calculator {

        int a ;
        int b ;

        public Calculator(int a , int b){
            this.a = a ;
            this.b = b ;
        }

        public void addition(){
            int resultAddition = a + b  ;
            System.out.println(resultAddition);
    }

    public void subtraction(){
            int resultSubtraction = a-b ;
        System.out.println(resultSubtraction);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator( 35 , 10);
        calculator.addition();
        calculator.subtraction();
    }
}

