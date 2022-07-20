import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExercicioMap {
    public static void main(String[] args){
        Map<Integer,String> pessoas = new HashMap<>();
        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));

        Map<String,Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        Set<String> chaves = nomesParaIdade.keySet();
        for (String nome : chaves) {
            System.out.println(nome);
        }
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idades : valores) {
            System.out.println(idades);
        }
        Set<Map.Entry<String,Integer>> associacoes = nomesParaIdade.entrySet();
        for (Map.Entry<String,Integer> associacao: associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}
