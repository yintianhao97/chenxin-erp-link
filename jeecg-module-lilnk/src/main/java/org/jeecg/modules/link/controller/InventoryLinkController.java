package org.jeecg.modules.link.controller;

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
import org.jeecg.modules.link.entity.InventoryLink;
import org.jeecg.modules.link.service.IInventoryLinkService;
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
 * @Description: InventoryLink
 * @Author: jeecg-boot
 * @Date:   2024-05-24
 * @Version: V1.0
 */
@Slf4j
@Api(tags="InventoryLink")
@RestController
@RequestMapping("/link/inventoryLink")
public class InventoryLinkController extends JeecgController<InventoryLink, IInventoryLinkService> {
	@Autowired
	private IInventoryLinkService inventoryLinkService;
	
	/**
	 * 分页列表查询
	 *
	 * @param inventoryLink
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "InventoryLink-分页列表查询")
	@ApiOperation(value="InventoryLink-分页列表查询", notes="InventoryLink-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(InventoryLink inventoryLink,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<InventoryLink> queryWrapper = QueryGenerator.initQueryWrapper(inventoryLink, req.getParameterMap());
		Page<InventoryLink> page = new Page<InventoryLink>(pageNo, pageSize);
		IPage<InventoryLink> pageList = inventoryLinkService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param inventoryLink
	 * @return
	 */
	@AutoLog(value = "InventoryLink-添加")
	@ApiOperation(value="InventoryLink-添加", notes="InventoryLink-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody InventoryLink inventoryLink) {
		inventoryLinkService.save(inventoryLink);
		return Result.OK("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param inventoryLink
	 * @return
	 */
	@AutoLog(value = "InventoryLink-编辑")
	@ApiOperation(value="InventoryLink-编辑", notes="InventoryLink-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<?> edit(@RequestBody InventoryLink inventoryLink) {
		inventoryLinkService.updateById(inventoryLink);
		return Result.OK("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "InventoryLink-通过id删除")
	@ApiOperation(value="InventoryLink-通过id删除", notes="InventoryLink-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		inventoryLinkService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "InventoryLink-批量删除")
	@ApiOperation(value="InventoryLink-批量删除", notes="InventoryLink-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.inventoryLinkService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "InventoryLink-通过id查询")
	@ApiOperation(value="InventoryLink-通过id查询", notes="InventoryLink-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		InventoryLink inventoryLink = inventoryLinkService.getById(id);
		return Result.OK(inventoryLink);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param inventoryLink
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, InventoryLink inventoryLink) {
      return super.exportXls(request, inventoryLink, InventoryLink.class, "InventoryLink");
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
      return super.importExcel(request, response, InventoryLink.class);
  }

}
