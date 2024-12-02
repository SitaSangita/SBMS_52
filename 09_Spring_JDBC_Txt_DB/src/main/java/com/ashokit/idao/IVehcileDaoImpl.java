package com.ashokit.idao;

import org.springframework.jdbc.core.JdbcTemplate;

public class IVehcileDaoImpl implements IVehcileDao{

	private JdbcTemplate jdbcTemplate;
	public IVehcileDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	@Override
	public void saveVechile(Integer vId,String vName,Double vPrice) {
		String sql="Insert into vehcile values(?,?,?)";
		jdbcTemplate.update(sql, ps->{
			ps.setInt(1,vId);
			ps.setString(2,vName);
			ps.setDouble(3, vPrice);
		});
		
	}

}
