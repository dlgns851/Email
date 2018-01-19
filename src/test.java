import java.sql.Connection;

import com.javaex.connection.DbConnect;
import com.javaex.dao.EmaillistDao;

import EmaillistVo.EmaillistVo;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EmaillistVo vo = new EmaillistVo(2,"a","b","c");
		EmaillistDao dao = new EmaillistDao();
		dao.insert(vo);
		
		
		
	}

}
