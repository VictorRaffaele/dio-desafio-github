import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia{
    protected List<Double> entradas;

    public TemperaturaMedia(){
        this.entradas = new ArrayList<Double>();
    }

    public List<Double> entradas(){
        
        Scanner scan = new Scanner(System.in);
        
        for(int count = 0; count < 6; count++){
            this.entradas.add(scan.nextDouble());
        }

        scan.close();
        return entradas;
    }

    public Double media(List<Double> temps){
        Iterator<Double> iterator = temps.iterator();
        Double media = 0d;

        while(iterator.hasNext()){
            Double proximo = iterator.next();
            media += proximo;
        }

        media = media/temps.size();
        
        return media;
    }

    public void maioresMedia(List<Double> tempList, Double media){
        Iterator<Double> iterator2 = tempList.iterator();
        int countPrint = 0;

        while(iterator2.hasNext()){
            Double proximoValor = iterator2.next();
            countPrint++;

            if(proximoValor > media){
                if(countPrint == 1){System.out.printf("%s %.2f\n", "1 - Janeiro", proximoValor);}
                else if(countPrint == 2){System.out.printf("%s %.2f\n","2 - Fevereiro", proximoValor);}
                else if(countPrint == 3){System.out.printf("%s %.2f\n","3 - Marco", proximoValor);}
                else if(countPrint == 4){System.out.printf("%s %.2f\n","4 - Abril", proximoValor);}
                else if(countPrint == 5){System.out.printf("%s %.2f\n","5 - Maio", proximoValor);}
                else if(countPrint == 6){System.out.printf("%s %.2f\n","6 - Junho", proximoValor);}
                }
            }
                
        }

    public List<Double> getEntradas() {
        return this.entradas;
    }

}
