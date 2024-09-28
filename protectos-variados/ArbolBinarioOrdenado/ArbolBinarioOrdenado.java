public class ArbolBinarioOrdenado {
	
	// TODO Auto-generated method stub
			class Nodo
		    {
		      int info;
		      Nodo izq, der;
		    }
		    Nodo raiz;
		    int cant;
		    int altura;
		    public ArbolBinarioOrdenado() {
		        raiz=null;
		    }
		    
		    public void insertar (int info)
		    {
		        Nodo nuevo;
		        nuevo = new Nodo ();
		        nuevo.info = info;
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
		                if (info < reco.info)
		                    reco = reco.izq;
		                else
		                    reco = reco.der;
		            }
		            if (info < anterior.info)
		                anterior.izq = nuevo;
		            else
		                anterior.der = nuevo;
		        }
		    }


		    private void imprimirPre (Nodo reco)
		    {
		        if (reco != null)
		        {
		            System.out.print(reco.info + " ");
		            imprimirPre (reco.izq);
		            imprimirPre (reco.der);
		        }
		    }

		    public void imprimirPre ()
		    {
		        imprimirPre (raiz);
		        System.out.println();
		    }

		    private void imprimirEntre (Nodo reco)
		    {
		        if (reco != null)
		        {    
		            imprimirEntre (reco.izq);
		            System.out.print(reco.info + " ");
		            imprimirEntre (reco.der);
		        }
		    }

		    public void imprimirEntre ()
		    {
		        imprimirEntre (raiz);
		        System.out.println();
		    }
		    private void cantidad(Nodo reco) {
		        if (reco!=null) {
		            cant++;
		            cantidad(reco.izq);
		            cantidad(reco.der);
		        }
		    }
		    
		    public int cantidad() {
		        cant=0;
		        cantidad(raiz);
		        return cant;
		    }

		    private void cantidadNodosHoja(Nodo reco) {
		        if (reco!=null) {
		            if (reco.izq==null && reco.der==null)
		                cant++;
		            cantidadNodosHoja(reco.izq);
		            cantidadNodosHoja(reco.der);
		        }
		    }
		    
		    public int cantidadNodosHoja() {
		        cant=0;
		        cantidadNodosHoja(raiz);
		        return cant;
		    }


		    private void imprimirPost (Nodo reco)
		    {
		        if (reco != null)
		        {
		            imprimirPost (reco.izq);
		            imprimirPost (reco.der);
		            System.out.print(reco.info + " ");
		        }
		    }


		    public void imprimirPost ()
		    {
		        imprimirPost (raiz);
		        System.out.println();
		    }
		    private void imprimirEntreConNivel (Nodo reco,int nivel)  {
		        if (reco != null) {    
		            imprimirEntreConNivel (reco.izq,nivel+1);
		            System.out.print(reco.info + " ("+nivel+") - ");
		            imprimirEntreConNivel (reco.der,nivel+1);
		        }
		    }

		    public void imprimirEntreConNivel () {
		        imprimirEntreConNivel (raiz,1);
		        System.out.println();
		    }
		    
		    private void retornarAltura (Nodo reco,int nivel)    {
		        if (reco != null) {    
		            retornarAltura (reco.izq,nivel+1);
		            if (nivel>altura)
		                altura=nivel;
		            retornarAltura (reco.der,nivel+1);
		        }
		    }
		    public void mayorValorl() {
		        if (raiz!=null) {
		            Nodo reco=raiz;
		            while (reco.der!=null)
		                reco=reco.der;
		            System.out.println("Mayor valor del Ã¡rbol:"+reco.info);
		        }
		    }
		    
		    public void borrarMenor() {
		        if (raiz!=null) {
		            if (raiz.izq==null)
		                raiz=raiz.der;
		            else {
		                Nodo atras=raiz;
		                Nodo reco=raiz.izq;
		                while (reco.izq!=null) {
		                    atras=reco;
		                    reco=reco.izq;
		                }
		                atras.izq=reco.der;
		            }                  
		        }
		    }
		    public  int retornarAltura () {
		        altura=0;
		        retornarAltura (raiz,1);
		        return altura;
		    }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArbolBinarioOrdenado abo = new ArbolBinarioOrdenado ();
		        abo.insertar (300);
		        abo.insertar (120);
		        abo.insertar (80);
		        abo.insertar (290);
		        abo.insertar (310);
		        abo.insertar (400);
		        abo.insertar (100);
		        System.out.println ("Impresion preorden: ");
		        abo.imprimirPre ();
		        System.out.println ("Impresion entreorden: ");
		        abo.imprimirEntre ();
		        System.out.println ("Impresion postorden: ");
		        abo.imprimirPost (); 
		        System.out.println ("Cantidad de nodos del Ã¡rbol:"+abo.cantidad());
		        System.out.println ("Cantidad de nodos hoja:"+abo.cantidadNodosHoja()); 
		        System.out.print ("Artura del arbol:");
		        System.out.println(abo.retornarAltura()); 
		        abo.mayorValorl();
		        abo.borrarMenor();
		        System.out.println("Luego de borrar el menor:");
		        abo.imprimirEntre ();
		       // abo.cantidadNodosHoja(raiz);
		    }      

			


		}
	