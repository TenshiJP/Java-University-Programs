package principal;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\angel\\Documents\\Ingeniería en Sitemas de Información y Ciencias de la Computación\\Semestre IV\\Programación II\\Proyecto en Grupo\\Proyecto.txt";
        
        int opcionMenu;   //Variable para seleccionar una opcion en el menú principal.
        Scanner entrada = new Scanner (System.in);  //Objeto tipo Scanner para la lectura de datos desde teclado.
        do{
            System.out.println("\nMenu\n1. Ingresar Registro\n2. Eliminar registro\n"
                    + "3. Actualizar registro\n4. Consultar registros\n5. Salir");
            System.out.println("Ingrese la opcion: ");
            opcionMenu = validarInt();       //Ingreso de la opción desde teclado.
            switch (opcionMenu){            /*Código con las opciones del menu*/
                case 1:
                    System.out.println("\tIngreso de resgistros\nInscripción");
                    Estudiante estudiante = new Estudiante();
                    System.out.println("Ingrese nombres         : ");
                    estudiante.setNombre(entrada.nextLine());
                    System.out.println("Ingrese apellidos       : ");
                    estudiante.setApellido(entrada.nextLine());
                    System.out.println("Ingrese DPI             : ");
                    estudiante.setDpi(entrada.nextLine());
                    do{
                        System.out.println("Ingrese edad            : ");
                        estudiante.setEdad(validarInt()); 
                        if(estudiante.getEdad() < 18){
                            System.out.println("\tERROR: Ingreso una edad invalida");
                        }else{}
                    }while(estudiante.getEdad() < 18);
                   /* System.out.println("Ingrese centro Regional : ");
                    estudiante.setCentroRegional(entrada.nextLine());entrada.skip("\n");
                    int opcFacultad;//Variable para seleccionar una facultad.
                    boolean opcion = false;//Variable booleana para cerrar ciclo do while de Facultad
                    do{
                        System.out.println("\tNuestras Facultades");
                        System.out.println("|1| Ingenieria en Sistemas");
                        System.out.println("|2| Psicologia");
                        System.out.println("|3| Arquitectura");
                        System.out.println("|4| Humanidades");
                        System.out.println("Ingrese la opcion que desea:");
                        opcFacultad = validarInt();
                        switch(opcFacultad){
                            case 1:
                                System.out.println("\tFACULTAD DE INGENIERIA EN SISTEMAS ");
                                estudiante.setCentroRegional("Ingenieria en Sistemas");
                                System.out.println("Semestres: \n|1| Primer semestre\n|2| Segundo semestre\n|3| Tercer semestre\n|4| Cuarto semestre");
                                System.out.println("|5| Quinto semestre\n|6| Sexto Semestre\n|7| Septimo semestre\n|8| Octavo semestre\n|9| Noveno semestre\n|10| Decimo semestre");
                                
                                opcion = true;
                                break;
                            case 2:
                                System.out.println("\tFACULTAD DE PSICOLOGIA ");
                                estudiante.setCentroRegional("Psicologia");
                                System.out.println("Semestres: ");
                                opcion = true;
                                break;
                            case 3:
                                System.out.println("\tFACULTAD DE ARQUITECTURA");
                                estudiante.setCentroRegional("Arquictectura");
                                System.out.println("Semestres: ");
                                opcion = true;
                                break;
                            case 4:
                                System.out.println("\tFACULTAD DE HUMANIDADES ");
                                estudiante.setCentroRegional("Humanidades");
                                System.out.println("Semestres: ");
                                opcion = true;
                                break;
                            default:
                                System.out.println("\tERROR: No ingreso una opcion valida\n");
                        }
                    }while(opcion==false);*/
                    System.out.println("Ingrese salon:          : ");
                    
                    System.out.println(estudiante);
                    break;
                case 2:
                    System.out.println("\tEliminar resgistros");
                    break;
                case 3:
                    System.out.println("\tActualizar resgistros");
                    break;
                case 4:
                    System.out.println("\tConsultar resgistros");
                    break;
                case 5:         //Cierra el Programa
                    break;
                default:
                        System.out.println("\tERROR: Ingreso un valor incorrecto\n\tIngrese un valor de acuerdo a las opciones");
                } 
        }while(opcionMenu != 5);
    }
     
    public static int validarInt(){      /*Metodo para continuar por posibles valores inesperados en variables Int*/
        Scanner teclado = new Scanner(System.in); // Objeto para leer desde el teclado
         do{            /*Inicia ciclo*/
            if(teclado.hasNext()){     /*Condicional para verificar si la varible tiene un dato guardado.*/
                if(teclado.hasNextInt()){      /*Condicional para verificar si la varible tiene guadado un dato Int*/
                    return teclado.nextInt();   //Retorna el dato Int guardado
                }else{      /*Contrario segundo condicional*/
                    teclado.next();
                    System.out.println("\tERROR: No ingreso un entero.\n\tSolo se puede ingresar enteros."
                            + "\nIngrese la opcion de nuevo:");
                }
            }else{          /*Contrario primer condicional*/
                 return 0;
            }
        }while(true);   /*Fin del ciclo*/
    }
    
    public static double validarDouble(){
        Scanner teclado = new Scanner(System.in); // Objeto para leer desde el teclado
         do{            /*Inicia ciclo*/
            if(teclado.hasNext()){     /*Condicional para verificar si la varible tiene un dato guardado.*/
                if(teclado.hasNextDouble()){      /*Condicional para verificar si la varible tiene guadado un dato Int*/
                    return teclado.nextDouble();   //Retorna el dato Int guardado
                }else{      /*Contrario segundo condicional*/
                    teclado.next();
                    System.out.println("\tERROR: No ingreso un numero."
                            + "\nIngrese la opcion de nuevo:");
                }
            }else{          /*Contrario primer condicional*/
                return 0;
            }
        }while(true);   /*Fin del ciclo*/
    }
   
}

