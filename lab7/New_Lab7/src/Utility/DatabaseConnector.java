/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;
import java.sql.*;
import java.util.ArrayList;
import Model.Patient;
/**
 *
 * @author yashu
 */
public class DatabaseConnector {
   private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
   private static final String DB_USERNAME = "root";
   private static final String DB_PASSWORD = "my-secret-pw";
   public static void addPatient(Patient p1) throws SQLException{
       String query = "INSERT INTO patient(id, firstname, age, gender, patientType) VALUES (?, ?, ?, ?, ?)";
       
       try{
           Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setInt(1, p1.getId());
           stmt.setString(2, p1.getFirstname());
           stmt.setString(4, p1.getGender());
           stmt.setString(5, p1.getPatientType());
           stmt.setString(3, p1.getAge());
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
   public static ArrayList<Patient> getPatients(){
       ArrayList <Patient> patients = new ArrayList();
       String query = "SELECT * FROM patient";
       try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Patient p1 = new Patient();
                p1.setId(rs.getInt("id"));
                p1.setFirstname(rs.getString("firstname"));
                p1.setGender(rs.getString("gender"));
                p1.setPatientType(rs.getString("patientType"));
                p1.setAge(rs.getString("age"));
                patients.add(p1);
          }
            rs.close();
            conn.close();
          } catch (SQLException sqle){
            System.out.print("SQL Exception Occured");
            System.out.print(sqle);
          } catch (Exception ex){
            System.out.print(ex);
          }
            return patients;
          }
   public static void updatePatient(Patient oldPatient, Patient updatedPatient){
       String query = "UPDATE patient SET firstname = ?, gender = ?, age = ?, patientType = ? WHERE id = ? ";
       try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setString(1, updatedPatient.getFirstname());
           stmt.setString(2, updatedPatient.getGender());
           stmt.setString(4, updatedPatient.getPatientType());
           stmt.setString(3, updatedPatient.getAge());
           stmt.setInt(5, oldPatient.getId());
           stmt.executeUpdate();
           
             conn.close();
          } catch (SQLException sqle){
            System.out.print("SQL Exception Occured");
            System.out.print(sqle);
          } catch (Exception ex){
            System.out.print(ex);
          }
   }
   public static void deletePatient(Patient p1){
       String query = "DELETE FROM patient WHERE id = ? ;";
               try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
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
