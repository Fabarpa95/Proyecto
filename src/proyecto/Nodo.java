
package proyecto;


public class Nodo
{       
    //Atributos
	public int dato;
	public Nodo izq;
	public Nodo der;

	public Nodo(int dato, Nodo izq, Nodo der) {
            this.dato=dato;
            this.izq=izq;
            this.der=der;
	}

    Nodo() {
       
    }

	public int getInfo() {
		return dato;
	}

	public void setInfo(int info) {
		this.dato = info;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}
	
	
}


