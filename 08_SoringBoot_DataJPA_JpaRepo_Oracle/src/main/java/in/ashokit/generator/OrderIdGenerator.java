package in.ashokit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		String prefix = "OD";
        String suffix = "";

        try {
            // Use the session.doReturningWork method to fetch the sequence value
            Integer seqval = session.doReturningWork(connection -> {
                try (Statement statement = connection.createStatement()) {
                    String sql = "SELECT PRODUCT_SEQ.NEXTVAL FROM DUAL";
                    ResultSet rs = statement.executeQuery(sql);
                    if (rs.next()) {
                        return rs.getInt(1); // Return the sequence value
                    }
                }
                return null;
            });

            if (seqval != null) {
                suffix = String.valueOf(seqval);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error generating custom ID", e);
        }
		return prefix+suffix;
    }

}
