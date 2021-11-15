package icontrollers;

import java.util.List;
import models.Region;

/**
 *
 * @author mystogan
 */
public interface IRegionController {
    // method untuk mengambil semua data pada tabel regions
    public List<Region> getAll();
    
    // method untuk mendapatkan dan menyeleksi data dari tabel Regions
    public List<Region> getById(String id);
    
    // method untuk mendapatkan dan menyeleksi data dari tabel Regions
    public List<Region> search(String key);
 
    // method untuk memasukkan data ke dalam tabel Regions
    public String insert(String id, String name);
    
    // method untuk mengganti nilai data di dalam tabel Regions
    public String update(String id, String name);
    
    // method untuk menghapus satu baris data sesuai id masukan
    public String delete(String id);
}
