/*
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
package org.japo.java.app;

import java.awt.EventQueue;
import org.japo.java.forms.GUI;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 *
 * Funcionalidad/Objetivo de la aplicación.
 */
public class App {

    // Entrada al Mecanismo Funcional
    public void launchApp() {
        // Lanzar GUI
        launchGUI();
    }

    // Lanzar Interfaz Grafico de Usuario
    private void launchGUI() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Instancia la ventana
                GUI gui = new GUI();

                // Muestra la ventana
                gui.setVisible(true);
            }
        });
    }
}
