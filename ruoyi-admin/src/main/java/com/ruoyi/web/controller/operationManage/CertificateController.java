package com.ruoyi.web.controller.operationManage;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.enums.MonitorSystemAddrs;
import com.ruoyi.web.domain.dcmanage.BindNoticeRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 证书
 *
 * @author tzashinorpu
 * @date 2020-10-09
 */
@RestController
@RequestMapping("/operationManage")
public class CertificateController extends BaseController {
    @Autowired
    RestTemplate restTemplate;
    /**
     * 证书绑定
     */
//    @PreAuthorize("@ss.hasPermi('system:test:list')")
    @PostMapping("/bindNotice")
    public AjaxResult bindNotice(@RequestBody Integer type) {
        BindNoticeRes bindNoticeRes = restTemplate.getForObject(MonitorSystemAddrs.NET_ADDR.getAddr(), BindNoticeRes.class);
        return AjaxResult.success(bindNoticeRes);
    }
}
