package bean;

import java.util.List;

public class DataResponse extends BaseResponse {
    private List<?> data;

    public DataResponse() {
        super();
    }

    public DataResponse(String message) {
        super(message);
    }

    public DataResponse (List<?> data) {
        this.data = data;
    }

    public DataResponse(Integer code) {
        super(code);
    }

    public DataResponse(Integer code, String message) {
        super(code, message);
    }

    public DataResponse setData(List<?> data) {
        this.data = data;
        return this;
    }

    public List<?> getData() {
        return data;
    }
}
