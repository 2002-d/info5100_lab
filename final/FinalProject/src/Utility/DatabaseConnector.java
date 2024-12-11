package Utility;
import java.sql.*;
import java.util.ArrayList;
import Model.Customer;
/**
 *
 * @author yashu
 */
public class DatabaseConnector {
   private static final String DB_URL = "jdbc:mysql://localhost:3306/insurance?useSSL=false";
   private static final String DB_USERNAME = "root";
   private static final String DB_PASSWORD = "my-secret-pw";
   public static void addCustomer(Customer c1) throws SQLException{
       String query = "INSERT INTO customer(Id, fullname, age, gender, phone , email, carmake, carmodel, makeyear,  appointType, appointdate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
       
       try{
           Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setInt(1, c1.getId());
           stmt.setString(2, c1.getFullname());
           stmt.setString(4, c1.getGender());
           stmt.setString(3, c1.getAge());
           stmt.setString(5, c1.getPhone());
           stmt.setString(6, c1.getEmail());
           stmt.setString(7, c1.getCarmake());
           stmt.setString(8, c1.getCarmodel());
           stmt.setInt(9, (int) c1.getMakeyear());
           stmt.setString(10, c1.getAppointType());
if (c1.getAppointdate() != null) {
            stmt.setDate(11, new java.sql.Date(c1.getAppointdate().getTime()));
        } else {
            stmt.setNull(11, java.sql.Types.DATE);
        }
           int rows = stmt.executeUpdate();
           System.out.print("Rows inserted: "+rows);
           conn.close();
       }catch (SQLException sqle){
           System.out.print("SQL Exception Occured");
           System.out.print(sqle);
       } catch (Exception ex){
           System.out.print(ex);
       }
       
   }
   public static ArrayList<Customer> getCustomers(){
       ArrayList <Customer> customers = new ArrayList();
       String query = "SELECT * FROM customer";
       try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Customer c1 = new Customer();                
                c1.setId(rs.getInt("Id"));
                c1.setFullname(rs.getString("fullname"));
                c1.setGender(rs.getString("gender"));
                c1.setAge(rs.getString("age"));
                c1.setPhone(rs.getString("phone"));
                c1.setEmail(rs.getString("email"));
                c1.setCarmake(rs.getString("carmake"));
                c1.setCarmodel(rs.getString("carmodel"));
                c1.setMakeyear(rs.getInt("makeyear"));
                c1.setAppointType(rs.getString("appointType"));
                c1.setappointdate(rs.getDate("appointdate"));
                customers.add(c1);
          }
            rs.close();
            conn.close();
          } catch (SQLException sqle){
            System.out.print("SQL Exception Occured");
            System.out.print(sqle);
          } catch (Exception ex){
            System.out.print(ex);
          }
            return customers;
          }
   public static void updateCustomer(Customer oldCustomer, Customer updatedCustomer){
       String query = "UPDATE customer SET fullname = ?, age = ?, gender = ?, phone = ?, email = ?, carmake = ?, carmodel = ?, makeyear = ?,  appointType = ?, appointdate = ? WHERE Id = ? ";
       try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setString(1, updatedCustomer.getFullname());
           stmt.setString(2, updatedCustomer.getAge());
           stmt.setString(3, updatedCustomer.getGender());
           stmt.setString(4, updatedCustomer.getPhone());
           stmt.setString(5, updatedCustomer.getEmail());
           stmt.setString(6, updatedCustomer.getCarmake());
           stmt.setString(7, updatedCustomer.getCarmodel());
           stmt.setInt(8, updatedCustomer.getMakeyear());
           stmt.setString(9, updatedCustomer.getAppointType());
            if (updatedCustomer.getAppointdate() != null) {
                stmt.setDate(10, new java.sql.Date(updatedCustomer.getAppointdate().getTime()));
            } else {
                stmt.setNull(10, java.sql.Types.DATE); // Handle null dates if needed
            }

           stmt.setInt(11, oldCustomer.getId());
           stmt.executeUpdate();
           
             conn.close();
          } catch (SQLException sqle){
            System.out.print("SQL Exception Occured");
            System.out.print(sqle);
          } catch (Exception ex){
            System.out.print(ex);
          }
   }
   public static void deleteCustomer(Customer c1){
       String query = "DELETE FROM customer WHERE Id = ? ;";
               try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, c1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted: "+rows);
            conn.close();
          } catch (SQLException sqle){
            System.out.print("SQL Exception Occured");
            System.out.print(sqle);
          } catch (Exception ex){
            System.out.print(ex);
          }
   }
}
