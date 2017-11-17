package com.nxllxn.codegenerator.jdbc.java;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SqlReservedWords {
    private static Set<String> RESERVED_WORDS;

    static {
        String[] words = new String[]{
                "action", "add", "aggregate", "all",
                "alter", "after", "and", "as",
                "asc", "avg", "avg_row_length", "auto_increment",
                "between", "bigint", "bit", "binary",
                "blob", "bool", "both", "by",
                "cascade", "case", "char", "character",
                "change", "check", "checksum", "column",
                "columns", "comment", "constraint", "create",
                "cross", "current_date", "current_time", "current_timestamp",
                "data", "database", "databases", "date",
                "datetime", "day", "day_hour", "day_minute",
                "day_second", "dayofmonth", "dayofweek", "dayofyear",
                "dec", "decimal", "default", "delayed",
                "delay_key_write", "delete", "desc", "describe",
                "distinct", "distinctrow", "double", "drop",
                "end", "else", "escape", "escaped",
                "enclosed", "enum", "explain", "exists",
                "fields", "file", "first", "float",
                "float4", "float8", "flush", "foreign",
                "from", "for", "full", "function",
                "global", "grant", "grants", "group",
                "having", "heap", "high_priority", "hour",
                "hour_minute", "hour_second", "hosts", "identified",
                "ignore", "in", "index", "infile",
                "inner", "insert", "insert_id", "int",
                "integer", "interval", "int1", "int2",
                "int3", "int4", "int8", "into",
                "if", "is", "isam", "join",
                "key", "keys", "kill", "last_insert_id",
                "leading", "left", "length", "like",
                "lines", "limit", "load", "local",
                "lock", "logs", "long", "longblob",
                "longtext", "low_priority", "max", "max_rows",
                "match", "mediumblob", "mediumtext", "mediumint",
                "middleint", "min_rows", "minute", "minute_second",
                "modify", "month", "monthname", "myisam",
                "natural", "numeric", "no", "not",
                "null", "on", "optimize", "option",
                "optionally", "or", "order", "outer",
                "outfile", "pack_keys", "partial", "password",
                "precision", "primary", "procedure", "process",
                "processlist", "privileges", "read", "real",
                "references", "reload", "regexp", "rename",
                "replace", "restrict", "returns", "revoke",
                "rlike", "row", "rows", "second",
                "select", "set", "show", "shutdown",
                "smallint", "soname", "sql_big_tables", "sql_big_selects",
                "sql_low_priority_updates", "sql_log_off", "sql_log_update", "sql_select_limit",
                "sql_small_result", "sql_big_result", "sql_warnings", "straight_join",
                "starting", "status", "string", "table",
                "tables", "temporary", "terminated", "text",
                "then", "time", "timestamp", "tinyblob",
                "tinytext", "tinyint", "trailing", "to",
                "type", "use", "using", "unique",
                "unlock", "unsigned", "update", "usage",
                "values", "varchar", "variables", "varying",
                "varbinary", "with", "write", "when",
                "where", "year", "year_month", "zerofill",
        };

        RESERVED_WORDS = new HashSet<>(words.length);

        RESERVED_WORDS.addAll(Arrays.asList(words));
    }

    public static boolean containsWord(String word) {
        return !StringUtils.isBlank(word) && RESERVED_WORDS.contains(word);
    }

    private SqlReservedWords() {
    }
}
