
import java.time.LocalDate;

/**
 *
 * @author marleny
 */
public class EmpresaAlquilerVehiculos {

    //atributos de la empresa
    private String cif;
    private String nombre;
    private String paginaWeb;

    //Atributos para controlar el total de clientes que tiene la
    //empresa y array de almacenamiento para los objetos Cliente
    private int totalClientes;
    private Cliente[] clientes;

    //atributos para controlar el total de vehiculos disponibles en alquiler 
    //que tiene la empresa y array de almacenamiento para los objetos vehiculos
    private int totalVehiculos;
    private Vehiculo[] vehiculo;

    //atributos para controlar el historico de alquileres: total de alquileres 
    //realizados y array de almacenamiento para los objetos
    private int totalAlquileres;
    private Alquilado[] alquileres;

    //se omiten get y set 
    //constructor parametrizado:total de clientes=50, y tambien
    //el total de vehiculos disponibles.el histórico de vehiculos
    //puede contener hasta 100elementos.
    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb, int totalClientes, Cliente[] clientes, int totalVehiculos, Vehiculo[] vehiculo, int totalAlquileres, Alquilado[] alquileres) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = totalClientes;
        this.clientes = clientes;
        this.totalVehiculos = totalVehiculos;
        this.vehiculo = vehiculo;
        this.totalAlquileres = totalAlquileres;
        this.alquileres = alquileres;
    }

    public String getCif() {

        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public Alquilado[] getAlquileres() {
        return alquileres;
    }

    //metodos registra un cliente nuevo
    //este metodo almacena un objeto de la clase cliente en la ultima posicion
    //util de array clientes, que es dada por la variable totalClientes
    public void setAlquileres(Alquilado[] alquileres) {
        this.alquileres = alquileres;
    }

    public void registrarClientes(Cliente nuevo) {
        this.clientes[this.totalClientes] = nuevo;
        this.totalClientes++;//incrementa la variable totalCLientes
    }

    public void registrarVehiculo(Vehiculo nuevo) {
        //este metodo almacena un objeto de la clase Vehivulo en la ultima
        //posicion del array vehiculos
        //dada por la variable totalvehivulos 
        this.vehiculo[this.totalVehiculos] = nuevo;
        this.totalVehiculos++;//incrementa la variable totalVehiculo
    }

    public void imprimirClientes() {
        //muestra la relacion de clientes de la empresa
        //recorre el array clientes y muestra datos de cada cliente
        System.out.println("\n NIF cliente\t nombre");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes[i].toString());//get

        }
    }

    public void imprimirVehiculos() {

        System.out.println("matricula\tmodelo\tcolor\timporte\tdisponible\n");
        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculo[i].toString());

        }
    }
    //Modificala disponibilidad del vehículo

    private Cliente getCliente(String nif) {
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.clientes[i].getNif().equals(nif)) {
                return this.clientes[i];
            }

        }
        return null;
    }

    private Vehiculo getVehiculo(String matricula) {
        for (int i = 0; i < this.getTotalVehiculos(); i++) {
            if (this.vehiculo[i].getMatricula().equals(matricula)) {
                return this.vehiculo[i];
            }
        }
        return null;

    }

    public LocalDate diaHoy() {
        //LocalDate hoy = LocalDate.now().getDayOfMonth();
        LocalDate hoy = LocalDate.now();
        hoy.getDayOfMonth();
        return hoy;
    }

    public LocalDate mesHoy() {
        LocalDate mes = LocalDate.now();
        mes.getMonth();
        return mes;
    }

    public LocalDate anioHoy() {
       LocalDate anio = LocalDate.now();
       anio.getYear();

        return anio;
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
// busca el cliente con el NIF dado en el array
// clientes y el vehículo con la matrícula dada en el
// array vehiculos, si el vehículo está disponible se
// alquila con la fecha actual, que se obtiene
// ejecutando los métodos diaHoy(), mesHoy() y
// añoHoy(), cuya declaración no se incluye
        if (vehiculo.getDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres[this.totalAlquileres]
                    = new Alquilado(cliente, vehiculo,
                            diaHoy(), mesHoy(), anioHoy(), dias);
            this.totalAlquileres++;
        }
    }
    
    public void recibirVehiculo(String matricula) {
// busca el vehículo con la matrícula dada en el
// array vehiculos y modifica su disponibilidad
// para que se pueda alquilar de nuevo
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }

    }

}
