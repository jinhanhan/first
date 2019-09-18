package com.daocheng.perfectmathematical.servier;

import com.daocheng.perfectmathematical.dao.BookChapterMapper;
import com.daocheng.perfectmathematical.pojo.BookChapter;
import com.daocheng.perfectmathematical.pojo.BookChapterExample;
import com.daocheng.perfectmathematical.pojo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private BookChapterMapper chapterMapper;

    /**
     * 根据课本查询所有章节信息
     * @param bookId  课本标识id
     * @return
     */
    public JsonResult selectChapterByBookId(Integer bookId) {
        BookChapterExample example = new BookChapterExample();
        BookChapterExample.Criteria criteria = example.createCriteria();
        criteria.andBookIdEqualTo(bookId);
        List<BookChapter> chapters = chapterMapper.selectByExample(example);
        HashMap<String, Object> map = new HashMap<>();
        map.put("chapterData",chapters);
        return  new JsonResult(200,"章节信息查询成功",map);
    }
}
