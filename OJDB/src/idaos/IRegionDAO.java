package idaos;

import java.util.List;
import models.Region;

/**
 *
 * @author mystogan
 */
public interface IRegionDAO {
    // getAll method untuk mengambil semua data pada tabel Regions
    public List<Region> getAll();
    
    // method yg digunakakn untuk mendapatkan dan menyeleksi data dari tabel Regions
    public List<Region> getById(int id);
    
    // Method yg digunakan untuk mendapatkan dan menyeleksi data dari tabel Regions
    public List<Region> search(String key);
    
    // Method yg digunakan untyuk memasukkan data ke dalam tabel Regions
    public boolean insert(Region r);
    
    // Method yg digunakan untuk mengganti nilai data di dalam tabel Regions
    public boolean update(Region r);
    
    // Method yg digunakan yntyk menghapus satu baris data sesuai id masukan
    public boolean delete(int id);
}
