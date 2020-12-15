package team.journey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.journey.pojo.Account;
import team.journey.pojo.ResultInfo;
import team.journey.service.AccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: journey
 * @className: AccountController
 * @description:
 * @author: xy
 * @time: 2020/12/11 5:27
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService service;

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping("/login.do")
    @ResponseBody
    public ResultInfo
    login(Account account, HttpSession session) {
        Account login = service.findByLogin(account);
        ResultInfo info = new ResultInfo();
        if (login != null) {
            session.setAttribute("LOGIN", login);
            info.setFlag(true);
        } else {
            info.setFlag(false);
            info.setMsg("账户名或密码错误");
        }
        return info;
    }

    @RequestMapping("/checkLoginStatus.do")
    @ResponseBody
    public ResultInfo checkLoginStatus(HttpSession session) {
        Account login = (Account) session.getAttribute("LOGIN");
        ResultInfo info = new ResultInfo();
        if (login != null) {
            // 已登录
            info.setFlag(true);
            info.setData(login);
        } else {
            info.setFlag(false);
        }
        return info;
    }

    @RequestMapping("/logout.do")
    public String logout(HttpSession session) {
        session.removeAttribute("LOGIN");
        // 更新页面
       return "redirect:index.html";
    }

    @RequestMapping("/register.do")
    @ResponseBody
    public ResultInfo register(Account account){
        Boolean flag = service.registerAccount(account);
        ResultInfo info = new ResultInfo();
        if (flag){
            info.setFlag(true);
            info.setMsg("注册成功，你现在可以去登录了！");
        }else {
            info.setFlag(false);
            info.setMsg("用户名已存在");
        }
        return info;
    }
}
