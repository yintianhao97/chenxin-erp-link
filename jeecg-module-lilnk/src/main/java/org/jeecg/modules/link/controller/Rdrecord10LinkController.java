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
import org.jeecg.modules.link.entity.Rdrecord10Link;
import org.jeecg.modules.link.service.IRdrecord10LinkService;
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
 * @Description: Rdrecord10Link
 * @Author: jeecg-boot
 * @Date:   2024-05-24
 * @Version: V1.0
 */
@Slf4j
@Api(tags="Rdrecord10Link")
@RestController
@RequestMapping("/link/rdrecord10Link")
public class Rdrecord10LinkController extends JeecgController<Rdrecord10Link, IRdrecord10LinkService> {
	@Autowired
	private IRdrecord10LinkService rdrecord10LinkService;
	
	/**
	 * 分页列表查询
	 *
	 * @param rdrecord10Link
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "Rdrecord10Link-分页列表查询")
	@ApiOperation(value="Rdrecord10Link-分页列表查询", notes="Rdrecord10Link-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(Rdrecord10Link rdrecord10Link,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<Rdrecord10Link> queryWrapper = QueryGenerator.initQueryWrapper(rdrecord10Link, req.getParameterMap());
		Page<Rdrecord10Link> page = new Page<Rdrecord10Link>(pageNo, pageSize);
		IPage<Rdrecord10Link> pageList = rdrecord10LinkService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param rdrecord10Link
	 * @return
	 */
	@AutoLog(value = "Rdrecord10Link-添加")
	@ApiOperation(value="Rdrecord10Link-添加", notes="Rdrecord10Link-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody Rdrecord10Link rdrecord10Link) {
		rdrecord10LinkService.save(rdrecord10Link);
		return Result.OK("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param rdrecord10Link
	 * @return
	 */
	@AutoLog(value = "Rdrecord10Link-编辑")
	@ApiOperation(value="Rdrecord10Link-编辑", notes="Rdrecord10Link-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<?> edit(@RequestBody Rdrecord10Link rdrecord10Link) {
		rdrecord10LinkService.updateById(rdrecord10Link);
		return Result.OK("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "Rdrecord10Link-通过id删除")
	@ApiOperation(value="Rdrecord10Link-通过id删除", notes="Rdrecord10Link-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		rdrecord10LinkService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "Rdrecord10Link-批量删除")
	@ApiOperation(value="Rdrecord10Link-批量删除", notes="Rdrecord10Link-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.rdrecord10LinkService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "Rdrecord10Link-通过id查询")
	@ApiOperation(value="Rdrecord10Link-通过id查询", notes="Rdrecord10Link-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		Rdrecord10Link rdrecord10Link = rdrecord10LinkService.getById(id);
		return Result.OK(rdrecord10Link);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param rdrecord10Link
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, Rdrecord10Link rdrecord10Link) {
      return super.exportXls(request, rdrecord10Link, Rdrecord10Link.class, "Rdrecord10Link");
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
      return super.importExcel(request, response, Rdrecord10Link.class);
  }

}
