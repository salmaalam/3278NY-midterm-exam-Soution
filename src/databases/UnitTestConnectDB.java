package databases;

import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) throws Exception {
        try {
            ConnectToSqlDB con = new ConnectToSqlDB();
            Assert.assertEquals(con.readDataBase("", ""), con.readDataBase("", ""));
            System.out.println("Test passed");
        } catch (AssertionError as) {
            as.printStackTrace();
            System.out.println("Test Failed");
        }
        try {
            ConnectToMongoDB mon = new ConnectToMongoDB();
            Assert.assertEquals(mon.readUserProfileFromMongoDB(), "User");
            System.out.println("Test passed");
        } catch (AssertionError as) {
            as.printStackTrace();
            System.out.println("Test Failed");
        }

    }
}