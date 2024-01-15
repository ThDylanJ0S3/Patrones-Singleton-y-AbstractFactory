package SingletonEjemplo;

public class Singleton {

    private static Singleton instance;
    private Conexion connection;

    private Singleton() {
        // Este es el constructor de la clase, se coloca la logica para el manejo
        // en la base de datos.
    }

    public static Singleton getInstance() {
        //Se verifica si la instancia existe o si es nula.
        if (instance == null) {
            //Si es nula, crea la instancia
            instance = new Singleton();
        }

        //Sino devuelve la instancia para evitar varias instancias del objeto
        return instance;
    }

    public Conexion getConnection() {
        return connection;
    }

    // Otros métodos relacionados con la base de datos.
}
