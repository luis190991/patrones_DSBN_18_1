package creacionales.abstractFactory;

import java.util.Date;

/**
 * Created by luis on 12/03/18.
 */
public class Paciente {

    private Integer id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
}
