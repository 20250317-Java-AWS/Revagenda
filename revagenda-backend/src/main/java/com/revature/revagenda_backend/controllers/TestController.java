package com.revature.revagenda_backend.controllers;

import com.revature.revagenda_backend.exceptions.UsernameNotUniqueException;
import com.revature.revagenda_backend.services.TestService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping(path = "/test")
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(path = "/header-test")
    @ResponseBody public String testHeaders(@RequestHeader("test") String message) {
        return message;
    }

    @GetMapping(path = "/exception-test")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody public String testExceptions() throws UsernameNotUniqueException {
        System.out.println("DEBUG: EXCEPTION TEST METHOD");
        this.testService.testException();
        return "test";
    }

    @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT, reason = "this is the reason")
    @ExceptionHandler({UsernameNotUniqueException.class, Exception.class})
    public String handleException(Exception e) {
        System.out.println("DEBUG: EXCEPTION HANDLER");
        return e.getMessage();
    }

//    @GetMapping(path = "/header-test-no-annotation")
//    @ResponseBody public String testHeadersNoAnnotation(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String header = req.getHeader("test");
//        System.out.println("DEBUG: " + header);
//        resp.getWriter().write(header);
//        resp.setStatus(200);
//        return header;
//    }
}
