public class Testesobrecarga{

    public static void main(String[] args){
        Calculadora calc =new Calculadora();
        //int res = calc.soma(2,"2");
        double b = calc.soma(2,2);
    }
}

/* public class Testesobrecarga {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int a =2, b=3;
        int res1 = calc.soma(a,b);
        System.out.println(res1);
        // poliformismo estatico ou suporte sobrecarga de metodo
        // C não tem
        float f1 = 2.5f;
        float f2 = 5.6f;
        float res2 = calc.soma(f1,f2);
        System.out.println(res2);
        String s1 = "234";
        String s2 = "556";
        int sRes = calc.soma(s1,s2);
        int tres = calc.soma(1,2,3);


        int intString = calc.soma(a,s1);


        int stringInt = calc.soma(s1,a);

        //int iS1 = Integer.parseInt(s1);
        //int iS2 = Integer.parseInt(s2);

        //int sRes = calc.soma(iS1,iS2);
    }
} */