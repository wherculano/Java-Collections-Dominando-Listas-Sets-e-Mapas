package curso.java.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

    public static void main(String[] args) {

        Collection<Integer> numerosArrayList = new ArrayList<Integer>();
        Collection<Integer> numerosHashSet = new HashSet<>();

        long inicioArrayList = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numerosArrayList.add(i);
        }

        for (Integer numero : numerosArrayList) {
            numerosArrayList.contains(numero);
        }

        long fimArrayList = System.currentTimeMillis();

        long tempoDeExecucaoArrayList = fimArrayList - inicioArrayList;

        System.out.println("Tempo gasto: " + tempoDeExecucaoArrayList);

        // -----------------------------------------------------------

        long inicioHashSet = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numerosHashSet.add(i);
        }

        for (Integer numero : numerosHashSet) {
            numerosHashSet.contains(numero);
        }

        long fimHashSet = System.currentTimeMillis();

        long tempoDeExecucaoHashSet = fimHashSet - inicioHashSet;

        System.out.println("Tempo gasto: " + tempoDeExecucaoHashSet);

    }

}
