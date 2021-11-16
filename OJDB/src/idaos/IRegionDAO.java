package idaos;

import java.util.List;
import models.Region;

/**
 *
 * @author mystogan
 */
public interface IRegionDAO {
    
    /**
     * getAll method untuk mengambil semua data pada tabel Regions
     * Untuk mendapatkan semua data dari tabel
     * @return 
     */
    public List<Region> getAll();

    /**
     * method yg digunakakn untuk mendapatkan dan menyeleksi data dari tabel Regions
     * @param id bertipe integer untuk mengambil data
     * @return 
     */
    public Region getById(int id);
    
    
    /**
     * Method yg digunakan untuk mendapatkan dan menyeleksi data dari tabel Regions
     * @param key String untuk mencari sebuah data pada table
     * @return 
     */
    public List<Region> search(String key);
    
    /**
     * Method yg digunakan untyuk memasukkan data ke dalam tabel Regions
     * @param r 
     * @return 
     */
    public boolean insert(Region region);
    
    /**
     * Method yg digunakan untuk mengganti nilai data di dalam tabel Regions
     * @param id diisi dengan id yang lama
     * @param r ini adalah object region
     * @return 
     */
    public boolean update(int id, Region region);
    
    /**
     * Method yg digunakan untuk menghapus satu baris data sesuai id masukan
     * @param id masukkan id tabel, bertipe integer
     * @return 
     */
    public boolean delete(int id);
}
