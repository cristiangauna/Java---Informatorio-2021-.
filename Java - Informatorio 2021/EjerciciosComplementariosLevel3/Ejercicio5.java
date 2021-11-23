import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 
{
    public static void main(String[] args) 
    {
        List<Alumnos> alumnos = List.of(
                        new Alumnos("Homero", "Simpson", LocalDate.now().minusYears(30)),
                        new Alumnos("Lucas", "Ayala", LocalDate.of(1950, 7, 7)),
                        new Alumnos("Oscar", "Medina", LocalDate.of(1980, 12, 7)),
                        new Alumnos("Alejandro", "Perez", LocalDate.of(1971, 8, 10)),
                        new Alumnos("Sebastian", "Irala", LocalDate.of(1964, 2, 5)),
                        new Alumnos("Martin", "Irala", LocalDate.of(1960, 1, 12)),
                        new Alumnos("Lucia", "Irala", LocalDate.of(1941, 10, 5)));
        Map<String, Integer> alumnosConEdades = alumnos.stream()
                                                    .collect(Collectors
                                                    .toMap(p-> (p.getNombre() + " " + p.getApellido()),
                                                    p -> Ejercicio5.getEdad(p.getCumpleaños())));
        System.out.println("\n" + alumnosConEdades);
    }

    public static Integer getEdad(LocalDate cumpleaños)
    {
        return Period.between(cumpleaños, LocalDate.now()).getYears();
    }
}
