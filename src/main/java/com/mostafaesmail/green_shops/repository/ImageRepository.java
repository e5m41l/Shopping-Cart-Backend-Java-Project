package com.mostafaesmail.green_shops.repository;

import com.mostafaesmail.green_shops.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
  }