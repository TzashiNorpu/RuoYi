package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.TznpTest;
import com.ruoyi.system.service.ITznpTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测试Controller
 * 
 * @author ruoyi
 * @date 2020-09-25
 */
@RestController
@RequestMapping("/system/test")
public class TznpTestController extends BaseController
{
    @Autowired
    private ITznpTestService tznpTestService;

    /**
     * 查询测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:test:list')")
    @GetMapping("/list")
    public TableDataInfo list(TznpTest tznpTest)
    {
        startPage();
        List<TznpTest> list = tznpTestService.selectTznpTestList(tznpTest);
        return getDataTable(list);
    }

    /**
     * 导出测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:test:export')")
    @Log(title = "测试", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TznpTest tznpTest)
    {
        List<TznpTest> list = tznpTestService.selectTznpTestList(tznpTest);
        ExcelUtil<TznpTest> util = new ExcelUtil<TznpTest>(TznpTest.class);
        return util.exportExcel(list, "test");
    }

    /**
     * 获取测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:test:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tznpTestService.selectTznpTestById(id));
    }

    /**
     * 新增测试
     */
    @PreAuthorize("@ss.hasPermi('system:test:add')")
    @Log(title = "测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TznpTest tznpTest)
    {
        return toAjax(tznpTestService.insertTznpTest(tznpTest));
    }

    /**
     * 修改测试
     */
    @PreAuthorize("@ss.hasPermi('system:test:edit')")
    @Log(title = "测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TznpTest tznpTest)
    {
        return toAjax(tznpTestService.updateTznpTest(tznpTest));
    }

    /**
     * 删除测试
     */
    @PreAuthorize("@ss.hasPermi('system:test:remove')")
    @Log(title = "测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tznpTestService.deleteTznpTestByIds(ids));
    }
}
