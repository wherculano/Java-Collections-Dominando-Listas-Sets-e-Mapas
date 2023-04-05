package curso.java.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoImutavelParaMutavel {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Formacao Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Adicionando Aula", 20));
        javaColecoes.adiciona(new Aula("Trabalhando com Collections", 15));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(javaColecoes.getAulas());

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);

        System.out.println(aulas);
        System.out.println("Tempo total de aulas: " + javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
}
