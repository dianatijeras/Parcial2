package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;

    public CuentaAhorros(int numeroCuenta, Titular titular, double tasaInteres) {
        super(numeroCuenta, titular);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void retirar(double monto){
        if (monto > 0){
            if (monto <= getSaldo()){
                //Realizar el retiro
                setSaldo(getSaldo() - monto);
                // si el saldo despues del retiro es cero, establecer el estado de la cuenta como inactiva
                if (getSaldo() == 0){
                    setEstado(false);
                }
                //Registrar la Transaccion
                getListaTransacciones().add(new Transaccion("RETIRO3", monto, LocalDate.now(),"Retiro", true));
            } else {
                System.out.println("Slado insuficiente para realizar el retiro");
            }
        } else {
            System.out.println("El monto a retirar debe ser mayor que cero");
        }
    }


}
