package com.lo.edu.cuentas;

public class CuentaAhorros extends Cuenta{
	
	private int porcentajeDescuento;
	
	
	
	//metodos set y get
	public void aperturaCuenta(int saldo, int valorDeInteres) {
		if(saldo>=100) {
			System.out.println("Cuenta creada ");
			valorDeInteres = saldo*10/100;
			System.out.println("su valor de interes es de " +valorDeInteres);
			
			System.out.println("saldo actual: " +saldo);
		}else {
			System.out.println("valor minimo 100 para apertura de cuenta");
		}
	}

	public int getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(int porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	

	
	
}
