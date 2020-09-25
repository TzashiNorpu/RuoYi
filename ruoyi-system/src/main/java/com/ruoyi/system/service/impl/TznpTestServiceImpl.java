package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TznpTestMapper;
import com.ruoyi.system.domain.TznpTest;
import com.ruoyi.system.service.ITznpTestService;

/**
 * 测试Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-25
 */
@Service
public class TznpTestServiceImpl implements ITznpTestService 
{
    @Autowired
    private TznpTestMapper tznpTestMapper;

    /**
     * 查询测试
     * 
     * @param id 测试ID
     * @return 测试
     */
    @Override
    public TznpTest selectTznpTestById(Long id)
    {
        return tznpTestMapper.selectTznpTestById(id);
    }

    /**
     * 查询测试列表
     * 
     * @param tznpTest 测试
     * @return 测试
     */
    @Override
    public List<TznpTest> selectTznpTestList(TznpTest tznpTest)
    {
        return tznpTestMapper.selectTznpTestList(tznpTest);
    }

    /**
     * 新增测试
     * 
     * @param tznpTest 测试
     * @return 结果
     */
    @Override
    public int insertTznpTest(TznpTest tznpTest)
    {
        return tznpTestMapper.insertTznpTest(tznpTest);
    }

    /**
     * 修改测试
     * 
     * @param tznpTest 测试
     * @return 结果
     */
    @Override
    public int updateTznpTest(TznpTest tznpTest)
    {
        return tznpTestMapper.updateTznpTest(tznpTest);
    }

    /**
     * 批量删除测试
     * 
     * @param ids 需要删除的测试ID
     * @return 结果
     */
    @Override
    public int deleteTznpTestByIds(Long[] ids)
    {
        return tznpTestMapper.deleteTznpTestByIds(ids);
    }

    /**
     * 删除测试信息
     * 
     * @param id 测试ID
     * @return 结果
     */
    @Override
    public int deleteTznpTestById(Long id)
    {
        return tznpTestMapper.deleteTznpTestById(id);
    }
}
