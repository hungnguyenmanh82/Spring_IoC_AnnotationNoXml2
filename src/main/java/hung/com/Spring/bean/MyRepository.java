package hung.com.Spring.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository //singleton Bean dùng chỉ DAO.
public class MyRepository {
 
    public String getAppName() {
        return "Hello Spring App";
    }
 
    public Date getSystemDateTime() {
        return new Date();
    }
     
     
}
