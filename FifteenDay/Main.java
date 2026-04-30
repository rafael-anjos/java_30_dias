import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
          List<Funcionario> list = Arrays.asList(
            new Funcionario("Rafael", "TI", 3600),
            new Funcionario("Gabriel", "TI", 6000),
            new Funcionario("Miguel", "RH", 4500),
            new Funcionario("Andre", "RH", 2500),
            new Funcionario("Isaac", "DP", 1600),
            new Funcionario("Igor", "DP", 3000)
          );

          System.out.println("\n== Salario acima de R$ 3000,00 ==\n");
          list.stream()
            .filter(f -> f.getSalario() > 3000)
            .collect(Collectors.toList())
            .forEach(f -> System.out.printf(" %s | %s | R$ %.2f%n ", f.getNome(), f.getDepartamento(), f.getSalario()));
          
          System.out.println("\n== Nomes em ordem alfabetica ==\n");
          list.stream()
            .sorted(Comparator.comparing(Funcionario::getNome))
            .forEach(f -> System.out.printf(" %s, ", f.getNome()));
          
          System.out.println("\n\n== Media dos salarios ==\n");  
          list.stream()
            .mapToDouble(Funcionario::getSalario)
            .average()
            .ifPresent(m -> System.out.printf(" %.2f ", m));
          
          System.out.println("\n\n== Maior Salario ==\n");
          list.stream()
            .max(Comparator.comparingDouble(Funcionario::getSalario))
            .ifPresent(f -> System.out.printf(" %s | %s | R$ %.2f ", f.getNome(), f.getDepartamento(), f.getSalario()));
          
          System.out.println("\n\n== Separado por departamento ==");
          list.stream()
            .collect(Collectors.groupingBy(Funcionario::getDepartamento))
            .forEach((departamento, funcionarios) -> {
                System.out.printf("\n[ %s ] :", departamento);
                funcionarios.forEach(f -> System.out.printf(" %s,", f.getNome()));
            });  


    }
}