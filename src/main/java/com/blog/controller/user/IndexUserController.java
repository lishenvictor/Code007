package com.blog.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户页面跳转控制器
 * @author Administrator
 *
 */
@Controller
public class IndexUserController {
	
	/**
     * 跳转用户中心页面
     * @return
     */
    @RequestMapping("/toUserCenterPage")
    public ModelAndView toUserCenterPage(){
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("title", "用户中心页面");
    	mav.setViewName("user/userCenter");
        return mav;
    }
    
    
}
