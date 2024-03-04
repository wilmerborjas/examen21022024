package com.wbg.demoApp;

import com.wbg.demoApp.dto.Persona;
import com.wbg.demoApp.dto.Producto;
import com.wbg.demoApp.servicio.Factura;

public class ExamenApp {
	public static void main(String[] args) {

		Producto producto = new Producto();
		producto.setNombre("Iphone");
		producto.setTipo("movil");
		producto.setCantidadProducto(2);
		producto.setValorCompra(25.50);
		producto.setValorVenta(60);

		Persona persona = new Persona();
		persona.setNombre("Wilmer");
		persona.setApellido("Arellano");
		persona.setDireccion("calle humera 20 piso 1D");

		Factura factura = new Factura();

		double valorPagar = factura.getFactura(producto, persona);

		double valorPagado = 200;

		if (valorPagado > valorPagar) {
			double cambio = valorPagado - valorPagar;
			System.out.println("el cambio es = " + cambio);

		} else {
			double saldoPendiente = valorPagado - valorPagar;
			System.out.println("saldo pendiente  = " + saldoPendiente);

	 
		}

	}

}
