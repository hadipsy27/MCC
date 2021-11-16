package daos;

import idaos.IRegionDAO;
import idaos.InterfaceDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Region;

public class RegionDAO implements InterfaceDAO<Region, Integer>{
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
                listRegion.add(new Region(
                        resultSet.getInt(1), 
                        resultSet.getString(2)
                ));
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }

  

    @Override
    public List<Region> search(String key) {
        List<Region> listRegion = new ArrayList<>();
        String query = "SELECT * FROM HR.REGIONS WHERE region_id LIKE ? OR region_name LIKE ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + key + "%");
            preparedStatement.setString(2, "%" + key + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }

    @Override
    public boolean insert(Region region) {
        boolean result  = false;
        String query = "INSERT INTO HR.REGIONS(region_id, region_name) VALUES(?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, region.getId());
            preparedStatement.setString(2, region.getName());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

   


    @Override
    public Region getById(Integer id) {
         Region region = new Region();
        String query = "SELECT * FROM HR.REGIONS WHERE region_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                region = new Region(resultSet.getInt(1), resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return region;
    }

    @Override
    public boolean update(Integer id, Region region) {
         boolean result = false;
        String query = "UPDATE HR.REGIONS SET region_id=?, region_name=? WHERE region_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, region.getId());
            preparedStatement.setString(2, region.getName());
            preparedStatement.setInt(3, id);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(Integer id) {
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
