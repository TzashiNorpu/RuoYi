package com.ruoyi.web.controller.operationManage;

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
@RequestMapping("/operationManage")
public class CertificateController extends BaseController {
    @Autowired
    private ITznpTestService tznpTestService;

    /**
     * 证书绑定
     */
//    @PreAuthorize("@ss.hasPermi('system:test:list')")
    @GetMapping("/bindNotice")
    public TableDataInfo list(TznpTest tznpTest) {
        startPage();
        List<TznpTest> list = tznpTestService.selectTznpTestList(tznpTest);
        return getDataTable(list);
    }
}
