package com.sssd.springmvc.controller;

import com.sssd.springmvc.entity.QueryVo;
import com.sssd.springmvc.entity.User;
import com.sssd.springmvc.exception.SysException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
//        @RequestMapping("/param")
//    public String param(User user){
//        System.out.println(user);
//        return "success";
//    }
//    @RequestMapping("/param")
//    public String param(String username, String password, Date birthday){
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(birthday);
//        return "success";
////    }
//        @RequestMapping("/param")
//        public String param(QueryVo queryVo){
//            System.out.println(queryVo);
//            return "success";
//        }
    //-----------------------------------------------------
    //以上均为参数绑定测试
//    @RequestMapping("/response")
//    public void response(HttpServletRequest request, HttpServletResponse response)throws Exception{
//        System.out.println("response...");
//        //转发到 注意:不经过视图解析器
////        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
//        //重定向到  注意:不经过视图解析器
////        response.sendRedirect(request.getContextPath()+"/index.jsp");
//        //直接响应给浏览器
//        response.setContentType("text/html;charset=UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        response.getWriter().write("console");
//    }
//    @RequestMapping("/response")
//    public String  response(Model model)throws Exception{
//        User user = new User();
//        user.setUsername("console");
//        user.setPassword("console");
//        user.setBirthday(new Date());
//        model.addAttribute("user",user);
//        //直接通过视图解析器返回给页面
//        return "redirect:param";//重定向自己controller的指定资源
//    }
//    @RequestMapping("/response")
//    public ModelAndView response(){
//        ModelAndView mv = new ModelAndView();
//        User user = new User();
//        user.setUsername("console");
//        user.setPassword("password");
//        user.setBirthday(new Date());
//        mv.addObject("user",user);
//        mv.setViewName("success");
//        return mv;
//    }
//    @ResponseBody
//    @RequestMapping("/responseJson")
//    public User responseJson(){
//        User user = new User();
//        user.setUsername("username");
//        user.setPassword("password");
//        user.setBirthday(new Date());
//        return user;
//    }
    //-----------------------------------------------------
    //以上均为返回值测试
//    @RequestMapping("/exceptoionO")
//    public String exceptoionO() throws SysException{
//        try{
//            int i = 10/0;
//        }catch (Exception e){
//            e.printStackTrace();
//            throw new SysException("不能为0");
//        }
//        return "success";
//    }
    //-----------------------------------------------------
    //以上均为自定义异常测试
//    @RequestMapping("/interceptor")
//    public String interceptor(){
//        return "success";
//    }
    //-----------------------------------------------------
    //以上均为自定义拦截器测试
//    @RequestMapping("/upload")
//    public String upload(HttpServletRequest request)throws Exception{
//        String path = request.getSession().getServletContext().getRealPath("/upload/");
//        File file = new File(path);
//        if(!file.exists()){
//            file.mkdir();
//        }
//
//        DiskFileItemFactory itemFactory = new DiskFileItemFactory();
//        ServletFileUpload fileUpload = new ServletFileUpload(itemFactory);
//
//        List<FileItem> fileItems = fileUpload.parseRequest(request);
//        for(FileItem item:fileItems){
//            if(item.isFormField()){
//                //普通表单项
//            }else{
//                //上传项
//                String filename = item.getName();
//                String uuid = UUID.randomUUID().toString().replace("-","");
//                filename = uuid+"_"+filename;
//
//                item.write(new File(path,filename));
//                item.delete();
//            }
//        }
//        return "success";
//    }
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request,@RequestParam(name = "file") MultipartFile upload)throws Exception{
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }

        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+"_"+filename;

        upload.transferTo(new File(path,filename));

        return "success";
    }
}
