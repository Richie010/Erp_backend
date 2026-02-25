package com.goezy.erp.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.goezy.erp.model.ContractorDto;
import com.goezy.erp.model.SubContractorDto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {
	
	private ContractorDto contractorDto;
	
	private SubContractorDto subContractorDto;

}
