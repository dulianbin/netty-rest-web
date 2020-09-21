package com.dulianbin.web.base.multipart;

import lombok.Data;
import lombok.ToString;

import java.util.Arrays;

/**
 * 上传文件类
 * @author dulianbin
 * @date 2020/08/15
 */
@Data
@ToString
public final class MultipartFile {
    
    private String fileName;
    
    private String fileType;
    
    private byte[] fileData;

}
