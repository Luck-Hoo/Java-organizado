
public class Main8 {
    public static void main(String[] args){
        msg("Olá, mundo!", 5);
        System.out.println(soma2num(5,2));
        System.out.println(somaNnum(1,5,4,3,5));
        System.out.println(somaNnum(1.1,5.5,4.4,3.3,5.5));
    }
    public static void msg(String m, int i){
        System.out.println(m);
        System.out.println(i);
    }
    public static int soma2num(int n1, int n2){
        int result = n1+n2;
        return result;
    }
    public static int somaNnum(int...numeros){
        int res=0;
        for (int n:numeros){
            res+=n;
        }
        return res;
    }
    public static Double somaNnum(Double...numeros){
        Double res=0.0;
        for (Double n:numeros){
            res+=n;
        }
        return res;
    }
}
