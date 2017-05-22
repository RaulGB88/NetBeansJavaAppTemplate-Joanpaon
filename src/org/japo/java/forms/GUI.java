/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
package org.japo.java.forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import org.japo.java.components.BackgroundPanel;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class GUI extends JFrame {

    // Mensaje
    private final String MESSAGE = "Once upon a time... Java";

    // Referencias a componentes
    JLabel lblMensaje;

    // Constructor
    public GUI() {
        // Inicializar GUI - PREVIA
        beforeInit();

        // Construcción - GUI
        initComponents();

        // Inicializar GUI - POSTERIOR
        afterInit();
    }

    // Inicializar GUI - PREVIA
    private void beforeInit() {

    }

    // Inicializar GUI - POSTERIOR
    private void afterInit() {

    }

    // Construcción - GUI
    private void initComponents() {
        // Fuentes
        Font fntLBL = new Font("Georgia", Font.PLAIN, 40);

        // Bordes
        EmptyBorder brdPNL = new EmptyBorder(20, 20, 20, 20);
        BevelBorder brdLBL = new BevelBorder(BevelBorder.LOWERED);

        // Tamaños
        Dimension dimFRM = new Dimension(600, 300);

        // Colores
        Color colLBL = new Color(184, 244, 244);

        // Etiqueta Mensaje
        lblMensaje = new JLabel(MESSAGE);
        lblMensaje.setFont(fntLBL);
        lblMensaje.setOpaque(true);
        lblMensaje.setBackground(colLBL);
        lblMensaje.setBorder(brdLBL);
        lblMensaje.setHorizontalAlignment(JLabel.CENTER);

        // Imagen Fondo Panel - Recurso
        String rutaIMG = "/img/background.jpg";
        URL url = getClass().getResource(rutaIMG);
        Image img = new ImageIcon(url).getImage();

        // Panel Principal
        JPanel pnlMain = new BackgroundPanel(img);
        pnlMain.setBorder(brdPNL);
        pnlMain.setLayout(new BorderLayout());
        pnlMain.add(lblMensaje, BorderLayout.CENTER);

        // Ventana principal
        setTitle("Java App Template");
        setContentPane(pnlMain);
        setResizable(false);
        setSize(dimFRM);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
