package tools;

import daos.CountryDAO;
import daos.RegionDAO;
import idaos.ICountryDAO;
import idaos.IRegionDAO;
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
//        IRegionDAO irdao = new RegionDAO(connection.getConnection());
//        Region region = new Region(35, "Regional");
//        System.out.println(irdao.insert(region));

        // 8.b
//        IRegionDAO irdao = new RegionDAO(connection.getConnection());
//        for(Region region : irdao.getAll()){
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }
        
        // delete data
//        irdao.delete(35);
//        for(Region region : irdao.getAll()){
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }
        
//        IRegionDAO irdao = new RegionDAO(connection.getConnection());
//        Region region = new Region(35, "Regionnal");
//        System.out.println(irdao.update(32, region));
        
        // GetbyId
//        Region region = irdao.getById(1);
//        System.out.println(region.getId() + " " + region.getName());

        // search data
//          IRegionDAO irdao = new RegionDAO(connection.getConnection());
//          for(Region region : irdao.search("2")){
//              System.out.println(region.getId() + " " + region.getName());
//          }

//        IRegionDAO irdao = new RegionDAO(connection.getConnection());
//        irdao.delete(31);


// --------------------------------------------------------------------------------

        ICountryDAO iCountryDAO  = new CountryDAO(connection.getConnection());
        // Get all data country
//        for(Country country : iCountryDAO.getAll()){
//            System.out.println(country.getId() +" "+ 
//                    country.getName() +" "+ 
//                    country.getRegionId());
//        }

        // Insert Country
//        Country country = new Country("MO", "MOMOLAND", 4);
//        System.out.println(icdao.insert(country));

        // Update Country
//        Country country = new Country("ZW", "Zaman WW3");
//        System.out.println(icdao.update("ZW", country));

        // delete country
//        icdao.delete("ZW");

        // getById
//        Country country = iCountryDAO.getById("MO");
//        System.out.println(
//                country.getId() + " " + 
//                country.getName() + " "+ 
//                country.getRegionId()
//        );

            // Search countries
            for(Country country : iCountryDAO.search("ZM")){
                System.out.println(country.getId() +" "+ 
                        country.getName() +" "+
                        country.getRegionId()
                );
            }

    }
}
