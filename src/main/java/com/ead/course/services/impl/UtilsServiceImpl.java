package com.ead.course.services.impl;

import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ead.course.services.UtilsService;

@Service
public class UtilsServiceImpl implements UtilsService {
    private String REQUEST_URI = "http://localhost:8087";

    public String generateUrl(UUID courseId, Pageable pageable) {
        return this.REQUEST_URI +"/users?courseId=" + courseId
            + "&page=" + pageable.getPageNumber()
            + "&size=" + pageable.getPageSize()
            + "&sort=" + pageable.getSort().toString().replaceAll(":", ",").replaceAll(" ", "");
    }
}
