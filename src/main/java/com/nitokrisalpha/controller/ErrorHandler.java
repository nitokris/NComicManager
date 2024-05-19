package com.nitokrisalpha.controller;

import com.nitokrisalpha.api.R;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class ErrorHandler implements ErrorController {

    private final static String ERROR_PATH = "/error";
    private final static String ERROR_CODE_ATTR = "javax.servlet.error.status_code";

    /**
     * Supports the HTML Error View
     *
     * @param request
     * @return
     */
    @RequestMapping(value = ERROR_PATH)
    public R<Void> errorHtml(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute(ERROR_CODE_ATTR);
        if (statusCode == 401) {
            return R.error(401, "Unauthorized");
        } else if (statusCode == 404) {
            return R.error(404, "Not found");
        } else if (statusCode == 403) {
            return R.error(403, "Forbidden");
        } else {
            return R.error(500, "Internal Error");
        }
    }

}
