package idaos;

import java.util.List;
import models.Country;

/**
 *
 * @author mystogan
 */
public interface ICountryDAO {

    /**
     * getAll List method untuk mengambil semua data pada tabel Countries
     * @return
     */
    public List<Country> getAll();
    
    /**
     *  Method yg digunakan untuk mengganti nilai data di dalam tabel Countries
     * @param id bertipe integer untuk mengambil data 
     * @param c parameter untuk mengassigment dari country dan menggantinya
     * @return 
     */
    public boolean update(String id, Country country);
    
    /**
     * Method yg digunakan untyuk memasukkan data ke dalam tabel Countries
     * @param c class dari Country
     * @return 
     */
    public boolean insert(Country country);
    
    /**
     * Method yg digunakan untuk menghapus satu baris data sesuai id masukan
     * @param id parameter yang di assignment untuk menghapus data
     * @return 
     */
    public boolean delete(String id);
    
    /**
     * method yg digunakakn untuk mendapatkan dan menyeleksi data dari tabel Countries
     * @param id bertipe string untuk mengambil id dari tabel countries
     * @return 
     */
    public Country getById(String id);
    
    /**
     * Method yg digunakan untuk mendapatkan dan menyeleksi data dari tabel Regions
     * @param keyword bertipe string untuk mengambil id dari tabel countries
     * @return 
     */
    public List<Country> search(String key);
}
