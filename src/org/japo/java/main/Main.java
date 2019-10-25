/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Consantes
        final String COMIDA1 = "carne";
        final String COMIDA2 = "pescado";
        final int PUAS0 = 0;
        final int PUAS1 = 3;
        final int PUAS2 = 4;
        //variables 
        int puas;
        String tipoComida;
        //cabecera
        System.out.println("Alternativa Tenedor");
        System.out.println("===================");

        System.out.print("Tipo de comida .: ");
        tipoComida = SCN.nextLine().toLowerCase();
        if (tipoComida.equals(COMIDA1)){
            puas = PUAS1;
        } else if (tipoComida.equals(COMIDA2)) {
            puas = PUAS2;
        } else {
            puas = PUAS0;
        }
//        switch (tipoComida) {
//            case COMIDA1:
//                puas = PUAS1;
//                break;
//            case COMIDA2:
//                puas = PUAS2;
//                break;
//            default:
//                puas = PUAS0;
//        }
        System.out.println("---");
        System.out.printf("Tenedor con ....: %d púas%n",puas);
    }
}
