package com.daocheng.perfectmathematical.servier;

import com.daocheng.perfectmathematical.dao.BookMapper;
import com.daocheng.perfectmathematical.pojo.Book;
import com.daocheng.perfectmathematical.pojo.BookExample;
import com.daocheng.perfectmathematical.pojo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {

    @Resource
    private BookMapper bookMapper;

    /**
     * 级联查询必修课程及章节目录
     * @return
     */
    public JsonResult selectCascade() {
        try {
            List<Book> books = bookMapper.selectCascade();
            return new JsonResult(200,"查询成功",books);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(500,"查询失败",null);
        }
    }

    /**
     * 根据年级查询所有课本信息
     * @param gradeId
     * @return
     */
    public JsonResult selectBookByGradeId(Integer gradeId) {
        BookExample example = new BookExample();
        BookExample.Criteria criteria = example.createCriteria();
        criteria.andGradeEqualTo(gradeId);
        List<Book> books = bookMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        map.put("bookData",books);
        return new JsonResult(200,"数据查询成功",map);
    }
}
