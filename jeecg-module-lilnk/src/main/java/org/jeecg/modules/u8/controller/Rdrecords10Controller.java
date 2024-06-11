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
import org.jeecg.modules.u8.entity.Rdrecords10;
import org.jeecg.modules.u8.service.IRdrecords10Service;
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
 * @Description: 产成品入库附
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Slf4j
@Api(tags="产成品入库附")
@RestController
@RequestMapping("/u8/rdrecords10")
public class Rdrecords10Controller extends JeecgController<Rdrecords10, IRdrecords10Service> {
	@Autowired
	private IRdrecords10Service rdrecords10Service;
	
	/**
	 * 分页列表查询
	 *
	 * @param rdrecords10
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "产成品入库附-分页列表查询")
	@ApiOperation(value="产成品入库附-分页列表查询", notes="产成品入库附-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(Rdrecords10 rdrecords10,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<Rdrecords10> queryWrapper = QueryGenerator.initQueryWrapper(rdrecords10, req.getParameterMap());
		Page<Rdrecords10> page = new Page<Rdrecords10>(pageNo, pageSize);
		IPage<Rdrecords10> pageList = rdrecords10Service.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param rdrecords10
	 * @return
	 */
	@AutoLog(value = "产成品入库附-添加")
	@ApiOperation(value="产成品入库附-添加", notes="产成品入库附-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody Rdrecords10 rdrecords10) {
		rdrecords10Service.save(rdrecords10);
		return Result.OK("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param rdrecords10
	 * @return
	 */
	@AutoLog(value = "产成品入库附-编辑")
	@ApiOperation(value="产成品入库附-编辑", notes="产成品入库附-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<?> edit(@RequestBody Rdrecords10 rdrecords10) {
		rdrecords10Service.updateById(rdrecords10);
		return Result.OK("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "产成品入库附-通过id删除")
	@ApiOperation(value="产成品入库附-通过id删除", notes="产成品入库附-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		rdrecords10Service.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "产成品入库附-批量删除")
	@ApiOperation(value="产成品入库附-批量删除", notes="产成品入库附-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.rdrecords10Service.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "产成品入库附-通过id查询")
	@ApiOperation(value="产成品入库附-通过id查询", notes="产成品入库附-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		Rdrecords10 rdrecords10 = rdrecords10Service.getById(id);
		return Result.OK(rdrecords10);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param rdrecords10
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, Rdrecords10 rdrecords10) {
      return super.exportXls(request, rdrecords10, Rdrecords10.class, "产成品入库附");
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
      return super.importExcel(request, response, Rdrecords10.class);
  }

}
