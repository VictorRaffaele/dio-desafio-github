import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TabuleiroSecreto {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] stringBuff = buff.readLine().split(" ");
        int tabuleiro = Integer.parseInt(stringBuff[0]);
        int numOp = Integer.parseInt(stringBuff[1]);
        int[][] matriz = new int[tabuleiro][tabuleiro];
        
        for (int i = 0; i < tabuleiro ; i++) {
            for (int j = 0; j < tabuleiro; j++) {
                matriz[i][j] = 0;
            }
        }
        
        for (int cont = 0; cont < numOp; cont++) {
            String[] comando = buff.readLine().split(" ");
            int operacao = Integer.parseInt(comando[0]);
            int leitura = Integer.parseInt(comando[1]);
            int valor = 0;
            
            if(comando.length == 3) {
                valor = Integer.parseInt(comando[2]);
            }
            
            switch (operacao) {
                case 1: atribuiLinha(leitura, valor, matriz); break;
                case 2: atribuiColuna(leitura, valor, matriz); break;
                case 3: imprimiLinha(leitura, matriz); break;
                case 4: imprimiColuna(leitura, matriz); break;
            }
        }
    }
    
    private static void imprimiColuna(int coluna, int[][] matriz) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(matriz[0][coluna-1], 1);
    
        for (int lin = 1; lin < matriz.length; lin++) {
            if(map.containsKey(matriz[lin][coluna-1])){
                map.put(matriz[lin][coluna-1], map.get(matriz[lin][coluna-1])+1);
            } else {
                map.put(matriz[lin][coluna-1], 1);
            }
        }
    
        var key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        
        if(map.get(key) == 1){
            key = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        }
        
        System.out.println(key);
    }
    
    private static void imprimiLinha(int linha, int[][] matriz) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(matriz[linha-1][0], 1);
        
        for (int col = 1; col < matriz.length; col++) {
            if(map.containsKey(matriz[linha-1][col])){
                map.put(matriz[linha-1][col], map.get(matriz[linha-1][col])+1);
            } else {
                map.put(matriz[linha-1][col], 1);
            }
        }
    
        var key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        
        if(map.get(key) == 1){
            key = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        }
        
        System.out.println(key);
    }
    
    private static void atribuiColuna(int coluna, int valor, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][coluna-1] = valor;
        }
    }
    
    private static void atribuiLinha(int linha, int valor, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[linha-1][i] = valor;
        }
    }
}