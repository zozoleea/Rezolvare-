public class Test {
    
    private static int i;
    
    private static int addOne()

    {
        return i+1;
    }
    
    private static int multiple_five()
    {
        return i*5;
    }
    
    private static int substract_3()
    {
        return i/3;
    }

    private static void calc_val(int[] calc)
    {
        if(calc.length>0 )
        {
            System.out.print("[");
            for(int j=0; j< calc.length; j++)
            {
                System.out.print(Integer.toString(calc[j]));
                if(j<calc.length-1)
                {
                    System.out.print(", ");
                }
                
            }
            System.out.print(" ]");
        }else{
            System.out.print("Nu ati trimis nimic");
        }
    }
    public static void main(String[] args) {
        int input = 6;
        i=input;
        int []calc = {addOne(),multiple_five(), substract_3()};
        calc_val(calc);
    }
}