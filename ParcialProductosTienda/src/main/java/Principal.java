/*
    PROGRAMACIÓN II -SEGUNDO PARCIAL
    Nombre:     Angel Roberto Jacinto Payes
    Carnet:     5990-20-1756
    Sección:    "A"
 */
import java.util.*;
public class Principal {
    
    public static void main(String[] args) {
        int menu;//Variable para el menu.
        Scanner teclado = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<Producto>();              /*Colecion de objetos*/
        do{
            System.out.println("\n\t+---------------------------+");
            System.out.println("\t|    Tienda Bebop :  Menu    |\n\t+---------------------------+\n\t| 1 | |  Agregar  Producto  |\n\t| 2 | | Actualizar Producto |"
                    + "\n\t| 3 | |  Eliminar Producto  |\n\t| 4 | |  Listar  Productos  |\n\t| 5 | |        Salir        |");
            System.out.println("\t+---------------------------+");
            System.out.println("Ingrese la opcion: ");
            menu = validarInt();
            switch(menu){
                case 1:
                    int a;  //Variable para escoger el tipo de Producto a agregar
                    do{
                        System.out.println("\tAGREGAR");
                        System.out.println("\t|1|     Electrodomestico\n\t|2|     Muebles \n\t|3|     Ropa\n\t|4|     Viveres\n\t|5|     Volver al menu principal");
                        System.out.println("Ingrese la opcion:  ");
                        a = validarInt();
                        switch(a){
                            case 1:
                                System.out.println("\n\tELECTRODOMESTICOS");
                                ProductoElectrodomestico electro = new ProductoElectrodomestico();      //Instancia para objetos ProductoElectrodomestico.
                                System.out.println("Ingresar codigo del producto: ");
                                electro.setCodigo(teclado.nextLine());
                                System.out.println("Ingresar nombre del producto: ");
                                electro.setNombre(teclado.nextLine());
                                System.out.println("Ingresar precio del producto: ");
                                electro.setPrecio(validarDouble());
                                System.out.println("Ingresar descripcion del producto: ");
                                electro.setDescripcion(teclado.nextLine());
                                System.out.println("Ingresar ubicacion del producto: ");
                                electro.setUbicacion(teclado.nextLine());
                                System.out.println("Ingresar marca del producto: ");
                                electro.setMarca(teclado.nextLine());
                                System.out.println("Ingresar peso (kg) del producto: ");
                                electro.setPeso(validarDouble());
                                productos.add(electro);         //Agregar a la coleccion de objetos Producto.
                                //System.out.println(electro);
                                electro.imprimirInfo();
                                electro.fechaCaducacion();
                                electro.tipoGarantia();System.out.println("");
                                pausa();
                                break;
                                
                            case 2:
                                System.out.println("\n\tMUEBLES");
                                ProductoMuebles mueble = new ProductoMuebles();      //Instancia para objetos ProductoMuebles.
                                System.out.println("Ingresar codigo del mueble: ");
                                mueble.setCodigo(teclado.nextLine());
                                System.out.println("Ingresar nombre del mueble: ");
                                mueble.setNombre(teclado.nextLine());
                                System.out.println("Ingresar precio del mueble: ");
                                mueble.setPrecio(validarDouble());
                                System.out.println("Ingresar descripcion del mueble: ");
                                mueble.setDescripcion(teclado.nextLine());
                                System.out.println("Ingresar ubicacion del mueble: ");
                                mueble.setUbicacion(teclado.nextLine());
                                System.out.println("Ingresar material del mueble: ");
                                mueble.setMaterial(teclado.nextLine());
                                productos.add(mueble);         //Agregar a la coleccion de objetos Producto.
                                //System.out.println(mueble);
                                mueble.imprimirInfo();
                                mueble.fechaCaducacion();
                                mueble.tipoGarantia();System.out.println("");
                                pausa();
                                break;
                                
                            case 3:
                                System.out.println("\n\tROPA");
                                ProductoRopa ropa = new ProductoRopa();      //Instancia para objetos ProductoRopa.
                                System.out.println("Ingresar codigo de la prenda: ");
                                ropa.setCodigo(teclado.nextLine());
                                System.out.println("Ingresar nombre de la prenda: ");
                                ropa.setNombre(teclado.nextLine());
                                System.out.println("Ingresar precio de la prenda: ");
                                ropa.setPrecio(validarDouble());
                                System.out.println("Ingresar descripcion de la prenda: ");
                                ropa.setDescripcion(teclado.nextLine());
                                System.out.println("Ingresar ubicacion de la prenda: ");
                                ropa.setUbicacion(teclado.nextLine());
                                System.out.println("Ingresar color de la prenda: ");
                                ropa.setColor(teclado.nextLine());
                                System.out.println("Ingresar marca de la prenda: ");
                                ropa.setMarca(teclado.nextLine());
                                productos.add(ropa);         //Agregar a la coleccion de objetos Producto.
                                //System.out.println(ropa);
                                ropa.imprimirInfo();
                                ropa.fechaCaducacion();
                                ropa.tipoGarantia();System.out.println("");
                                pausa();
                                break;
                                
                            case 4:
                                System.out.println("\nVIVERES");
                                ProductoViveres viveres = new ProductoViveres();      //Instancia para objetos ProductoViveres.
                                System.out.println("Ingresar codigo del producto: ");
                                viveres.setCodigo(teclado.nextLine());
                                System.out.println("Ingresar nombre del producto: ");
                                viveres.setNombre(teclado.nextLine());
                                System.out.println("Ingresar precio del producto: ");
                                viveres.setPrecio(validarDouble());
                                System.out.println("Ingresar descripcion del producto: ");
                                viveres.setDescripcion(teclado.nextLine());
                                System.out.println("Ingresar ubicacion del producto: ");
                                viveres.setUbicacion(teclado.nextLine());
                                System.out.println("Ingresar clasificacion alimenticia del producto: ");
                                viveres.setClasificacion(teclado.nextLine());
                                productos.add(viveres);         //Agregar a la coleccion de objetos Producto.   
                                //System.out.println(viveres);
                                viveres.imprimirInfo();
                                viveres.fechaCaducacion();
                                viveres.tipoGarantia();System.out.println("");
                                pausa();
                                break;
                                
                            case 5:         //Volver al Menu Principal
                                break;
                            default:
                                System.out.println("\tERROR: Ingreso un valor incorrecto\n\tIngrese un valor de acuerdo con las opciones");
                        }
                    }while(a!=5);
                    
                    break;
                    
                case 2: 
                    int b;  //Variable para escoger el tipo de Producto a actualizar
                    String nombre;     //Los objetos guardados se buscaran, por el codigo.
                    boolean encontrar=false;
                    do{
                        System.out.println("\n\tACTUALIZAR");
                        System.out.println("\t|1|     Electrodomesticos\n\t|2|     Muebles \n\t|3|     Ropa\n\t|4|     Viveres\n\t|5|     Volver al menu principal");
                        System.out.println("Ingrese la opcion:  ");
                        b=validarInt();
                        switch(b){
                            case 1:
                                System.out.println("\n\tACTUALIZAR ELECTRODOMESTICO");
                                System.out.println("Buscar Producto\n Ingrese el nombre del producto para actualizar: ");
                                nombre = teclado.nextLine();
                                /*Inicio || Codigo para buscar el objeto ingreado*/
                                for(int j=0; j<productos.size();j++){           /*Ciclo para recorrer toda la coleccion objeto por objeto*/
                                    Producto actualizar = productos.get(j);     //Posicion     
                                    if(actualizar.getNombre().equals(nombre)){    /*Condicional para comparar dato ingresado en los objetos de la coleccion*/
                                        System.out.println("\tProducto encontrado\n"+ productos.get(j) +"\nIngrese nuevos valores:");
                                        ProductoElectrodomestico electro1 = new ProductoElectrodomestico();
                                        System.out.println("Ingresar nuevo codigo del producto: ");
                                        electro1.setCodigo(teclado.nextLine());
                                        System.out.println("Ingresar nuevo nombre del producto: ");
                                        electro1.setNombre(teclado.nextLine());
                                        System.out.println("Ingresar nuevo precio del producto: ");
                                        electro1.setPrecio(validarDouble());
                                        System.out.println("Ingresar nueva descripcion del producto: ");
                                        electro1.setDescripcion(teclado.nextLine());
                                        System.out.println("Ingresar nueva ubicacion del producto: ");
                                        electro1.setUbicacion(teclado.nextLine());
                                        System.out.println("Ingresar nueva marca del producto: ");
                                        electro1.setMarca(teclado.nextLine());
                                        System.out.println("Ingresar nuevo peso (kg) del producto: ");
                                        electro1.setPeso(validarDouble());
                                        productos.set(j,electro1);
                                        System.out.println("\tProducto actualizado.");
                                        productos.get(j).imprimirInfo();System.out.println("");pausa();
                                        encontrar = true;
                                    }else{}
                                }
                                /*Fin*/
                                if(!encontrar){        /*Condicional si no se encuentra el objeto*/
                                    System.out.println("\tProducto: "+nombre + " no econtrado.");
                                }else{}
                                break;
                                
                            case 2:
                                System.out.println("\n\tACTUALIZAR MUEBLE");
                                System.out.println("Buscar Producto\n Ingrese el nombre del producto para actualizar: ");
                                nombre = teclado.nextLine();
                                /*Inicio || Codigo para buscar el objeto ingreado*/
                                for(int j=0; j<productos.size();j++){           /*Ciclo para recorrer toda la coleccion objeto por objeto*/
                                    Producto actualizar = productos.get(j);     //Posicion     
                                    if(actualizar.getNombre().equals(nombre)){    /*Condicional para comparar dato ingresado en los objetos de la coleccion*/
                                        System.out.println("\tProducto encontrado\n"+ productos.get(j) +"\nIngrese nuevos valores:");
                                        ProductoMuebles mueble1 = new ProductoMuebles();
                                        System.out.println("Ingresar nuevo codigo del mueble: ");
                                        mueble1.setCodigo(teclado.nextLine());
                                        System.out.println("Ingresar nuevo nombre del mueble: ");
                                        mueble1.setNombre(teclado.nextLine());
                                        System.out.println("Ingresar nuevo precio del mueble: ");
                                        mueble1.setPrecio(validarDouble());
                                        System.out.println("Ingresar nueva descripcion del mueble: ");
                                        mueble1.setDescripcion(teclado.nextLine());
                                        System.out.println("Ingresar nueva ubicacion del mueble: ");
                                        mueble1.setUbicacion(teclado.nextLine());
                                        System.out.println("Ingresar nuevo material del mueble: ");
                                        mueble1.setMaterial(teclado.nextLine());
                                        productos.set(j,mueble1);
                                        System.out.println("\tProducto actualizado.");
                                        productos.get(j).imprimirInfo();System.out.println("");pausa();
                                        encontrar = true;
                                    }else{}
                                }
                                /*Fin*/
                                if(!encontrar){        /*Condicional si no se encuentra el objeto*/
                                    System.out.println("\tProducto: "+nombre + " no econtrado.");
                                }else{}
                                break;
                                
                            case 3:
                                System.out.println("\n\tACTUALIZAR PRENDA");
                                System.out.println("Buscar Producto\n Ingrese el nombre del producto para actualizar: ");
                                nombre = teclado.nextLine();
                                /*Inicio || Codigo para buscar el objeto ingreado*/
                                for(int j=0; j<productos.size();j++){           /*Ciclo para recorrer toda la coleccion objeto por objeto*/
                                    Producto actualizar = productos.get(j);     //Posicion     
                                    if(actualizar.getNombre().equals(nombre)){    /*Condicional para comparar dato ingresado en los objetos de la coleccion*/
                                        System.out.println("\tProducto encontrado\n"+ productos.get(j) +"\nIngrese nuevos valores:");
                                        ProductoRopa ropa1 = new ProductoRopa();
                                        System.out.println("Ingresar nuevo codigo de la prenda: ");
                                        ropa1.setCodigo(teclado.nextLine());
                                        System.out.println("Ingresar nuevo nombre de la prenda: ");
                                        ropa1.setNombre(teclado.nextLine());
                                        System.out.println("Ingresar nuevo precio de la prenda: ");
                                        ropa1.setPrecio(validarDouble());
                                        System.out.println("Ingresar nueva descripcion de la prenda: ");
                                        ropa1.setDescripcion(teclado.nextLine());
                                        System.out.println("Ingresar nueva ubicacion de la prenda: ");
                                        ropa1.setUbicacion(teclado.nextLine());
                                        System.out.println("Ingresar nuevo color de la prenda: ");
                                        ropa1.setColor(teclado.nextLine());
                                        System.out.println("Ingresar nueva marca de la prenda: ");
                                        ropa1.setMarca(teclado.nextLine());
                                        productos.set(j,ropa1);
                                        System.out.println("\tProducto actualizado.");
                                        productos.get(j).imprimirInfo();System.out.println("");pausa();
                                        encontrar = true;
                                    }else{}
                                }
                                /*Fin*/
                                if(!encontrar){        /*Condicional si no se encuentra el objeto*/
                                    System.out.println("\tProducto: "+nombre + " no econtrado.");
                                }else{}
                                break;
                                
                            case 4:
                                System.out.println("\n\tACTUALIZAR ALIMENTO");
                                System.out.println("Buscar Producto\n Ingrese el nombre del producto para actualizar: ");
                                nombre = teclado.nextLine();
                                /*Inicio || Codigo para buscar el objeto ingreado*/
                                for(int j=0; j<productos.size();j++){           /*Ciclo para recorrer toda la coleccion objeto por objeto*/
                                    Producto actualizar = productos.get(j);     //Posicion     
                                    if(actualizar.getNombre().equals(nombre)){    /*Condicional para comparar dato ingresado en los objetos de la coleccion*/
                                        System.out.println("\tProducto encontrado\n"+ productos.get(j) +"\nIngrese nuevos valores:");
                                        ProductoViveres viveres1 = new ProductoViveres();
                                        System.out.println("Ingresar nuevo codigo del producto: ");
                                        viveres1.setCodigo(teclado.nextLine());
                                        System.out.println("Ingresar nuevo nombre del producto: ");
                                        viveres1.setNombre(teclado.nextLine());
                                        System.out.println("Ingresar nuevo precio del producto: ");
                                        viveres1.setPrecio(validarDouble());
                                        System.out.println("Ingresar nueva descripcion del producto: ");
                                        viveres1.setDescripcion(teclado.nextLine());
                                        System.out.println("Ingresar nueva ubicacion del producto: ");
                                        viveres1.setUbicacion(teclado.nextLine());
                                        System.out.println("Ingresar nueva clasificacion alimenticia del producto: ");
                                        viveres1.setClasificacion(teclado.nextLine());
                                        productos.set(j,viveres1);
                                        System.out.println("\tProducto actualizado.");
                                        productos.get(j).imprimirInfo();System.out.println("");pausa();
                                        encontrar = true;
                                    }else{}
                                }
                                /*Fin*/
                                if(!encontrar){        /*Condicional si no se encuentra el objeto*/
                                    System.out.println("\tProducto: "+nombre + " no econtrado.");
                                }else{}
                                break;
                                
                            case 5:     //Salir al mnú principañ.
                                break;
                            default:
                                System.out.println("\tERROR: Ingreso un valor incorrecto\n\tIngrese un valor de acuerdo con las opciones");
                        }
                    }while(b!=5);

                    break;
                    
                case 3:
                    System.out.println("\tELIMINAR");
                    String nombreProducto;     //El dato ingresado se buscará por el nombre. 
                    boolean encontrado=false;
                    System.out.println("Buscar Producto\n Ingrese el nombre del producto a eliminar: ");
                    nombreProducto = teclado.nextLine();
                    /*Inicio || Codigo para buscar el objeto ingreado*/
                    for(int j=0; j<productos.size();j++){     /*Ciclo para recorrer toda la coleccion objeto por objeto*/
                        Producto eliminar = productos.get(j);           //Posicion
                        if(eliminar.getNombre().equals(nombreProducto)){    /*Condicional para comparar dato ingresado en los objetos de la coleccion*/
                            System.out.println("\tProducto econtrado.");
                            productos.get(j).imprimirInfo();System.out.println("");
                            pausa();
                            productos.remove(j);        //Elimina objeto
                            System.out.println("\tProducto eliminado.");
                            encontrado = true;
                        }else{}
                    }
                    /*Fin*/
                    if(!encontrado){        /*Condicional si no se encuentra el objeto*/
                        System.out.println("\tProducto: "+nombreProducto + " no econtrado.");
                    }else{}
                    pausa();
                    break;
                    
                case 4:
                    System.out.println("\tLISTAR");
                    for(Producto productosLista: productos){         /*Codigo para imprimir*/
                        //System.out.println(productosLista);
                        productosLista.imprimirInfo();
                    }
                    System.out.println("");
                    pausa();pausa();
                    break;
                    
                case 5:                 // Opcion para salir del programa.
                    break;
                default:
                    System.out.println("\tERROR: Ingreso un valor incorrecto\n\tIngrese un valor de acuerdo a las opciones\n");
            }
        }while(menu != 5);
    }
    
