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
import org.jeecg.modules.link.entity.DispatchListLink;
import org.jeecg.modules.link.service.IDispatchListLinkService;
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
 * @Description: DispatchListLink
 * @Author: jeecg-boot
 * @Date:   2024-05-24
 * @Version: V1.0
 */
@Slf4j
@Api(tags="DispatchListLink")
@RestController
@RequestMapping("/link/dispatchListLink")
public class DispatchListLinkController extends JeecgController<DispatchListLink, IDispatchListLinkService> {
	@Autowired
	private IDispatchListLinkService dispatchListLinkService;
	
	/**
	 * 分页列表查询
	 *
	 * @param dispatchListLink
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "DispatchListLink-分页列表查询")
	@ApiOperation(value="DispatchListLink-分页列表查询", notes="DispatchListLink-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(DispatchListLink dispatchListLink,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<DispatchListLink> queryWrapper = QueryGenerator.initQueryWrapper(dispatchListLink, req.getParameterMap());
		Page<DispatchListLink> page = new Page<DispatchListLink>(pageNo, pageSize);
		IPage<DispatchListLink> pageList = dispatchListLinkService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param dispatchListLink
	 * @return
	 */
	@AutoLog(value = "DispatchListLink-添加")
	@ApiOperation(value="DispatchListLink-添加", notes="DispatchListLink-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody DispatchListLink dispatchListLink) {
		dispatchListLinkService.save(dispatchListLink);
		return Result.OK("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param dispatchListLink
	 * @return
	 */
	@AutoLog(value = "DispatchListLink-编辑")
	@ApiOperation(value="DispatchListLink-编辑", notes="DispatchListLink-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<?> edit(@RequestBody DispatchListLink dispatchListLink) {
		dispatchListLinkService.updateById(dispatchListLink);
		return Result.OK("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "DispatchListLink-通过id删除")
	@ApiOperation(value="DispatchListLink-通过id删除", notes="DispatchListLink-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		dispatchListLinkService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "DispatchListLink-批量删除")
	@ApiOperation(value="DispatchListLink-批量删除", notes="DispatchListLink-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.dispatchListLinkService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "DispatchListLink-通过id查询")
	@ApiOperation(value="DispatchListLink-通过id查询", notes="DispatchListLink-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		DispatchListLink dispatchListLink = dispatchListLinkService.getById(id);
		return Result.OK(dispatchListLink);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param dispatchListLink
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, DispatchListLink dispatchListLink) {
      return super.exportXls(request, dispatchListLink, DispatchListLink.class, "DispatchListLink");
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
      return super.importExcel(request, response, DispatchListLink.class);
  }

}
