package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

/**
 * SCOTT 계정의 EMP 테이블의 내용을 조회하여
 * 데이터베이스 접속을 테스트하는 클래스
 * -----------------------------------------
 * 1. 드라이버 로드
 * 2. 커넥션 맺기
 * 3. 쿼리 준비
 * 4. 쿼리 실행
 * 5. 결과 처리
 * 6. 자원 해제
 * @author Administrator
 *
 */
public class DriverLoadType1 {

   // DB 커넥션 정보를 static 상수로 선언
   private static final String URL = "jdbc:oracle:thin:@//localhost:1521/XE";// 127.0.1은 데스크탑 위치 , 1521 은 오라클 포트 번호
   private static final String MYSQL_URL = "jdbc:mysql://127.0.01:3306/emp";
   
   
   
   private static final String USER = "SCOTT";
   private static final String PASSWORD = "TIGER";

   public static void main(String[] args) {
//        1. 드라이버 로드
      new OracleDriver();
      
      Connection connection = null;
      Statement stmt = null;
      ResultSet result = null;

      try {
//        2. 커넥션 맺기
         connection = DriverManager.getConnection(URL, USER, PASSWORD);         
//        3. 쿼리 준비
         String sql = "SELECT e.empno"
               +   "        , e.ename"
               +   "        , e.job"
               +   "        , e.sal"
               +   "  FROM emp e"
               +   " ORDER BY e.ename";
               
//        4. 쿼리 실행

         // 결과 셋의 컬럼 이름 추출
         ResultSetMetaData mata = result.getMetaData();
         String colEmpno = mata.getColumnName(1);
         String colEname = mata.getColumnName(2);
         String colJob = mata.getColumnName(3);
         String colSal = mata.getColumnName(4);
         
         System.out.printf("%4d | %6s | %9s | %4d", colEmpno, colEname, colJob, colSal);
         System.out.println("--------------------------------------------");
         
//        5. 결과 처리 : 반복 수행
         // SELECT 실행 결과는 여러 행의 결과가 발생하는 거이 
         // 일반적이므로 각 행별 처리를 위해서는 반복처리가 필요
         
         while (result.next()) {
            // 결과셋의 표 형태를 받는 result 변수에서
            // next() 를 호출해야 최초의 행으로 
            // 결과셋 커서(cursor)가 이동
            // result 변수는 커서가 이동된 행 1줄을 가르키게 됨.
            int empno = result.getInt(1);
            String ename = result.getString(2);
            String job   = result.getString(3);
            int sal = result.getInt(4);
            
            System.out.printf("%4d | %6s | %9s | %4d", empno, ename, job, sal);
         }
         
      }catch(SQLException   e) {
         System.out.println("자원 해제시 오류!" +e.getMessage());
         e.printStackTrace();
      }finally{
         // 6. 자원 해제
         //      해제 순서 : result -> stmt -> connection오픈한 반대 순서
         //    오픈 순서 : connection -> stmt => result
         try {
            if (result != null) {
               result.close();
            }
            if (stmt != null) {
               stmt.close();
            }
            if (connection != null) {
               connection.close();
            }
            
         }catch(SQLException e) {
            System.out.println("자원 해제시 오류!" +e.getMessage());
            e.printStackTrace();
         }
         
      }
      
   }

}