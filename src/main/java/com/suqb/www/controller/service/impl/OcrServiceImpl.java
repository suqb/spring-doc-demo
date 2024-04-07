package com.suqb.www.controller.service.impl;

import com.suqb.www.controller.service.OcrService;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class OcrServiceImpl implements OcrService {

    @Override
    public String recognizeText(File imageFile) throws TesseractException {
        Tesseract tesseract = new Tesseract();

        // 设定训练文件的位置（如果是标准英文识别，此步可省略）
        tesseract.setDatapath("你的tessdata各语言集合包地址");
        tesseract.setLanguage("chi_sim");
        return tesseract.doOCR(imageFile);
    }

    public String recognizeTextFromUrl(String imageUrl) throws Exception {
        URL url = new URL(imageUrl);
        InputStream in = url.openStream();
        Files.copy(in, Paths.get("downloaded.jpg"), StandardCopyOption.REPLACE_EXISTING);

        File imageFile = new File("downloaded.jpg");
        return recognizeText(imageFile);
    }
}