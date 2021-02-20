package com.gasparbarancelli.mysqlnativequery.repository;

import com.gasparbarancelli.mysqlnativequery.to.PostTO;
import io.github.gasparbarancelli.NativeQuery;
import io.github.gasparbarancelli.NativeQueryParam;

import java.util.List;

public interface PostNativeQuery extends NativeQuery {

    List<PostTO> posts(@NativeQueryParam("authorId") Long authorId, @NativeQueryParam("tagId") Long tagId);

}
