package parcial.examenfinal;

import java.io.IOException;
import java.util.Scanner;

public class ExamenFinal {

    public static void main(String[] args) throws IOException {
        // Inicialización de archivos
        AdminFichero ct = new AdminFichero("./cuentas.txt", true);
        ct.CrearArchivo();
        AdminFichero empleados = new AdminFichero("./empleados.txt", true);
        empleados.CrearArchivo();
        AdminFichero indp = new AdminFichero("./independientes.txt", true);
        indp.CrearArchivo();
        AdminFichero meno = new AdminFichero("./menores.txt", true);
        meno.CrearArchivo();

        Scanner scn = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Qué acción desea realizar");
            System.out.println("1. Abrir cuenta de ahorro");
            System.out.println("2. Solicitar crédito");
            System.out.println("3. Salir");
            int opc = scn.nextInt();
            scn.nextLine(); // Limpiar el buffer

            switch (opc) {
                case 1:
                    System.out.println("Qué tipo de persona es?");
                    System.out.println("1. Independiente");
                    System.out.println("2. Empleado");
                    System.out.println("3. Menor de Edad");
                    int opc2 = scn.nextInt();
                    scn.nextLine(); // Limpiar el buffer

                    switch (opc2) {
                        case 1:
                            // Crear cuenta para independiente
                            System.out.println("Ingresa tu nombre:");
                            String name = scn.nextLine();
                            System.out.println("Ingresa tu apellido:");
                            String lastname = scn.nextLine();
                            System.out.println("Ingresa tu edad:");
                            int age = scn.nextInt();
                            scn.nextLine(); // Limpiar el buffer
                            System.out.println("Ingrese su identificación:");
                            String id = scn.nextLine();
                            System.out.println("Ingrese monto inicial:");
                            double montoInicial = scn.nextDouble();
                            scn.nextLine(); // Limpiar el buffer
                            
                            Independiente independiente = new Independiente(name, lastname, age, id);
                            independiente.abrirCuentaAhorro(montoInicial);

                            String lineaInd = name + ";" + lastname + ";" + age + ";" + id + ";" + montoInicial;
                            indp.getPrintWriter().println(lineaInd);
                            indp.getPrintWriter().flush();
                            System.out.println("Cuenta creada para independiente.");
                            break;

                        case 2:
                            // Crear cuenta para empleado
                            System.out.println("Ingresa tu nombre:");
                            String empName = scn.nextLine();
                            System.out.println("Ingresa tu apellido:");
                            String empLastname = scn.nextLine();
                            System.out.println("Ingresa tu edad:");
                            int empAge = scn.nextInt();
                            scn.nextLine(); // Limpiar el buffer
                            System.out.println("Ingrese su identificación:");
                            String empId = scn.nextLine();
                            System.out.println("Ingrese su código de la empresa:");
                            int code = scn.nextInt();
                            scn.nextLine(); // Limpiar el buffer
                            System.out.println("Ingrese monto inicial:");
                            double empMontoInicial = scn.nextDouble();
                            scn.nextLine(); // Limpiar el buffer

                            Empleado empleado = new Empleado(empName, empLastname, empAge, empId);
                            empleado.abrirCuentaAhorro(empMontoInicial);

                            String lineaEmp = empName + ";" + empLastname + ";" + empAge + ";" + empId + ";" + code + ";" + empMontoInicial;
                            empleados.getPrintWriter().println(lineaEmp);
                            empleados.getPrintWriter().flush();
                            System.out.println("Cuenta creada para empleado.");
                            break;

                        case 3:
                            // Crear cuenta para menor de edad (requiere acudiente)
                            System.out.println("Ingresa el nombre del menor:");
                            String minorName = scn.nextLine();
                            System.out.println("Ingresa el apellido del menor:");
                            String minorLastname = scn.nextLine();
                            System.out.println("Ingresa la edad del menor:");
                            int minorAge = scn.nextInt();
                            scn.nextLine(); // Limpiar el buffer
                            System.out.println("Ingrese la identificación del menor:");
                            String minorId = scn.nextLine();
                            System.out.println("Ingrese el nombre del acudiente:");
                            String guardianName = scn.nextLine();
                            System.out.println("Ingrese el apellido del acudiente:");
                            String guardianLastname = scn.nextLine();
                            System.out.println("Ingrese la identificación del acudiente:");
                            String guardianId = scn.nextLine();
                            System.out.println("Ingrese monto inicial:");
                            double minorMontoInicial = scn.nextDouble();
                            scn.nextLine(); // Limpiar el buffer

                            // Crear acudiente
                            Usuario acudiente = new Usuario(guardianName, guardianLastname, 0, guardianId) {
                                @Override
                                public void abrirCuentaAhorro(double montoInicial) {
                                    // No se permite abrir cuenta de ahorro para el acudiente
                                    throw new UnsupportedOperationException("Los acudientes no pueden abrir cuenta de ahorro.");
                                }

                                @Override
                                public void solicitarCredito(double monto, int plazo, Usuario codeudor) {
                                    // No se permite solicitar crédito para el acudiente
                                    throw new UnsupportedOperationException("Los acudientes no pueden solicitar crédito.");
                                }
                            };

                            MenorEdad menor = new MenorEdad(minorName, minorLastname, minorAge, minorId, acudiente);
                            menor.abrirCuentaAhorro(minorMontoInicial);

                            String lineaMenor = minorName + ";" + minorLastname + ";" + minorAge + ";" + minorId + ";" + guardianId + ";" + minorMontoInicial;
                            meno.getPrintWriter().println(lineaMenor);
                            meno.getPrintWriter().flush();
                            System.out.println("Cuenta creada para menor de edad.");
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;

                case 2:
                    // Lógica para solicitar crédito
                    System.out.println("Funcionalidad de solicitud de crédito no implementada.");
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        // Cerrar recursos
        scn.close();
        ct.getPrintWriter().close();
        empleados.getPrintWriter().close();
        indp.getPrintWriter().close();
        meno.getPrintWriter().close();
    }
}
