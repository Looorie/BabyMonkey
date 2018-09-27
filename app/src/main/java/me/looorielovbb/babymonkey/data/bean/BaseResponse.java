package me.looorielovbb.babymonkey.data.bean;

import java.util.List;

public class BaseResponse<T> {

    /**
     * error : false
     * results : []
     */

    private boolean error;
    private List<T> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<?> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
