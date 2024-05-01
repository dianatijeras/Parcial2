package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Banco {
    
    private final String nombre;
    private Collection<Titular> listaTitulares;
    private Collection<CuentaBancaria> cuentasBancarias;

    public Banco (String nombre){

        this.nombre= nombre;
        this.listaTitulares = new LinkedList<>();
        this.cuentasBancarias = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }

    public void setListaTitulares(Collection<Titular> listaTitulares) {
        this.listaTitulares = listaTitulares;
    }

    public Collection<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setListaCuentaBancarias(Collection<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public void agregarTitular(Titular titular){
        listaTitulares.add(titular);
    }

    public void crearCuentaCorriente(int numeroCuenta, Titular titular, double sobregiro){
        CuentaCorriente cuentaCorriente = new CuentaCorriente(numeroCuenta, titular, sobregiro);
        cuentasBancarias.add(cuentaCorriente);
    }

    public void crearCuentaAhorros(int numeroCuenta, Titular titular, double tasaInteres){
        CuentaAhorros cuentaAhorros = new CuentaAhorros(numeroCuenta, titular, tasaInteres);
        cuentasBancarias.add(cuentaAhorros);
    }


}
