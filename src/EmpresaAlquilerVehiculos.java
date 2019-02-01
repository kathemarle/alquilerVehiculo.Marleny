/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    //metodos registra un cliente nuevo
    //este metodo almacena un objeto de la clase cliente en la ultima posicion
    //util de array clientes, que es dada por la variable totalClientes
    
    public void registrarClientes(Cliente nuevo){
    
        this.clientes[this.totalClientes]= nuevo;
        this.totalClientes++;//incrementa la variable totalCLientes
    }
    public void registrarVehiculo(Vehiculo nuevo){
        //este metodo almacena un objeto de la clase Vehivulo en la ultima
        //posicion del array vehiculos
        //dada por la variable totalvehivulos 
        this.vehiculo[this.totalVehiculos]= nuevo;
        this.totalVehiculos++;//incrementa la variable totalVehiculo
    }
    public void imprimirClientes(){
        //muestra la relacion de clientes de la empresa
        //recorre el array clientes y muestra datos de cada cliente
        System.out.println("NIF cliente/nombre/n");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes[i].toString());//get
            
        }
    }
   
    }


