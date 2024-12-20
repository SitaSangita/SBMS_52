package com.ashokit.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ashokit.dto.Vehcile;

public class IVehcileDaoImpl implements IVehcileDao{

	private JdbcTemplate jdbcTamplate;
	public IVehcileDaoImpl(JdbcTemplate jdbcTemplate) {

		this.jdbcTamplate=jdbcTemplate;
		System.out.println("IVehcileDaoImpl ::Constructor");
	}

	@Override
	public List<Vehcile> retriveData() {

		String sql="Select * from vehcile";
		return jdbcTamplate.query(sql,(rs,rowNum)->{
			Vehcile vi=new Vehcile();
			vi.setvId(rs.getInt("vId"));
            vi.setvName(rs.getString("vName"));
            vi.setvPrice(rs.getDouble("vPrice"));
            return vi;
        });
		
	}
	

}
