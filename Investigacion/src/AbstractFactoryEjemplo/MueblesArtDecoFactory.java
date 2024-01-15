package AbstractFactoryEjemplo;

import AbstractFactoryEjemplo.Muebles.MesaDeNoche;
import AbstractFactoryEjemplo.Muebles.Silla;
import AbstractFactoryEjemplo.Muebles.Sofa;

public class MueblesArtDecoFactory implements MueblesFactory {

    public Silla crearSilla() {
        return new SillaArtDeco();
    }

    public Sofa crearSofa() {
        return new SofaArtDeco();
    }

    public MesaDeNoche crearMesaDeNoche() {
        return new MesaDeNocheArtDeco();
    }
}
