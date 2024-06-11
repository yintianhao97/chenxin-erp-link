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
import org.jeecg.modules.link.entity.CJKJCSPXX;
import org.jeecg.modules.link.service.ICJKJCSPXXService;
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
 * @Description: 商品资料
 * @Author: jeecg-boot
 * @Date:   2024-05-20
 * @Version: V1.0
 */
@Slf4j
@Api(tags="商品资料")
@RestController
@RequestMapping("/link/cJKJCSPXX")
public class CJKJCSPXXController extends JeecgController<CJKJCSPXX, ICJKJCSPXXService> {
	@Autowired
	private ICJKJCSPXXService cJKJCSPXXService;
	
	/**
	 * 分页列表查询
	 *
	 * @param cJKJCSPXX
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "商品资料-分页列表查询")
	@ApiOperation(value="商品资料-分页列表查询", notes="商品资料-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(CJKJCSPXX cJKJCSPXX,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<CJKJCSPXX> queryWrapper = QueryGenerator.initQueryWrapper(cJKJCSPXX, req.getParameterMap());
		Page<CJKJCSPXX> page = new Page<CJKJCSPXX>(pageNo, pageSize);
		IPage<CJKJCSPXX> pageList = cJKJCSPXXService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param cJKJCSPXX
	 * @return
	 */
	@AutoLog(value = "商品资料-添加")
	@ApiOperation(value="商品资料-添加", notes="商品资料-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody CJKJCSPXX cJKJCSPXX) {
		cJKJCSPXXService.save(cJKJCSPXX);
		return Result.OK("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param cJKJCSPXX
	 * @return
	 */
	@AutoLog(value = "商品资料-编辑")
	@ApiOperation(value="商品资料-编辑", notes="商品资料-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<?> edit(@RequestBody CJKJCSPXX cJKJCSPXX) {
		cJKJCSPXXService.updateById(cJKJCSPXX);
		return Result.OK("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "商品资料-通过id删除")
	@ApiOperation(value="商品资料-通过id删除", notes="商品资料-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		cJKJCSPXXService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "商品资料-批量删除")
	@ApiOperation(value="商品资料-批量删除", notes="商品资料-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.cJKJCSPXXService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "商品资料-通过id查询")
	@ApiOperation(value="商品资料-通过id查询", notes="商品资料-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		CJKJCSPXX cJKJCSPXX = cJKJCSPXXService.getById(id);
		return Result.OK(cJKJCSPXX);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param cJKJCSPXX
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, CJKJCSPXX cJKJCSPXX) {
      return super.exportXls(request, cJKJCSPXX, CJKJCSPXX.class, "商品资料");
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
      return super.importExcel(request, response, CJKJCSPXX.class);
  }

}
