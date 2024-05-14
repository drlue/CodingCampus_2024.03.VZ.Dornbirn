package lukas.week11.SqlAndOopV2.dbManager;

import java.sql.ResultSet;

public interface IQueryProcessor {
    void process(ResultSet rs);
}
