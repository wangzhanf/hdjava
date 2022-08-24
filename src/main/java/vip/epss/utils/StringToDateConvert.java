package vip.epss.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将默认的日期格式进行转换
 * 表单中的type=date  中传输的是   2020-7-28  格式,springMVC的默认转换器只识别  2020/7/28 格式
 * 需要手动转换
 * 1 编写转换器类
 * 2 注册转换器类
 * */
public class StringToDateConvert implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if(source==null){
            //空值的处理
            throw new RuntimeException("转换字串为null");
        }
        //开始转换
        Date date=null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
