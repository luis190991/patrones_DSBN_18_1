package creacionales.abstractFactory.interfaces;

import creacionales.abstractFactory.Paciente;

import java.util.List;

/**
 * Created by luis on 12/03/18.
 */
public interface Leer {
    public List<Paciente> getPacientes();

    public Paciente getPaciente(Integer id);
}
