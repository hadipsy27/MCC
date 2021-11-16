
package daos;

import idaos.ICountryDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Country;

/**
 *
 * @author mystogan
 */
public class CountryDAO implements ICountryDAO{
    private Connection connection;
    
    public CountryDAO(Connection connection){
        this.connection = connection;
    }

    @Override
    public List<Country> getAll() {
        List<Country> listCountry = new ArrayList<>();
        String query = "SELECT * FROM hr.countries";
        try {
            PreparedStatement preparedStaement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStaement.executeQuery();
            while (resultSet.next()) {
                listCountry.add(
                    new Country(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3))
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCountry;
    }
    
    
    @Override
    public boolean insert(Country country){
        boolean result = false;
        String query = "INSERT INTO HR.COUNTRIES(country_id, country_name, region_id) VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, country.getId());
            preparedStatement.setString(2, country.getName());
            preparedStatement.setInt(3, country.getRegionId());
            preparedStatement.executeQuery();
            result = true;
            if(result){
                System.out.println("Data "+ " " + country.getId() + " " + country.getName() + " " +
                        country.getRegionId() +" berhasil di tambahkan");
            } else {
                System.out.println("data gagal di tambahkan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    
    public boolean update(String id, Country country){
           boolean result = false;
           String query = "UPDATE HR.COUNTRIES SET country_id=?, country_name=? WHERE country_id = ?";
           try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, country.getId());
            preparedStatement.setString(2, country.getName());
            preparedStatement.setString(3, id);
            preparedStatement.executeQuery();
            result = true;
            if(result){
                System.out.println("Data berhasil di ubah");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
           return result;
    }

    @Override
    public boolean delete(String id) {
        boolean result = false;
        String query = "DELETE FROM HR.COUNTRIES WHERE country_id = ?";
        try {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, id);
        preparedStatement.executeQuery();
        result = true;
        if(result){
            System.out.println("Data berhasil di hapus");
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
        
    }

    @Override
    public Country getById(String id) {
        Country country = new Country();
        String query = "SELECT * FROM HR.COUNTRIES where country_id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, id);
            ResultSet resultSet =  statement.executeQuery();
            if(resultSet.next()){
                country = new Country(resultSet.getString(1), 
                        resultSet.getString(2), 
                        resultSet.getInt(3)
                );
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return country;
    }

    @Override
    public List<Country> search(String keyword) {
       List<Country> listCountry = new ArrayList<>();
       String query = "SELECT * FROM HR.COUNTRIES WHERE country_id LIKE ? OR country_name LIKE ?";
       PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareCall(query);
            preparedStatement.setString(1, "%" + keyword + "%");
            preparedStatement.setString(2, "%" + keyword + "%");
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                listCountry.add(new Country(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CountryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return listCountry;
        
    }
    
    
}
