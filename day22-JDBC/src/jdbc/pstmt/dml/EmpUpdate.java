package jdbc.pstmt.dml;

import static jdbc.ConnectionInfo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * EMP 테이블에 
 * 1행을 삽입하는 INSERT 쿼리를 
 * JDBC를 통해 처리하는 클래스
 * -----------------------------------
 * 1. 드라이버로드(5번째 Class.forName(..))
 * 2. 커넥션 맺기(DriverManger 클래스 사용)
 * 3. 쿼리 준비(PreparedStatment 사용)
 * 4. 쿼리 실행(executeQuery(), excuteUpdate())
 * 5. 결과 처리(while, 리턴 값에 따라 적절한 처리)
 * 6. 자원 해제(오픈한 역순)
 * 
 * 모든 과정에서 SQLException 처리
 * ----------------------------------
 * 
 * @author Administrator
 *
 */
public class EmpUpdate {

	public static void main(String[] args) {
		// 필요한 변수들 먼저 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
		// 1. 드라이버 로드
		Class.forName(DIRVER);
			
		// 2. 커넥션 맺기
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 3. 쿼리 준비
		String sql = "UPDATE EMP e"
					+"   SET e.job = ?"
					+"     , e.hiredate = sysdate"
					+"     , e.sal = ?"
					+"     , e.deptno =?"
					+" WHERE e.empno = ?";
		pstmt = conn.prepareStatement(sql);
		
		// ? 매핑 (홍길동 : 9999수정)
		System.out.println("사번을 숫자 네자리로 입력하세요.");
		pstmt.setString(1, "SALESMAN");
		pstmt.setInt(2, 2000);
		pstmt.setInt(3, 30);
		pstmt.setInt(4, 9999);
		
		// 4. 쿼리 실행
		//    pstmt 객체들을 
		int setCnt = pstmt.executeUpdate();
		
		
		// 5. DML 결과 처리 : executeUpdate() 를 통해서 
        // 몇 건의 데이터가 처리되었는지를 나타내는 
        // 정수 리턴값으로 처리 가능
        if(setCnt > 0) {
           System.out.printf("%d 행이 입력되었습니다 %n",setCnt);
        }
        
        
     }catch(SQLException e) {
        System.err.println("드라이버 로드 오류!" + e.getMessage());
     
     }catch(ClassNotFoundException e){         
        System.err.println("드라이버 로드 오류!" + e.getMessage());
        e.printStackTrace();
     }finally {
        // 6. 자원 해제
           try {
              if(pstmt != null) {
                 pstmt.close();               
           }
              if(conn != null) {
                 conn.close();
              }
              
        }catch(SQLException e) {
           System.out.println("자원 해제시 오류!" +e.getMessage());
           e.printStackTrace();
		}
		}
	}

}
