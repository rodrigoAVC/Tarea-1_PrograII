package tarea.pkg1_rodrigovasquez;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tarea1_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner godSpeed = new Scanner(System.in);
        int opcion = 1;
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        do {
            System.out.println("< B I E N V E N I D O S >");
            System.out.println("1. [ Agregar Vehiculo ]");
            System.out.println("2. [ Listar Vehiculos ]");
            System.out.println("3. [ Modificar Fecha de Creacion ]");
            System.out.println("4. [ Modificar Fecha de Venta ]");
            System.out.println("5. [ Eliminar Vehiculo ]");
            System.out.println("6. [ Salir ]");
            System.out.print("Ingrese la opcion a ejecutar: ");
            opcion = godSpeed.nextInt();
            godSpeed = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del vehiculo: ");
                    String marca = godSpeed.nextLine();
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese el modelo del vehiculo: ");
                    String modelo = godSpeed.nextLine();
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese el año cuando se fabrico el vehiculo: ");
                    int year = (godSpeed.nextInt()) - 1900;
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese el mes cuando se fabrico el vehiculo [1~12]: ");
                    int mes = (godSpeed.nextInt()) - 1;
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese el dia del mes cuando se fabrico el vehiculo [1~31]: ");
                    int dia = (godSpeed.nextInt());
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese la hora cuando se fabrico el vehiculo [0~23]: ");
                    int hora = (godSpeed.nextInt());
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese el minuto cuando se fabrico el vehiculo [0~59]: ");
                    int min = (godSpeed.nextInt());
                    godSpeed = new Scanner(System.in);
                    Date fechaCreacion = new Date(year, mes, dia, hora, min);
                    System.out.print("Ingrese el año cuando se vendio el vehiculo: ");
                    int year2 = (godSpeed.nextInt()) - 1900;
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese el mes cuando se vendio el vehiculo [1~12]: ");
                    int mes2 = (godSpeed.nextInt()) - 1;
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese el dia del mes cuando se vendio el vehiculo [1~31]: ");
                    int dia2 = (godSpeed.nextInt());
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese la hora cuando se vendio el vehiculo [0~23]: ");
                    int hora2 = (godSpeed.nextInt());
                    godSpeed = new Scanner(System.in);
                    System.out.print("Ingrese el minuto cuando se vendio el vehiculo [0~59]: ");
                    int min2 = (godSpeed.nextInt());
                    godSpeed = new Scanner(System.in);
                    Date fechaVenta = new Date(year2, mes2, dia2, hora2, min2);
                    System.out.print("Ingrese el color del vehiculo: ");
                    String color = godSpeed.nextLine();
                    godSpeed = new Scanner(System.in);
                    listaVehiculos.add(new Vehiculo(marca, modelo, fechaCreacion, fechaVenta, color));
                    break;
                case 2:
                    if (listaVehiculos.size() > 0) {
                        int numLista = 1;
                        for (Vehiculo vehiculo : listaVehiculos) {
                            System.out.println(numLista + ". " + vehiculo.toString());
                            numLista++;
                        }
                    } else {
                        System.out.println("No hay nada en la lista");
                    }
                    break;
                case 3:
                    if (listaVehiculos.size() > 0) {
                        int cont3 = 1;
                        for (Vehiculo vehiculo : listaVehiculos) {
                            System.out.println(cont3 + ". " + vehiculo.toString());
                            if (cont3 < listaVehiculos.size()) {
                                cont3++;
                            }
                        }
                        System.out.print("Eliga a que vehiculo desea modificarle la fecha de creacion: ");
                        int modificar = (godSpeed.nextInt())-1;
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese el año cuando se fabrico el vehiculo: ");
                        year = (godSpeed.nextInt()) - 1900;
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese el mes cuando se fabrico el vehiculo [1~12]: ");
                        mes = (godSpeed.nextInt()) - 1;
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese el dia del mes cuando se fabrico el vehiculo [1~31]: ");
                        dia = (godSpeed.nextInt());
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese la hora cuando se fabrico el vehiculo [0~23]: ");
                        hora = (godSpeed.nextInt());
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese el minuto cuando se fabrico el vehiculo [0~59]: ");
                        min = (godSpeed.nextInt());
                        godSpeed = new Scanner(System.in);
                        listaVehiculos.get(modificar).fechaCreacion.setYear(year);
                        listaVehiculos.get(modificar).fechaCreacion.setMonth(mes);
                        listaVehiculos.get(modificar).fechaCreacion.setHours(hora);
                        listaVehiculos.get(modificar).fechaCreacion.setMinutes(min);
                    } else {
                        System.out.println("No hay nada en la lista");
                    }
                    break;
                case 4:
                    if (listaVehiculos.size() > 0) {
                        int cont1 = 1;
                        for (Vehiculo vehiculo : listaVehiculos) {
                            System.out.println(cont1 + ". " + vehiculo.toString());
                            if (cont1 < listaVehiculos.size()) {
                                cont1++;
                            }
                        }
                        System.out.print("Eliga a que vehiculo desea modificarle la fecha de venta: ");
                        int modificar = (godSpeed.nextInt())-1;
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese el año cuando se vendio el vehiculo: ");
                        year = (godSpeed.nextInt()) - 1900;
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese el mes cuando se vendio el vehiculo [1~12]: ");
                        mes = (godSpeed.nextInt()) - 1;
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese el dia del mes cuando se vendio el vehiculo [1~31]: ");
                        dia = (godSpeed.nextInt());
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese la hora cuando se vendio el vehiculo [0~23]: ");
                        hora = (godSpeed.nextInt());
                        godSpeed = new Scanner(System.in);
                        System.out.print("Ingrese el minuto cuando se vendio el vehiculo [0~59]: ");
                        min = (godSpeed.nextInt());
                        godSpeed = new Scanner(System.in);
                        listaVehiculos.get(modificar).fechaVenta.setYear(year);
                        listaVehiculos.get(modificar).fechaVenta.setMonth(mes);
                        listaVehiculos.get(modificar).fechaVenta.setHours(hora);
                        listaVehiculos.get(modificar).fechaVenta.setMinutes(min);
                    } else {
                        System.out.println("No hay nada en la lista");
                    }
                    break;
                case 5:
                    if (listaVehiculos.size() > 0) {
                        int cont2 = 1;
                        for (Vehiculo vehiculo : listaVehiculos) {
                            System.out.println(cont2 + ". " + vehiculo.toString());
                            if (cont2 < listaVehiculos.size()) {
                                cont2++;
                            }
                        }
                        System.out.print("Eliga el elemento de la lista que desea eliminar: ");
                        int elim = (godSpeed.nextInt())-1;
                        godSpeed = new Scanner(System.in);
                        listaVehiculos.remove(elim);
                    } else {
                        System.out.println("No hay nada en la lista");
                    }
                    break;
                case 6:
                    System.out.println("¡Muy buen dia!");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 6 && opcion > 0 && opcion < 7);
    }

}
