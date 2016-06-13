/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingetec.interfaces;

import java.util.List;

/**
 *
 * @author cristian manuel
 */
public interface Interfaz<Clase> {//usando objetos
    public boolean create(Clase c);
    public boolean delete(Object key);
    public boolean update(Clase c);
    public Clase read(Object key);
    public List<Clase> readAll();
    
}

