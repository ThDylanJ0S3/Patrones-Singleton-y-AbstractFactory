package AbstractFactoryEjemplo;

import AbstractFactoryEjemplo.Muebles.MesaDeNoche;
import AbstractFactoryEjemplo.Muebles.Silla;
import AbstractFactoryEjemplo.Muebles.Sofa;

public class MueblesModernosFactory implements MueblesFactory {

    public Silla crearSilla() {
        return new SillaModerna();
    }

    public Sofa crearSofa() {
        return new SofaModerno();
    }

    public MesaDeNoche crearMesaDeNoche() {
        return new MesaDeNocheModerna();
    }
}
