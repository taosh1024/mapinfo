package com.huahan.domain;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.huahan.entity.MapinfoEntity;

@Mapper
public interface MapinfoRepos {
	/**
     * 文章数据新增
     */
     @Insert("insert into PUB_MAPINFO("
     		+ "APPID"
     		+ ",SIGN1"
     		+ ",SIGN2"
     		+ ",SIGN3"
     		+ ",SIGN4"
     		+ ",SIGN5"
     		+ ",SHAPE"
     		+ ") values ("
     		+ "#{Appid}"
     		+ ",#{Sign1}"
     		+ ",#{Sign2}"
     		+ ",#{Sign3}"
     		+ ",#{Sign4}"
     		+ ",#{Sign5}"
     		+ ",#{Shape})")
     //@Options(useGeneratedKeys=true, keyProperty="Id",keyColumn = "ID")
     void addMapinfo(MapinfoEntity entity);
     
     /**
      * 文章数据修改
      */
     @Update("update PUB_MAPINFO set "
     		+ "APPID=#{Appid}"
     		+ ",SIGN1=#{Sign1}"
     		+ ",SIGN2=#{Sign2}"
     		+ ",SIGN3=#{Sign3}"
     		+ ",SIGN4=#{Sign4}"
     		+ ",SIGN5=#{Sign5}"
     		+ ",SHAPE=#{Shape} where [ID]=#{Id}")
     void updateMapinfo(MapinfoEntity entity);

     /**
      * 文章数据删除
     */
     @Delete("delete from PUB_MAPINFO where ID=#{Id}")
     void deleteMapinfo(int id);
     
     /**
      * 根据文章Id查询文章信息
      *
      */
     @Select("SELECT "
    		 + "a.ID as Id"
             + ",a.APPID as Appid"
             + ",a.SIGN1 as Sign1"
             + ",a.SIGN2 as Sign2"
             + ",a.SIGN3 as Sign3"
             + ",a.SIGN4 as Sign4"
             + ",a.SIGN5 as Sign5"
             + ",a.SHAPE as Shape"
             + " FROM PUB_MAPINFO a WHERE a.ID=#{Id}")
     MapinfoEntity findById(@Param(value = "Id") int Id);
     
     /**
      * 根据文章Id查询文章信息
      *
      */
     @Select("<script>"
             + "SELECT "
             + "a.ID as Id"
             + ",a.APPID as Appid"
             + ",a.SIGN1 as Sign1"
             + ",a.SIGN2 as Sign2"
             + ",a.SIGN3 as Sign3"
             + ",a.SIGN4 as Sign4"
             + ",a.SIGN5 as Sign5"
             + ",a.SHAPE as Shape"
             //+ "a.parent_id as 'parentId',a.first_comment_id as 'firstCommentId',"
             //+ "b.id as 'fromUser.id',b.realname as 'fromUser.realname',b.avatar as 'fromUser.avatar',"
             //+ "c.id as 'toUser.id',c.realname as 'toUser.realname',c.avatar as 'toUser.avatar' "
             + " FROM PUB_MAPINFO a "
             //+ "LEFT JOIN t_user b ON b.id = a.from_uid "
             //+ "LEFT JOIN t_user c ON c.id = a.to_uid "
             //+ "WHERE a.demand_id = #{demandId} "
             + "<where>"
             + "<choose>"
             + "<when test='Appid != null'>a.APPID=#{Appid}</when>"
             + "<when test='Sign1 != null'>a.SIGN1=#{Sign1}</when>"
             + "<when test='Sign2 != null'>a.SIGN2=#{Sign2}</when>"
             //+ "<otherwise>AND status = 'UNLOCK'</otherwise>"
             + "</choose>"
             + "</where>"
             + "ORDER BY a.ID ASC "
             + "<if test='SkipCount != null and PageSize != null '>"
             + "LIMIT #{PageSize} OFFSET #{SkipCount}" //postgres  limit 100 OFFSET 1000
             + "</if>"
             + "</script>")
     List<MapinfoEntity> queryAll(@Param("Appid") String Appid,
    		 @Param("Sign1") String Sign1,
    		 @Param("Sign2") String Sign2,
    		 @Param("SkipCount") Integer SkipCount, 
    		 @Param("PageSize") Integer PageSize);
     
     /**
      * 文章数据删除
     */
     @Select("SELECT count(1) FROM PUB_MAPINFO WHERE UserName LIKE '%' || #{Name} || '%'")
     int getCount(@Param("Appid") String Appid,
    		 @Param("Sign1") String Sign1,
    		 @Param("Sign2") String Sign2);
}
