package tools;

import daos.CountryDAO;
import daos.RegionDAO;
import idaos.ICountryDAO;
import idaos.IRegionDAO;
import idaos.InterfaceDAO;
import java.util.List;
import models.Country;
import models.Region;

/**
 *
 * @author mystogan
 */
public class OJDBC {

    public static void main(String[] args) {
        //Test database connection ---------------------------------------------
        DBConnection connection = new DBConnection();
        System.out.println(connection);

        // manual test Region --------------------------------------------------
        
//        Region region = new Region();
//        region.setId(0);
//        region.setName("region");
//        System.out.println(region.getId() + " " + region.getName());

//        Region r = new Region(1, "Region new");
//        System.out.println(r.getId() + " " + r.getName());
          
        // 8.a -----------------------------------------------------------------
/**
 * Koneksi ke database untuk menjalankan interface
 */   
//        InterfaceDAO<Region, Integer> idao = new RegionDAO(connection.getConnection());
//        Region region = new Region(35, "Regional");
//        System.out.println(idao.insert(region));

// 8.b -------------------------------------------------------------------------
//        for(Region region : idao.getAll()){
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }
        
// delete data -----------------------------------------------------------------
//        idao.delete(35);

// getAll data Regions ---------------------------------------------------------
//        for(Region region : idao.getAll()){
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }
        
// update date table region
//        Region region = new Region(35, "Regionnal");
//        System.out.println(idao.update(32, region));
        
        // GetbyId
//        InterfaceDAO<Region, Integer> idao = new RegionDAO(connection.getConnection());
//        Region region = idao.getById(1);
//        System.out.println(region.getId() + " " + region.getName());

        // search data
//        InterfaceDAO<Region, Integer> idao = new RegionDAO(connection.getConnection());
//          for(Region region : idao.search("2")){
//              System.out.println(region.getId() + " " + region.getName());
//          }


// --------------------------------------------------------------------------------
/**
 * Koneksi ke database untuk menjalankan interface
 */
//        InterfaceDAO<Country, String> idao = new CountryDAO(connection.getConnection());
        // Get all data country
//        for(Country country : idao.getAll()){
//            System.out.println(country.getId() +" "+ 
//                    country.getName() +" "+ 
//                    country.getRegionId());
//        }

        // Insert Country
//        InterfaceDAO<Country, String> idao = new CountryDAO(connection.getConnection());
//        Country country = new Country("MI", "MIMILAND", 4);
//        System.out.println(idao.insert(country));

        // Update Country
//        InterfaceDAO<Country, String> idao = new CountryDAO(connection.getConnection());
//        Country country = new Country("ZM", "Zaman WW4");
//        System.out.println(idao.update("ZM", country));

        // delete country
//        InterfaceDAO<Country, String> idao = new CountryDAO(connection.getConnection());
//        idao.delete("ZW");

        // getById
//        InterfaceDAO<Country, String> idao = new CountryDAO(connection.getConnection());
//        Country country = idao.getById("ZM");
//        System.out.println(
//                country.getId() + " " + 
//                country.getName() + " "+ 
//                country.getRegionId()
//        );

            // Search countries
//            InterfaceDAO<Country, String> idao = new CountryDAO(connection.getConnection());
//            for(Country country : idao.search("ZM")){
//                System.out.println(country.getId() +" "+ 
//                        country.getName() +" "+
//                        country.getRegionId()
//                );
//            }

    }
}
