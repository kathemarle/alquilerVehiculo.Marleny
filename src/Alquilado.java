
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marleny
 */
public class Alquilado {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate diaAlquiler;
    private LocalDate mesAlquiler;
    private LocalDate anioAlquiler;
    private int totalDiasAlquiler;

    public Alquilado(Cliente cliente, Vehiculo vehiculo, LocalDate diaAlquiler, LocalDate mesAlquiler, LocalDate anioAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.anioAlquiler = anioAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(LocalDate diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public LocalDate getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(LocalDate mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public LocalDate getAñoAlquiler() {
        return anioAlquiler;
    }

    public void setAñoAlquiler(LocalDate añoAlquiler) {
        this.anioAlquiler = añoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    @Override
    public String toString() {
        return "Alquilado{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", diaAlquiler=" + diaAlquiler + ", mesAlquiler=" + mesAlquiler + ", a\u00f1oAlquiler=" + anioAlquiler + ", totalDiasAlquiler=" + totalDiasAlquiler + '}';
    }
}
   
   