package com.goezy.erp.response;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@Nonnull
public class ResponseMessage extends BaseResponseMessage {

    private ResponseDto responseMessage;

   
}
