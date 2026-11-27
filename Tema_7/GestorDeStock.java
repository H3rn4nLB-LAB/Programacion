import java.util.Scanner;

public class GestorDeStock {
	
    private static String[] nombreProductos = new String[10];
    private static int[] stockProductos = new int[10];
    private static double[] precioProductos = new double[10];
    
    
    public static int AltaProducto() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int indiceNuevoProducto = -1;
    	
    	int i = 0;
    	
    	// Se busca la primera posición libre en el array (null)
    	while(i < nombreProductos.length && indiceNuevoProducto == -1) {
    		
    		if(nombreProductos[i] == null) {
    			indiceNuevoProducto = i;
    		}
    		
    		i++;
    	}
    	
    	// Sale un mensaje de error cuando el array está lleno
    	if(indiceNuevoProducto == -1) {
    		System.out.println("No se puede registrar. La lista está llena");
    		return indiceNuevoProducto;
    	}
    	
    	System.out.print("Ponga el nombre del producto: ");
        nombreProductos[indiceNuevoProducto] = scanner.nextLine();
        
        System.out.print("Ponga el stock del producto: ");
        stockProductos[indiceNuevoProducto] = scanner.nextInt();
        
        System.out.print("Ponga el precio del producto: ");
        precioProductos[indiceNuevoProducto] = scanner.nextDouble();
        
        System.out.println("Producto registrado correctamente");
        
        return indiceNuevoProducto;
    }
    
    public static int BuscarProducto() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int indiceProductoBuscado = -1;
    	
    	int i = 0;
    	
    	System.out.print("Introduce el producto que desea buscar: ");
    	String nombreBuscar = scanner.nextLine();
    	
    	// Comprobamos si es distinto de null para evitar errores
    	while(i < nombreProductos.length && indiceProductoBuscado == -1) {
    		
    		if(nombreProductos[i]!= null && nombreProductos[i].equals(nombreBuscar)) {
    			
    			indiceProductoBuscado = i;
    			
    		}
    		
    		i++;
    		
    	}
    	
    	if(indiceProductoBuscado == -1) {
    		System.out.println("El producto con el nombre "+nombreBuscar+" no se encuentra");
    		return indiceProductoBuscado;
    	}
    	
    	mostrarDatosProducto(indiceProductoBuscado);
    	
    	return indiceProductoBuscado;
    }
    
    public static void mostrarDatosProducto(int i) {
    	
    	System.out.println("Nombre: "+nombreProductos[i]);
    	System.out.println("Stock: "+stockProductos[i]);
    	System.out.println("Precio: "+precioProductos[i]);
    	
    }
    
    public static void ModificarDatosProducto() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	// Se reutiliza el método de búsqueda para pedir el nombre del producto y obtener su posición
    	int indice = BuscarProducto();
    	
    	
    	if(indice!=-1) {
    		
    		System.out.print("Introduce el nuevo stock: ");
    		stockProductos[indice] = scanner.nextInt();
    		
    		System.out.print("Introduce el nuevo precio: ");
    		precioProductos[indice] = scanner.nextDouble();
    		
    		System.out.println("Datos actualizados correctamente.");
    	}
    }
    		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("\n--- GESTOR DE STOCK ---");
			System.out.println("1. Dar de alta un producto nuevo");
			System.out.println("2. Buscar un producto por su nombre");
			System.out.println("3. Modificar stock y precio de un producto");
			System.out.println("4. Salir");
			System.out.print("Elige una opcion: ");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			
			    case 1:
			    	AltaProducto();
			    	break;
			    	
			    case 2:
			    	BuscarProducto();
			    	break;
			    	
			    case 3:
			    	ModificarDatosProducto();
			        break;
			        
			    case 4:
			    	System.out.println("Saliendo del programa...");
			    	break;
			    	
			    default:
			    	System.out.println("Opcion no valida");
			}		
			
		}while(opcion != 4);
	}
}
