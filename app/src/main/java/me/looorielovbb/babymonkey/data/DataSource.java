package me.looorielovbb.babymonkey.data;

public interface DataSource {
    interface LoadTasksCallback {
        void onDataNotAvailable();
    }

    interface GetTaskCallback {

    }
}
