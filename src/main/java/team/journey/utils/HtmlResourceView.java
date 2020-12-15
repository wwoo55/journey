package team.journey.utils;

import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;

/**
 * @projectName: journey
 * @className: HtmlResourceView
 * @description:
 * @author: xy
 * @time: 2020/12/11 5:21
 */
public class HtmlResourceView extends InternalResourceView {

    @Override
    public boolean checkResource(Locale locale){
        File file=new File(this.getServletContext().getRealPath("/")+getUrl());
        //判断页面是否存在
        return file.exists();
    }
}

