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
import org.jeecg.modules.link.entity.CJKDJRKDMX;
import org.jeecg.modules.link.service.ICJKDJRKDMXService;
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
 * @Description: 上架子单据
 * @Author: jeecg-boot
 * @Date:   2024-06-12
 * @Version: V1.0
 */
@Slf4j
@Api(tags="上架子单据")
@RestController
@RequestMapping("/link/cJKDJRKDMX")
public class CJKDJRKDMXController extends JeecgController<CJKDJRKDMX, ICJKDJRKDMXService> {
	@Autowired
	private ICJKDJRKDMXService cJKDJRKDMXService;
	
	/**
	 * 分页列表查询
	 *
	 * @param cJKDJRKDMX
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "上架子单据-分页列表查询")
	@ApiOperation(value="上架子单据-分页列表查询", notes="上架子单据-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(CJKDJRKDMX cJKDJRKDMX,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<CJKDJRKDMX> queryWrapper = QueryGenerator.initQueryWrapper(cJKDJRKDMX, req.getParameterMap());
		Page<CJKDJRKDMX> page = new Page<CJKDJRKDMX>(pageNo, pageSize);
		IPage<CJKDJRKDMX> pageList = cJKDJRKDMXService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param cJKDJRKDMX
	 * @return
	 */
	@AutoLog(value = "上架子单据-添加")
	@ApiOperation(value="上架子单据-添加", notes="上架子单据-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody CJKDJRKDMX cJKDJRKDMX) {
		cJKDJRKDMXService.save(cJKDJRKDMX);
		return Result.OK("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param cJKDJRKDMX
	 * @return
	 */
	@AutoLog(value = "上架子单据-编辑")
	@ApiOperation(value="上架子单据-编辑", notes="上架子单据-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<?> edit(@RequestBody CJKDJRKDMX cJKDJRKDMX) {
		cJKDJRKDMXService.updateById(cJKDJRKDMX);
		return Result.OK("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "上架子单据-通过id删除")
	@ApiOperation(value="上架子单据-通过id删除", notes="上架子单据-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		cJKDJRKDMXService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "上架子单据-批量删除")
	@ApiOperation(value="上架子单据-批量删除", notes="上架子单据-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.cJKDJRKDMXService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "上架子单据-通过id查询")
	@ApiOperation(value="上架子单据-通过id查询", notes="上架子单据-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		CJKDJRKDMX cJKDJRKDMX = cJKDJRKDMXService.getById(id);
		return Result.OK(cJKDJRKDMX);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param cJKDJRKDMX
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, CJKDJRKDMX cJKDJRKDMX) {
      return super.exportXls(request, cJKDJRKDMX, CJKDJRKDMX.class, "上架子单据");
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
      return super.importExcel(request, response, CJKDJRKDMX.class);
  }

}
