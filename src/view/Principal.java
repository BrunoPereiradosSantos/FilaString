package view;

import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		boolean vazia = f.isEmpty();
		System.out.println(vazia);
		
		
		f.insert("a");
		f.insert("b");
		f.insert("c");
		
		System.out.println(f.toString());
		
		
		try {
			String valor = f.get(2);
			System.out.println("Dado da posição 2: "+valor);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		vazia = f.isEmpty();
		System.out.println("Vazia: "+vazia);
		
		int tamanho = f.size();
		System.out.println("Tamanho da fila: "+tamanho);
		
		try {
			f.list();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			String removido = f.remove();
			removido = f.remove();
			f.list();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

