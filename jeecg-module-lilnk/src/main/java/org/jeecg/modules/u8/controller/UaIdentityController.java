package org.jeecg.modules.u8.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.u8.entity.UaIdentity;
import org.jeecg.modules.u8.service.IUaIdentityService;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

 /**
 * @Description: 单据id
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@Slf4j
@Api(tags="单据id")
@RestController
@RequestMapping("/u8/uaIdentity")
public class UaIdentityController extends JeecgController<UaIdentity, IUaIdentityService> {
	@Autowired
	private IUaIdentityService uaIdentityService;
	
	/**
	 * 分页列表查询
	 *
	 * @param uaIdentity
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "单据id-分页列表查询")
	@ApiOperation(value="单据id-分页列表查询", notes="单据id-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(UaIdentity uaIdentity,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<UaIdentity> queryWrapper = QueryGenerator.initQueryWrapper(uaIdentity, req.getParameterMap());
		Page<UaIdentity> page = new Page<UaIdentity>(pageNo, pageSize);
		IPage<UaIdentity> pageList = uaIdentityService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param uaIdentity
	 * @return
	 */
	@AutoLog(value = "单据id-添加")
	@ApiOperation(value="单据id-添加", notes="单据id-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody UaIdentity uaIdentity) {
		uaIdentityService.save(uaIdentity);
		return Result.OK("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param uaIdentity
	 * @return
	 */
	@AutoLog(value = "单据id-编辑")
	@ApiOperation(value="单据id-编辑", notes="单据id-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<?> edit(@RequestBody UaIdentity uaIdentity) {
		uaIdentityService.updateById(uaIdentity);
		return Result.OK("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "单据id-通过id删除")
	@ApiOperation(value="单据id-通过id删除", notes="单据id-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		uaIdentityService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "单据id-批量删除")
	@ApiOperation(value="单据id-批量删除", notes="单据id-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.uaIdentityService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "单据id-通过id查询")
	@ApiOperation(value="单据id-通过id查询", notes="单据id-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		UaIdentity uaIdentity = uaIdentityService.getById(id);
		return Result.OK(uaIdentity);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param uaIdentity
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, UaIdentity uaIdentity) {
      return super.exportXls(request, uaIdentity, UaIdentity.class, "单据id");
  }

  /**
   * 通过excel导入数据
   *
   * @param request
   * @param response
   * @return
   */
  @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
  public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
      return super.importExcel(request, response, UaIdentity.class);
  }

}
