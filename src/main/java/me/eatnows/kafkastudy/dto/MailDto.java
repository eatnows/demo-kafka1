package me.eatnows.kafkastudy.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class MailDto {

    private String from;

    private String to;

    private String content;

    private MultipartFile file;

}
