package com.example.demo.deferredresult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 如果直接调用了deferredResult.setResult方法，则会立即返回结果，否则则会一直等到超时时调用OnTimeOut回调函数
 * 注意：其它线程如果调用了deferredResult.setResult方法，也会使上面的方法直接返回结果
 * @Author zp
 * @create 2020/1/7 10:56
 */
@RestController
public class DeferredResultController {
    DeferredResult deferredResult = new DeferredResult(60 * 1000L);
    @RequestMapping("/getResult")
    public DeferredResult getResult() {

        deferredResult.onTimeout(() -> {
                    System.out.println("访问超时");
                    deferredResult.setErrorResult("304");
                }
        );
        deferredResult.onCompletion(() -> {
                    System.out.println("访问成功");
                }
        );

        return deferredResult;
    }

    @RequestMapping("/pub")
    public void pub(){
        deferredResult.setResult("dsfdsfdsf");
    }
}
