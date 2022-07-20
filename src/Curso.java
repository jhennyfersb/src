import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private Set<Aluno> alunos = new HashSet<>();
    private List<Aula> aula = new LinkedList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);

    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aula) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    public String getNome() {
        return nome;
    }
    public boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula) {
        this.aula.add(aula);
    }

    public List<Aula> getAula() {
        return Collections.unmodifiableList(aula);
    }

    @Override
    public String toString() {
        return "[Curso:" + this.getNome() + ",tempo total:" + this.getTempoTotal() + ", aulas: [" + this.aula + "] ]";
    }
}
