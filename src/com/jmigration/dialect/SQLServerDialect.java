package com.jmigration.dialect;

import java.sql.Types;

import com.jmigration.MigrationSession;

public class SQLServerDialect extends BaseDialect {
	
	public SQLServerDialect() {
		types.put(Types.VARCHAR, "VARCHAR");
		types.put(Types.NUMERIC, "NUMERIC");
		types.put(Types.DATE, "DATE");
		types.put(Types.TIMESTAMP, "DATETIME");
	}

	@Override
	public String addPrimaryKeyClause(MigrationSession session, String sequenceName) {
		return super.addPrimaryKeyClause(session, sequenceName) + " identity";
	}

}