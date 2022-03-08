import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Cobaias {

    public static void main(String[] args) throws IOException, InputMismatchException{
    Scanner input =new Scanner(System.in);
    char cobaia = '.';
    int s=0,r=0,c=0,t=0,quant=0;
    int N=input.nextInt();


        if(N >= 1 && N <= 15){
            for(int i = 0; i < N; i++){
                try {
                    quant=input.nextInt();
                    cobaia = input.next().toUpperCase().charAt(0);

                    if(cobaia == 'C'){
                        c += quant;
                        t += quant;
                    }else if(cobaia == 'R'){
                        r += quant;
                        t += quant;
                    }else if(cobaia == 'S'){
                        s += quant;
                        t += quant;
                    }
                    double percC = calculoPorcentagem(c,t);
                    double percR = calculoPorcentagem(r, t);
                    double percS = calculoPorcentagem(s, t);
                    System.out.printf("%s %d %s\n","Total:", t, "cobaias");
                    System.out.printf("%s %d\n", "Total de coelhos:", c);
                    System.out.printf("%s %d\n", "Total de ratos:", r);
                    System.out.printf("%s %d\n", "Total de sapos:", s);
                    System.out.printf("%s %.2f %s\n","Percentual de coelhos:", percC,"%");
                    System.out.printf("%s %.2f %s\n","Percentual de ratos:",  percR, "%");
                    System.out.printf("%s %.2f %s\n","Percentual de sapos:" , percS, "%");

                } catch (Exception e) {
                    System.out.println("Tente novamente");
                }
            }
        }
        input.close();
    }

    public static double calculoPorcentagem(int numero, int total){
        double porcetagem = (numero * 100.0 )/total;
        return porcetagem;
    }
}
