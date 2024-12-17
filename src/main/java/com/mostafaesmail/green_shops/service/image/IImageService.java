package com.mostafaesmail.green_shops.service.image;

import com.mostafaesmail.green_shops.Model.Image;
import com.mostafaesmail.green_shops.dto.ImageDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> save(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
