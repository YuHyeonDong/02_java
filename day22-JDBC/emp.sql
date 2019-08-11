-- INSERT PreparedStatement
INSERT INTO EMP e(e.empno, e.ename) 
VALUES (?, ?);

-- UPDATE PreparedStatement
UPDATE EMP e
   SET e.job = ?
     , e.hiredate = sysdate
     , e.sal = ?
     , e.deptno =?
 WHERE e.empno = ? 
;     

-- DELETE PreparedStatement     
DELETE EMP e
 WHERE e.empno = ?
;