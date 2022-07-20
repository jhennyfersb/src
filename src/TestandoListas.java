import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListas {
    public static void main(String[] args){
       /* String aula1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String aula2 = "Apache Camel";
        String aula3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(aula1);
        cursos.add(aula2);
        cursos.add(aula3);

        System.out.println(cursos.get(0));
        Collections.sort(cursos);
        System.out.println(cursos);*/

        Aula aula1 = new Aula("Revistando as ArrayLists",21);
        Aula aula2 = new Aula("Listas de objetos",20);
        Aula aula3 = new Aula("Relacionamento de listas e objetos",15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);


    }
}
