package daos;

import idaos.IRegionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Region;

public class RegionDAO implements IRegionDAO{
    private Connection connection;
    
    public RegionDAO(Connection connection){
        this.connection = connection;
    }

    @Override
    public List<Region> getAll() {
        List<Region>  listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM HR.REGIONS";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
//                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
//                r.setId(resultSet.getInt(1));
//                r.setName(resultSet.getString(2));
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }

    @Override
    public List<Region> getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Region> search(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Region r) {
        boolean result  = false;
        String query = "INSERT INTO HR.REGIONS(region_id, region_name) VALUES(?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, r.getId());
            preparedStatement.setString(2, r.getName());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Java doc
     * @param id ini adalah id yang lama
     * @param r
     * @return 
     */
    @Override
    public boolean update(int id, Region r) {
        boolean result = false;
        String query = "UPDATE HR.REGIONS SET region_id=?, region_name=? WHERE region_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, r.getId());
            preparedStatement.setString(2, r.getName());
            preparedStatement.setInt(3, id);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        String query = "DELETE FROM HR.REGIONS WHERE region_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            result = true;
            if(result){
                System.out.println("Data berhasil di hapus");
            } else {
                System.out.println("Data tidak ada");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
