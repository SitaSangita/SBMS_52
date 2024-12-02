package com.ashokit.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.ashokit.idao.IVehcileDaoImpl;

public class VehcileService {
	private IVehcileDaoImpl iVehcileDaoImpl;
	public VehcileService(IVehcileDaoImpl iVehcileDaoImpl) {
		this.iVehcileDaoImpl=iVehcileDaoImpl;
		//System.out.println("Vehcile::Constructor");
	}
	public void saveVehcileData() throws Exception {
		File f=new File("Vehcile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			String[] split=line.split(",");
			Integer vId=Integer.parseInt(split[0]);
			String vName=split[1];
			Double vPrice=Double.parseDouble(split[2]);
			iVehcileDaoImpl.saveVechile(vId, vName, vPrice);
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
