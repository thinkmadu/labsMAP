package lab2Creator;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private ArrayList<Disciplina> disciplinasMinistradas = new ArrayList<>();
    private ArrayList<String> horarios = new ArrayList<>();

    //  GETS E SETS
    public void setDisciplinasMinistradas(ArrayList <Disciplina> disciplinasMinistradas){
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public ArrayList<Disciplina> getDisciplinasMinistradas(){
        return disciplinasMinistradas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // CONSTRUTOR
    public Professor(String nome){
        this.disciplinasMinistradas = new ArrayList<>();
    }
    public Professor(String nome, ArrayList<Disciplina> disciplinasMinistradas) {
        this.nome = nome;
        setDisciplinasMinistradas(disciplinasMinistradas);
    }

    // MÉTODOS
    public ArrayList<String> getHorarios() {
        ArrayList<String> horarios = new ArrayList<>();
        for (Disciplina disciplina : this.disciplinasMinistradas) {
            if (!horarios.contains(disciplina.getHorario())) {
                horarios.add(disciplina.getHorario());
            }
        }
        return horarios;
    }

    public List<String> getNomesDisciplinasMinistradas() {
        List<String> nomesDisciplinas = new ArrayList<>();
        for (Disciplina disciplina : disciplinasMinistradas) {
            nomesDisciplinas.add(disciplina.getNome());
        }
        return nomesDisciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinasMinistradas.add(disciplina);
    }
}
