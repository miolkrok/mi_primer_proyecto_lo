package com.lo.edu.cuentas;

public class CuentaCorriente extends Cuenta{
	
	private String montoMinimo;
	
	
	public void aperturaCuenta(int saldo, int valorDeInteres) {
		if(saldo>=100) {
			System.out.println("Cuenta creada ");
			valorDeInteres = saldo*8/100;
			System.out.println("su valor de interes es de " +valorDeInteres);
		}else {
			System.out.println("valor minimo 100 para apertura de cuenta");
		}
	}


	public String getMontoMinimo() {
		return montoMinimo;
	}


	public void setMontoMinimo(String montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

	
	
	

}
