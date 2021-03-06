package com.jmigration;

import com.jmigration.core.AlterTable;
import com.jmigration.core.Column;
import com.jmigration.core.CreateIndex;
import com.jmigration.core.CreateTable;
import com.jmigration.core.DropIndex;
import com.jmigration.core.DropTable;
import com.jmigration.core.ExecuteSQL;
import com.jmigration.core.ForeignKey;
import com.jmigration.core.PrimaryKey;
import com.jmigration.core.PrimaryKeyColumn;
import com.jmigration.core.UniqueKey;

public abstract class Migration {
	
	public static CreateTable createTable(String tableName) {
		return new CreateTable(tableName);
	}
	
	public static CreateIndex createIndex(String indexName) {
		return new CreateIndex(indexName);
	}
	
	public static DropIndex dropIndex(String indexName) {
		return new DropIndex(indexName);
	}
	
	public static DropTable dropTable(String tableName) {
		return new DropTable(tableName);
	}

	public abstract void parse(MigrationSession	session);

	public static AlterTable alterTable(String tableToAlter) {
		return new AlterTable(tableToAlter);
	}
	
	@SuppressWarnings("rawtypes")
	public static Column<?> column(String columnName) {
		return new Column(columnName);
	}
	
	public static PrimaryKeyColumn primaryKeyColumn(String columnName) {
		return new PrimaryKeyColumn(columnName);
	}
	
	public static ForeignKey foreignKey(String fkName) {
		return new ForeignKey(fkName);
	}
	
	public static ForeignKey foreignKey() {
		return new ForeignKey();
	}
	
	public static PrimaryKey primaryKey(String pkName) {
		return new PrimaryKey(pkName);
	}

	public static PrimaryKey primaryKey() {
		return new PrimaryKey();
	}
	
	public static UniqueKey uniqueKey() {
		return new UniqueKey();
	}
	
	public static UniqueKey uniqueKey(String ukName) {
		return new UniqueKey(ukName);
	}
	
	public static ExecuteSQL executeSQL(String sqlCommand) {
		return new ExecuteSQL(sqlCommand);
	}
	
	
	
}
