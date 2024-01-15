package AbstractFactoryEjemplo;

import AbstractFactoryEjemplo.Muebles.MesaDeNoche;
import AbstractFactoryEjemplo.Muebles.Silla;
import AbstractFactoryEjemplo.Muebles.Sofa;

public class Cliente {

    public static void main(String[] args) {
        
        MueblesFactory factory = new MueblesModernosFactory();

        Silla silla = factory.crearSilla();
        Sofa sofa = factory.crearSofa();
        MesaDeNoche mesaDeNoche = factory.crearMesaDeNoche();

        silla.sentarse();
        sofa.sentarse();
        mesaDeNoche.sentarse();

    }
}
