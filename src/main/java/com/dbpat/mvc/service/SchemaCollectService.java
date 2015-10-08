package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.BizAreaMapper;
import com.dbpat.mvc.model.BizArea;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.List;

@Service
public class SchemaCollectService {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    public void collect(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Connection conn = sqlSession.getConnection();

        BizAreaMapper bizAreaMapper = sqlSession.getMapper(BizAreaMapper.class);

        List<BizArea> bizAreas = bizAreaMapper.selectAllBizArea();

        for (BizArea bizArea:bizAreas){
            System.out.println(bizArea);
        }
    }
}
