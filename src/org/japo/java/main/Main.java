/* 
 * Copyright 2019 Manu Portolés Zagalá.
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

import java.util.Random;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    public static final Random RND = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int DADO_MAX = 6;
        final int DADO_MIN = 1;
        int dado = RND.nextInt(DADO_MAX - DADO_MIN) + DADO_MIN;

        System.out.printf("%s %d%n", "Tirada dado .......:", dado);

    }

}
