有两种commitlog同步方式:
batch    批量同步，  对应类名: org.apache.cassandra.db.commitlog.BatchCommitLogExecutorService
periodic 周期性同步，对应类名: org.apache.cassandra.db.commitlog.PeriodicCommitLogExecutorService

可在cassandra.yaml中通过"commitlog_sync"参数设置

默认使用periodic
