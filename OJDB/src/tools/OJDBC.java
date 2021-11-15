package tools;

import daos.RegionDAO;
import idaos.IRegionDAO;
import models.Region;

/**
 *
 * @author mystogan
 */
public class OJDBC {

    public static void main(String[] args) {
        //Test database connection
        DBConnection connection = new DBConnection();
        System.out.println(connection);

        // manual test Region
//        Region region = new Region();
//        region.setId(0);
//        region.setName("region");
//        System.out.println(region.getId() + " " + region.getName());

//        Region r = new Region(1, "Region new");
//        System.out.println(r.getId() + " " + r.getName());

        IRegionDAO irdao = new RegionDAO(connection.getConnection());
        Region region = new Region(31, "My Region");
        System.out.println(irdao.insert(region));
    }
}
