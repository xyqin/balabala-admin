package com.newhead.barablah.modules.barablahtextbookcategory.ext.protocol;

import com.newhead.barablah.modules.barablahtextbookcategory.base.protocol.AbstractBarablahTextbookCategoryUpdateRequest;
import lombok.Data;

/**
 * 
 * 2018年01月25日 02:58:39
 */
@Data
public class SimpleBarablahTextbookCategoryUpdateRequest extends AbstractBarablahTextbookCategoryUpdateRequest {
  private String path;

}
