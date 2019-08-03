package proyecto;

import java.util.LinkedList;


public class Arbol {

    Nodo raiz; //puntero de tipo Nodo, es donde va arrancar
     int numNodos;
     int alt;
    //Constructor
    public Arbol()
    {
    //se encarga de inicializar la raiz en null.
       raiz=null;
       numNodos=0;
       alt=0;
    }
  
     public void insertar(int dato) 
     {
        if(existe(dato)){
            int numero = 2+1;
            System.out.println("res "+numero);
            return;}//siempre que un metodo void tenga un return, termina con la ejecucion de este.
          
         Nodo nuevo=new Nodo();
          nuevo.dato = dato;
          nuevo.izq = null;
          nuevo.der = null;
          
          if (raiz == null)
              raiz = nuevo;
          else
          {
              Nodo anterior = null, reco;
              reco = raiz;
          
              while (reco != null)
              {
                  anterior = reco;
                  if (dato < reco.dato)
                      reco = reco.izq;
                  else
                      reco = reco.der;
              }
              if (dato < anterior.dato)
                  anterior.izq = nuevo;
              else
                  anterior.der = nuevo;
          }
          numNodos++;
          System.out.println(""+nuevo.getInfo());
          System.out.println(""+nuevo.getIzq());
          System.out.println(""+nuevo.getDer());
          
        }

     
     public Nodo getRaiz()
     {
     return raiz;
     }
     public void setRaiz(Nodo raiz)
     {
     this.raiz= raiz;
     }
     public int getnumNodos()
     {
     return numNodos;
     }
    //Metodo para saber cuando el arbol esta vacio
    /*public boolean Vacio()
    {
        return raiz== null;
    }
    */
     
    //Metodo para recorrer el Arbol INORDEN
    public void InOrden( Nodo aux,LinkedList recorrido )//r sera la raiz para no confundirnos
    {  
      if(aux!=null)
        {
        PreOrden(aux.getIzq(),recorrido);
        recorrido.add(aux.getInfo());
        PreOrden(aux.getDer(),recorrido);
        }
    }
     //Metodo para recorrer el Arbol PREORDEN
    public void PreOrden(Nodo aux,LinkedList recorrido)
    {
        if(aux!=null)
        {
        recorrido.add(aux.getInfo());
        PreOrden(aux.getIzq(),recorrido);
        PreOrden(aux.getDer(),recorrido);
        }
    }
     //Metodo para recorrer el Arbol POSTORDEN
     public void PostOrden(Nodo aux,LinkedList recorrido)
    {
        if(aux!=null)
        {
        PreOrden(aux.getIzq(),recorrido);
        PreOrden(aux.getDer(),recorrido);
        recorrido.add(aux.getInfo());
        }
    }
     
     public void Niveles(Nodo aux,LinkedList recorrido)
     {
         
     LinkedList <Nodo> cola= new LinkedList<>();
     cola.addLast(aux);
        while(cola.size()>0)
        {
            Nodo reco =cola.pollFirst();
            recorrido.add(reco.getInfo());
            
            if(reco.getIzq()!=null)
            {
                cola.addLast(reco.getIzq());
            }
        }
     }
     
     private boolean existe(int dato)
     {
     Nodo aux= raiz;
     while (aux!=null)
        {
          if(dato== aux.getInfo())
              aux=aux.getDer();
        
            else
        
             aux=aux.getIzq();
        }
     return false;
      }
     
     
     private void altura(Nodo aux,int nivel)
     {
     if(aux!=null)
     {
         altura(aux.getIzq(),nivel+1);
         alt=nivel;
         altura(aux.getDer(),nivel+1);
     }
     }
     public int getAltura()
     {
     altura(raiz,1);
     return alt;
     }
}   
  
    
    

 
 
 













