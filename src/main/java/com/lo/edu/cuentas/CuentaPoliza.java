package com.lo.edu.cuentas;

public class CuentaPoliza extends Cuenta{
	
	private String fechaVigencia;
	
	
	public void aperturaCuenta(int saldo, int valorDeInteres) {
		if(saldo>=100) {
			System.out.println("Cuenta creada ");
			valorDeInteres = saldo*15/100;
			System.out.println("su valor de interes es de " +valorDeInteres);
		}else {
			System.out.println("valor minimo 100 para apertura de cuenta");
		}
	}


	public String getFechaVigencia() {
		return fechaVigencia;
	}


	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	
}
