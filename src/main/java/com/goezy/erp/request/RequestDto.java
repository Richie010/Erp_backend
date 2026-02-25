package com.goezy.erp.request;

import com.goezy.erp.model.ContractorDto;
import com.goezy.erp.model.SubContractorDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {
	
	private Long wfid;
	private Long userid;
	private Long custid;
	
	private SubContractorDto subContractorDto;
}
