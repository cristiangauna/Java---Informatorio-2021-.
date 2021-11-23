import java.time.LocalDate;

public class Alumnos 
{
    private String nombre;
    private String apellido;
    private LocalDate cumpleaños;

    public Alumnos(String nombre, String apellido, LocalDate cumpleaños) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumpleaños = cumpleaños;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(LocalDate cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
}
