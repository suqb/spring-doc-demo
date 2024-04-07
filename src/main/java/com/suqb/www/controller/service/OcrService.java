package com.suqb.www.controller.service;

import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public interface OcrService {

    String recognizeText(File imageFile) throws TesseractException;

    String recognizeTextFromUrl(String imageUrl) throws Exception;
}
