public class print_format_op {
    
    public static void main(String[] args) {
        
        /*
        cocatination operation has the presidence here 
        */
        System.out.println("hello world"+10+20);

        /*
         println takes only one argument which is optional...
         */
        System.out.println();

        /*
        
        formated o/p

        conversion :
        d - integer/short/long
        f - float/double
        c - char
        o - octa
        x - hexa
        s - string 

        flag:

        ( -> when no is neg it is displayed in bracket
        + -> when no is neg it is signed - else +
        0 -> vancent places are filled with 0
        - -> when no is neg only then - sign is displayed also in case of string show left align format

        use printf('%[argu-index$][flag][width].[precision]conversion') / format('%[argu-index$][flag][width].[precision]conversion')

         */

         int m =10;
         float n = 3;
         long l = 2;
         short st = 13;

         System.out.printf( "%d %f \n",m,n);
         System.out.printf("%3$d %2$d %1$s","hello\n",l,st);
         System.out.printf("%-10d",-10);





    }

}
