package com.goezy.erp.response;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BaseResponseMessage {

    private String statusCode;
    private String statusDesc;

    
}