    public static int validarInt(){      /*Metodo para continuar por posibles valores inesperados en variables Int*/
        Scanner teclado = new Scanner(System.in); // Objeto para leer desde el teclado
         do{            /*Inicia ciclo*/
             if(teclado.hasNext()){     /*Condicional para verificar si la varible tiene un dato guardado.*/
                 if(teclado.hasNextInt()){      /*Condicional para verificar si la varible tiene guadado un dato Int*/
                    return teclado.nextInt();   //Retorna el dato Int guardado
                }
                 else{      /*Contrario segundo condicional*/
                    teclado.next();
                    System.out.println("\tERROR: No ingreso un entero.\n\tSolo se puede ingresar enteros."
                            + "\nIngrese de nuevo:");
                }
             }
             else{          /*Contrario primer condicional*/
                 return 0;
             }
        }while(true);   /*Fin del ciclo*/
    }
    
    public static double validarDouble(){      /*Metodo para continuar por posibles valores inesperados en variables double*/
        Scanner teclado = new Scanner(System.in); // Objeto para leer desde el teclado
         do{            /*Inicia ciclo*/
             if(teclado.hasNext()){     /*Condicional para verificar si la varible tiene un dato guardado.*/
                 if(teclado.hasNextDouble()){      /*Condicional para verificar si la varible tiene guadado un dato double*/
                    return teclado.nextDouble();   //Retorna el dato Int guardado
                }
                 else{      /*Contrario segundo condicional*/
                    teclado.next();
                    System.out.println("\tERROR: No ingreso un dato correcto.\n\tSolo se puede ingresar numeros."
                            + "\nIngrese de nuevo:");
                }
             }
             else{          /*Contrario primer condicional*/
                 return 0;
             }
        }while(true);   /*Fin del ciclo*/
    }
    
    public static void pausa(){
        try{
            Thread.sleep(1000);
         }catch(InterruptedException e ) {
            System.out.println("Pausa interrumpida.");
        }
    }
    
}
