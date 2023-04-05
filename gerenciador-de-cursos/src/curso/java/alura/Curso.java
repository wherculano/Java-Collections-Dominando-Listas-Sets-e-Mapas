package curso.java.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas(){
        // Nao deixa as filhas terem acesso aos metodos de List (add, remove, etc).
        return Collections.unmodifiableList(this.aulas);
    }

    public String getNome() {
        return this.nome;
    }

    public String getInstrutor() {
        return this.instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }
}
