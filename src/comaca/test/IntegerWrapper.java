package comaca.test;

public class IntegerWrapper {
        private int number;

        public IntegerWrapper(int number){
            this.number = number ;
        }
        public int getNumber(){
            return number;
        }
        public static void swap(IntegerWrapper i1 , IntegerWrapper i2){
            int a = i1.number;
            i1.number = i2.number;
            i2.number = a;
        }
}
