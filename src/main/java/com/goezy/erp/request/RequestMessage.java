package com.goezy.erp.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RequestMessage extends BaseRequestMessage {

    private RequestDto requestmessage;

    
}