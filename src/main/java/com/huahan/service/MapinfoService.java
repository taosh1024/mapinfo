package com.huahan.service;

import java.util.List;

import com.huahan.entity.MapinfoEntity;

public interface MapinfoService {
	/**
     * 新增文章
     * @param user
     * @return
     */
    boolean addMapinfo(MapinfoEntity entity);
    
    /**
     * 修改文章
     * @param user
     * @return
     */
    boolean updateMapinfo(MapinfoEntity entity);
    
    
    /**
     * 删除文章
     * @param id
     * @return
     */
    boolean deleteMapinfo(int id);
    
    /**
     * 根据用户ID查询文章信息
     * @param userId
     */
    MapinfoEntity findMapinfoById(int Id);
    
    
    
    /**
     * 根据用户ID查询文章信息
     * @param userId
     */
    List<MapinfoEntity> queryMapinfoList(String Appid, String Sign1, String Sign2);
    
    /**
     * 根据用户ID查询文章信息
     * @param userId
     */
    List<MapinfoEntity> queryMapinfoPage(String Appid, String Sign1, String Sign2, int SkipCount, int PageSize);
    
    int getCount(String Appid, String Sign1, String Sign2);
}
