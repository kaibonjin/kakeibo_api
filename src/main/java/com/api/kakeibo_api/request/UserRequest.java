//package com.api.kakeibo_api.request;
//
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class UserRequest {
//    Pageable firstPageTenUsers = PageRequest.of(0, 10);
//
//    public Pageable getPageRequest (@RequestBody int page, int size) {
//        return firstPageTenUsers = PageRequest.of(page, size);
//    }
//}
