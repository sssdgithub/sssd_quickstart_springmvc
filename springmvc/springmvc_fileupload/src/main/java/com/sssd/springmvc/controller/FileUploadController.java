package com.sssd.springmvc.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class FileUploadController {
    /**
     * 传统的上传方式
     *
     * @return
     */
    @RequestMapping("/oldUpload")
    public String oldUpload(HttpServletRequest request) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
        List<FileItem> fileItems = fileUpload.parseRequest(request);
        for (FileItem item : fileItems) {
            if (item.isFormField()) {
                //普通表单项
            } else {
                //上传文件项
                String fileName = item.getName();
                String uuid = UUID.randomUUID().toString().replace("-", "");
                fileName = uuid + "_" + fileName;
                item.write(new File(path, fileName));
                //清除缓存文件
                item.delete();
            }
        }
        return "success";
    }

    @RequestMapping("/newUpload")
    public String newUpload(HttpServletRequest request, @RequestParam(name = "file") MultipartFile file) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        //拿到文件传统名称
        String fileName = file.getOriginalFilename();
        //上传文件项
        String uuid = UUID.randomUUID().toString().replace("-", "");
        fileName = uuid + "_" + fileName;
        file.transferTo(new File(path, fileName));
        return "success";
    }

    @RequestMapping("/serverUpload")
    public String serverUpload(@RequestParam(name = "file") MultipartFile file) throws Exception {
        String path = "http://localhost:9090/springmvc_imageserver/upload/";
        //拿到文件原始名称
        String fileName = file.getOriginalFilename();
        //上传文件项
        String uuid = UUID.randomUUID().toString().replace("-", "");
        fileName = uuid + "_" + fileName;
//        获取远程客户端
        Client client = Client.create();

        WebResource webResource = client.resource(path + fileName);

        webResource.put(file.getBytes());

        return "success";
    }
}
