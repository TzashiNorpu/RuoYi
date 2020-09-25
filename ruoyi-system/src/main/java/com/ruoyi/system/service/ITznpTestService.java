package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TznpTest;

/**
 * 测试Service接口
 * 
 * @author ruoyi
 * @date 2020-09-25
 */
public interface ITznpTestService 
{
    /**
     * 查询测试
     * 
     * @param id 测试ID
     * @return 测试
     */
    public TznpTest selectTznpTestById(Long id);

    /**
     * 查询测试列表
     * 
     * @param tznpTest 测试
     * @return 测试集合
     */
    public List<TznpTest> selectTznpTestList(TznpTest tznpTest);

    /**
     * 新增测试
     * 
     * @param tznpTest 测试
     * @return 结果
     */
    public int insertTznpTest(TznpTest tznpTest);

    /**
     * 修改测试
     * 
     * @param tznpTest 测试
     * @return 结果
     */
    public int updateTznpTest(TznpTest tznpTest);

    /**
     * 批量删除测试
     * 
     * @param ids 需要删除的测试ID
     * @return 结果
     */
    public int deleteTznpTestByIds(Long[] ids);

    /**
     * 删除测试信息
     * 
     * @param id 测试ID
     * @return 结果
     */
    public int deleteTznpTestById(Long id);
}
