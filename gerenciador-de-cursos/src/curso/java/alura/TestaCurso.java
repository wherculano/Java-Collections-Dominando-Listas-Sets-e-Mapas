package curso.java.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Formacao Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Adicionando Aula", 20));
        javaColecoes.adiciona(new Aula("Trabalhando com Collections", 15));
        // javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        // Erro! Nao há mais acesso aos metodos nativos de List

        System.out.println(javaColecoes.getAulas());
    }
}
