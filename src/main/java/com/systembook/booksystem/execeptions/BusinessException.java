/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.execeptions;

/**
 *
 * @author jpereira
 */
public class BusinessException extends Exception {

    private static final long serialVersionUID = 359474737289824787L;

    public BusinessException(String message) {
        super(message);
    }

}
