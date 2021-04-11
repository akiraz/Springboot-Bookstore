package com.akiraz.newsapp.response;

import com.akiraz.newsapp.model.entity.News;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@SuperBuilder
public class ResponseRemoveNews extends BaseResponse{

	private News news;
}
