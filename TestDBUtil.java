package util;

import java.sql.Connection;

public class TestDBUtil {
  public static void main(String[] args) throws Exception {
    Connection conn = DBUtil.getConnection();
    System.out.println(conn);
  }
}
