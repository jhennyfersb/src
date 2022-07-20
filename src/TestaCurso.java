import java.util.List;

public class TestaCurso {
    public static void main(String[] args){
        Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");
        /*List<Aula> aulas = javaColecoes.getAula();
        javaColecoes.getAula().add(new Aula("Trabalhando com ArrayList",21));
        System.out.println(aulas);*/

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma Aula",20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes",24));
        System.out.println(javaColecoes);
    }
}
