package com.example.aiVisualization.controller;

import com.opencsv.CSVReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;



@Controller
public class TestController {

    @PostMapping("/upload")
    public @ResponseBody String uploadCSV(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                // 获取上传文件的原始文件名
                String originalFilename = file.getOriginalFilename();
                // 定义本地存储路径，根据实际情况修改
                String filePath = "D:/works/" + originalFilename;
                // 创建本地文件
                File localFile = new File(filePath);
                // 将上传的文件保存到本地
                file.transferTo(localFile);
                // 返回成功信息或执行其他操作
                return "文件上传成功：" + originalFilename;
            } catch (IOException e) {
                // 处理异常情况
                return "文件上传失败: " + e.getMessage();
            }
        } else {
            return "请选择一个CSV文件";
        }
    }

}

