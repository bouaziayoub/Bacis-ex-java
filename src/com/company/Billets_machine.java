package com.company;

import java.util.Scanner;

// El programa proporciona una experiencia interactiva para simular la compra de billetes de transporte público,
// ofreciendo flexibilidad en la elección del tipo de billete y la zona, y calculando de manera precisa los costos
// asociados con cada compra.
public class Billets_machine {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            final float Billet_senzill = 2.40f;
            final float TCasual = 11.35f;
            final float TUsual = 40.00f;
            final float TFamiliar = 10.0f;
            final float TJove = 80.00f;
            int opción = 0;
            int opción1 = 0;
            int num_opc = 0;
            boolean TeclaCorrecto = false;
            float total = 0f;
            float pag, cambio, faltante;

            String continuar = "s";

            while (continuar.equalsIgnoreCase("s")) {
                // do {
                do {
                    System.out.println(
                            "qué billete desea adquirir? \n1 - Billet senzill \n2 - TCasual \n3 - TUsual \n4 - TFamiliar \n5 - TJove ");

                    do {
                        TeclaCorrecto = scan.hasNextInt();
                        if (TeclaCorrecto == false) {
                            System.out.println(
                                    "!! La opcion es un numero, debes elegir desde 1 a 5 !! \n1 - Billet senzill \n2 - TCasual \n3 - TUsual \n4 - TFamiliar \n5 - TJove ");
                            scan.nextLine();
                        }
                    } while (TeclaCorrecto == false);

                    opción = scan.nextInt();
                    scan.nextLine();

                } while (opción > 5 || opción < 1);

                switch (opción) {
                    case 1:
                        do {

                            System.out.println("qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                            do {
                                TeclaCorrecto = scan.hasNextInt();
                                if (TeclaCorrecto == false) {
                                    System.out.println(
                                            "!! La opcion es un numero, debes elegir desde 1 a 3 !! qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                                    scan.nextLine();
                                }
                            } while (TeclaCorrecto == false);
                            opción1 = scan.nextInt();
                            scan.nextLine();
                        } while (opción1 > 3 || opción < 1);
                        if (opción1 == 1) {
                            System.out.println("has escogido: Billet_senzill, zona 1 ");
                            System.out.println("el precio del billete es :" + Billet_senzill);
                            num_opc++;
                            total += Billet_senzill;

                        } else if (opción1 == 2) {
                            System.out.println("has escogido: Billet_senzill, zona 2 ");
                            System.out.println("el precio del billete es :" + Billet_senzill * 1.3125f);
                            num_opc++;
                            total += Billet_senzill * 1.3125f;
                        } else if (opción1 == 3) {
                            System.out.println("has escogido: Billet_senzill, zona 3 ");
                            System.out.println("el precio del billete es :" + Billet_senzill * 1.8443f);
                            num_opc++;
                            total += Billet_senzill * 1.8443f;
                        }
                        break;

                    case 2:
                        do {
                            System.out.println("qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                            do {
                                TeclaCorrecto = scan.hasNextInt();
                                if (TeclaCorrecto == false) {
                                    System.out.println(
                                            "!! La opcion es un numero, debes elegir desde 1 a 3 !! qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                                    scan.nextLine();

                                }
                            } while (TeclaCorrecto == false);
                            opción1 = scan.nextInt();
                            scan.nextLine();
                        } while (opción1 > 3 || opción < 1);
                        if (opción1 == 1) {
                            System.out.println("has escogido: TCasual, zona 1 ");
                            System.out.println("el precio del billete es :" + TCasual);
                            num_opc++;
                            total += TCasual;
                        } else if (opción1 == 2) {
                            System.out.println("has escogido: TCasual, zona 2 ");
                            System.out.println("el precio del billete es :" + TCasual * 1.3125f);
                            num_opc++;
                            total += TCasual * 1.3125f;
                        } else if (opción1 == 3) {
                            System.out.println("has escogido: TCasual, zona 3 ");
                            System.out.println("el precio del billete es :" + TCasual * 1.8443f);
                            num_opc++;
                            total += TCasual * 1.8443f;
                        }

                        break;

                    case 3:
                        do {
                            System.out.println("qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                            do {
                                TeclaCorrecto = scan.hasNextInt();
                                if (TeclaCorrecto == false) {
                                    System.out.println(
                                            "!! La opcion es un numero, debes elegir desde 1 a 3 !! qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                                    scan.nextLine();
                                }
                            } while (TeclaCorrecto == false);
                            opción1 = scan.nextInt();
                            scan.nextLine();
                        } while (opción1 > 3 || opción < 1);
                        if (opción1 == 1) {
                            System.out.println("has escogido: TUsual, zona 1 ");
                            System.out.println("el precio del billete es :" + TUsual);
                            num_opc++;
                            total += TUsual;
                        } else if (opción1 == 2) {
                            System.out.println("has escogido: TUsual, zona 2 ");
                            System.out.println("el precio del billete es :" + TUsual * 1.3125f);
                            num_opc++;
                            total += TUsual * 1.3125f;
                        } else if (opción1 == 3) {
                            System.out.println("has escogido: TUsual, zona 3 ");
                            System.out.println("el precio del billete es :" + TUsual * 1.8443f);
                            num_opc++;
                            total += TUsual * 1.8443f;
                        }
                        break;

                    case 4:
                        do {
                            System.out.println("qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");

                            do {
                                TeclaCorrecto = scan.hasNextInt();
                                if (TeclaCorrecto == false) {
                                    System.out.println(
                                            "!! La opcion es un numero, debes elegir desde 1 a 3 !! qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                                    scan.nextLine();
                                }
                            } while (TeclaCorrecto == false);
                            opción1 = scan.nextInt();
                            scan.nextLine();
                        } while (opción1 > 3 || opción < 1);
                        if (opción1 == 1) {
                            System.out.println("has escogido: TFamiliar, zona 1 ");
                            System.out.println("el precio del billete es :" + TFamiliar);
                            num_opc++;
                            total += TFamiliar;

                        } else if (opción1 == 2) {
                            System.out.println("has escogido: TFamiliar, zona 2 ");
                            System.out.println("el precio del billete es :" + TFamiliar * 1.3125f);
                            num_opc++;
                            total += TFamiliar * 1.3125f;
                        } else if (opción1 == 3) {
                            System.out.println("has escogido: TFamiliar, zona 3 ");
                            System.out.println("el precio del billete es :" + TFamiliar * 1.8443f);
                            num_opc++;
                            total += TFamiliar * 1.8443f;
                        }
                        break;

                    case 5:
                        do {
                            System.out.println("qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                            do {
                                TeclaCorrecto = scan.hasNextInt();
                                if (TeclaCorrecto == false) {
                                    System.out.println(
                                            "!! La opcion es un numero, debes elegir desde 1 a 3 !! qué zona quiere viajar ? \nZONA 1 \nZONA 2 \nZONA 3");
                                    scan.nextLine();
                                }
                            } while (TeclaCorrecto == false);
                            opción1 = scan.nextInt();
                            scan.nextLine();
                        } while (opción1 > 3 || opción < 1);
                        if (opción1 == 1) {
                            System.out.println("has escogido: TJove, zona 1 ");
                            System.out.println("el precio del billete es :" + TJove);
                            num_opc++;
                            total += TJove;
                        } else if (opción1 == 2) {
                            System.out.println("has escogido: TJove, zona 2 ");
                            System.out.println("el precio del billete es :" + TJove * 1.3125f);
                            num_opc++;
                            total += TJove * 1.3125f;
                        } else if (opción1 == 3) {
                            System.out.println("has escogido: TJove, zona 3 ");
                            System.out.println("el precio del billete es :" + TJove * 1.8443f);
                            num_opc++;
                            total += TJove * 1.8443f;
                        }
                        break;
                    default:

                }

                System.out.println("Quieres seguir comprando? [ s | n ]");
                continuar = scan.next();
                scan.nextLine();

                System.out.println("-----------------------------------------------");

                if (!continuar.equals("s")) {

                    System.out.println("Has comprado" + " " + num_opc + " " + "billetes");

                    System.out.println("Tienes que pagar " + total + "€");
                    do {
                        System.out.println("Introduce monedas o billetes válidas de EURO:");
                        pag = scan.nextInt();
                        scan.nextLine();
                        if (pag < total) {
                            total = total - pag;
                            System.out.println(
                                    "has introducido" + " " + pag + "€" + " " + "le queda por pagar " + total + "€");
                        } else if (pag > total) {
                            total = pag - total;
                            System.out.println("El cambio es " + total + "€    ");
                            break;
                        } else if (pag == total) {
                            System.out.println("se ha pagado ya, no es nesesario dar cambio!");
                        }

                    } while (total >= 0);
                }

            }
        }
    }
}