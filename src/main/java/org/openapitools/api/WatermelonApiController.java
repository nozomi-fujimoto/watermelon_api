package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-25T11:10:44.340894+09:00[Asia/Tokyo]")

@Controller
@RequestMapping("${openapi..base-path:}")
public class WatermelonApiController implements WatermelonApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WatermelonApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
