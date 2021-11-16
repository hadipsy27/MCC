/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;

/**
 * T untuk sebuah type/class/object ex: Region, Country
 * K primitive datatype 
 * @author mystogan
 */
public interface InterfaceDAO<T, K> {
    
    List<T> getAll();
    
    T getById(K id);
    
    List<T> search(String key);
    
    boolean insert(T object);
    
    boolean update(K id, T object);
    
    boolean delete(K id);
    
}
