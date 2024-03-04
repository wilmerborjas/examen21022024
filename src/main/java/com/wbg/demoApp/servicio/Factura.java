package com.wbg.demoApp.servicio;

import com.wbg.demoApp.dto.Persona;
import com.wbg.demoApp.dto.Producto;

public class Factura {

	public double getFactura(Producto producto, Persona persona) {
		System.out.println("el nombre del producto  = " + producto.getNombre());
		System.out.println("el tipo del producto  = " + producto.getTipo());
		System.out.println("cantidad = " + producto.getCantidadProducto());
		System.out.println("valor compra = " + producto.getValorCompra());
		System.out.println("valor venta = " + producto.getValorVenta());
		System.out.println("el nombre de la persona  = " + persona.getNombre());
		System.out.println("apellido = " + persona.getApellido());
		System.out.println("domicilio = " + persona.getDireccion());
		double valorPagar = producto.getValorVenta() * producto.getCantidadProducto();
		System.out.println("valora pagar = " + valorPagar);

		if (persona.getNombre().equals("Robin") & persona.getApellido().equals("Arellano")) {
			double descuento = valorPagar * 0.20;
			valorPagar = valorPagar - descuento;
			System.out.println("valor pagar con descuento Robin = " + valorPagar);
		}

		if (producto.getNombre().equals("Iphone") || persona.getNombre().equals("wilmer")) {
			double Descuento = valorPagar * 0.10;
			valorPagar = valorPagar - Descuento;
			System.out.println("valor pagar con descuento wilmer = " + valorPagar);

		}

		return valorPagar;

	}

}
