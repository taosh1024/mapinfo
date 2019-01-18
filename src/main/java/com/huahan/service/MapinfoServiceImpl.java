package com.huahan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huahan.domain.MapinfoRepos;
import com.huahan.entity.MapinfoEntity;

@Service
public class MapinfoServiceImpl implements MapinfoService {
	@Autowired
    private MapinfoRepos _mapinfoRepos;

	@Override
	public boolean addMapinfo(MapinfoEntity entity) {
		// TODO Auto-generated method stub
		boolean flag = false;
        try {
        	_mapinfoRepos.addMapinfo(entity);
            flag = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return flag;
	}

	@Override
	public boolean updateMapinfo(MapinfoEntity entity) {
		// TODO Auto-generated method stub
		boolean flag = false;
        try{
        	_mapinfoRepos.updateMapinfo(entity);
            flag = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return flag;
	}

	@Override
	public boolean deleteMapinfo(int id) {
		// TODO Auto-generated method stub
		boolean flag = false;
        try{
        	_mapinfoRepos.deleteMapinfo(id);
            flag = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return flag;
	}

	@Override
	public MapinfoEntity findMapinfoById(int Id) {
		// TODO Auto-generated method stub
		return _mapinfoRepos.findById(Id);
	}

	@Override
	public List<MapinfoEntity> queryMapinfoList(String Appid, String Sign1, String Sign2) {
		// TODO Auto-generated method stub
		return _mapinfoRepos.queryAll(Appid, Sign1, Sign2, null, null);
	}

	@Override
	public List<MapinfoEntity> queryMapinfoPage(String Appid, String Sign1, String Sign2, int SkipCount, int PageSize) {
		// TODO Auto-generated method stub
		return _mapinfoRepos.queryAll(Appid, Sign1, Sign2, SkipCount, PageSize);
	}

	@Override
	public int getCount(String Appid, String Sign1, String Sign2) {
		// TODO Auto-generated method stub
		return _mapinfoRepos.getCount(Appid, Sign1, Sign2);
	}

}
