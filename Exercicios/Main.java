public class Main {
    
    public static void main(String[] args) {

        TemperaturaMedia claseTemp = new TemperaturaMedia();
        Double tempMedia = claseTemp.media(claseTemp.entradas());
        System.out.println(tempMedia);
        System.out.println(claseTemp.getEntradas());
        claseTemp.maioresMedia(claseTemp.getEntradas(), tempMedia);

    }
}
