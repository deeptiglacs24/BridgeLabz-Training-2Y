package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultDAO {

    public void addResult(Result result) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO result VALUES (?, ?, ?)");
            ps.setInt(1, result.getStudentId());
            ps.setInt(2, result.getMarks());
            ps.setString(3, result.getGrade());
            ps.executeUpdate();
            System.out.println("Result added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewResult(int id) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM result WHERE studentId = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Student ID: " + rs.getInt(1));
                System.out.println("Marks: " + rs.getInt(2));
                System.out.println("Grade: " + rs.getString(3));
            } else {
                System.out.println("Result not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
