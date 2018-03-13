package creacionales.abstractFactory;

import creacionales.abstractFactory.implementaciones.PacientesMysql;
import creacionales.abstractFactory.implementaciones.PacientesOracle;
import creacionales.abstractFactory.interfaces.Leer;

import java.util.List;

/**
 * Created by luis on 12/03/18.
 */
public class App {
    public static void main(String[] args) {
        Leer pacientesAbsFactory;
        pacientesAbsFactory = new App().getFactory(1);
        List<Paciente> pacientes = pacientesAbsFactory.getPacientes();
        for (Paciente paciente: pacientes){
            System.out.println(paciente);
        }

        pacientesAbsFactory = new App().getFactory(2);

    }

    public Leer getFactory(Integer tipo){
        Leer pacientesAbsFactory = null;
        if(tipo == 1){
            pacientesAbsFactory = new PacientesMysql();
        }else{
            pacientesAbsFactory = new PacientesOracle();
        }

        return pacientesAbsFactory;
    }
}
