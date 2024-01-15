package AbstractFactoryEjemplo;

import AbstractFactoryEjemplo.Muebles.MesaDeNoche;
import AbstractFactoryEjemplo.Muebles.Silla;
import AbstractFactoryEjemplo.Muebles.Sofa;

public class MueblesVictorianosFactory implements MueblesFactory {

    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    public Sofa crearSofa() {
        return new SofaVictoriano();
    }

    public MesaDeNoche crearMesaDeNoche() {
        return new MesaDeNocheVictoriana();
    }
}
