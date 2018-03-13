package creacionales.abstractFactory.implementaciones;

import creacionales.abstractFactory.Paciente;
import creacionales.abstractFactory.interfaces.Leer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 12/03/18.
 */
public class PacientesOracle implements Leer{
    public List<Paciente> getPacientes() {
        return new ArrayList<Paciente>();
    }

    public Paciente getPaciente(Integer id) {
        return new Paciente();
    }
}
