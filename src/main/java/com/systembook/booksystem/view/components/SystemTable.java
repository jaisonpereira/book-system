/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.view.components;

import java.awt.Color;
import javax.swing.JTable;

/**
 *
 * @author jpereira
 */
public class SystemTable extends JTable {

    public SystemTable() {
        initialize();
    }

    private void initialize() {
        this.setGridColor(Color.WHITE);
        this.setBackground(Color.WHITE);
        this.setForeground(Color.black);
        this.setSelectionBackground(Color.CYAN);
        this.setSelectionForeground(Color.black);
    }
}
