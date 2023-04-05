package curso.java.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat");

        System.out.println(alunos);

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println("O Paulo está no conjunto? " + pauloEstaMatriculado);

        // Para ter uma lista do conjunto de alunos
        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println(alunosEmLista);

    }
}
