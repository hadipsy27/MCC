/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;

/**
 * T untuk sebuah object ex: Region, Country
 * K primitive datatype 
 * @author mystogan
 */
public interface InterfaceDAO<T, K> {
    
    /**
     * Method untuk mengambil semua data dari table
     * T untuk type object
     * @return 
     */
    List<T> getAll();
    
    /**
     * Method untuk mencari data berdasarkan id
     * K merupakan tipe data primitif
     * @param id assignment dari tipe data primitif K
     * @return 
     */
    T getById(K id);
    
    /**
     * Method untuk mencari data berdasarkan id atau nama dari table
     * String merupakan tipe data primitif
     * @param key assignment dari tipe data primitif String
     * @return 
     */
    List<T> search(String key);
    
    /**
     * method untuk memasukkan data ke dalam database
     * T merupakan sebuah object dari suatu class
     * @param object assigment dari sebuah object T
     * @return 
     */
    boolean insert(T object);
    
    /**
     * method untuk memperbaharui data
     * K merupakan tipe data primitif
     * @param id assignment dari tipe data primitif K
     * T merupakan sebuah object dari suatu class
     * @param object assigment dari sebuah object T
     * @return 
     */
    boolean update(K id, T object);
    
    /**
     * method untuk menghapus data dari database berdasarkan id
     * K merupakan tipe data primitif
     * @param id assignment dari tipe data primitif K
     * @return 
     */
    boolean delete(K id);
    
}
