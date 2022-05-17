package ai.jobiak.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAO {
	
	private JdbcTemplate mysqlTemplate;

	public JdbcTemplate getMysqlTemplate() {
		return mysqlTemplate;
	}

	public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}
	public int insertRow() {
		return mysqlTemplate.update("insert into customer1 values(199,'Michel Lee',4000)");
	}
	
	

}

	


