package ua.com.alevel.util;

import ua.com.alevel.api.dto.response.PageData;
import ua.com.alevel.api.dto.response.ResponseDto;
import ua.com.alevel.persistence.datatable.DataTableRequest;
import ua.com.alevel.persistence.datatable.DataTableResponse;
import ua.com.alevel.persistence.entity.BaseEntity;

public final class WebResponseUtil {

    private WebResponseUtil() { }

    public static PageData<? extends ResponseDto> initPageData(
            DataTableResponse<? extends BaseEntity> tableResponse) {
        PageData<? extends ResponseDto> pageData = new PageData<>();
        pageData.setCurrentPage(tableResponse.getCurrentPage());
        pageData.setPageSize(tableResponse.getCurrentSize());
        pageData.setOrder(tableResponse.getOrder());
        pageData.setSort(tableResponse.getSort());
        pageData.setItemsSize(tableResponse.getItemsSize());
        pageData.initPaginationState();
        return pageData;
    }

    public static void initDataTableResponse(DataTableRequest request, DataTableResponse<? extends BaseEntity> dataTableResponse, long count) {
        dataTableResponse.setItemsSize(count);
        dataTableResponse.setCurrentPage(request.getCurrentPage());
        dataTableResponse.setCurrentSize(request.getPageSize());
        dataTableResponse.setOrder(request.getOrder());
        dataTableResponse.setSort(request.getSort());
    }
}
