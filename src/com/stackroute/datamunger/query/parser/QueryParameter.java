package com.stackroute.datamunger.query.parser;

import java.util.ArrayList;
import java.util.List;

/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */

public class QueryParameter {
	private String baseQuery;
	private String fileName;
	private List<String> orderByFields = new ArrayList<String>();
	private List<String> groupByFields = new ArrayList<String>();
	private List<String> fields = new ArrayList<String>();
	private List<String> logicalOperators = new ArrayList<String>();
	private List<AggregateFunction> aggregateFunctions = new ArrayList<AggregateFunction>();
	private List<Restriction> restriction =new ArrayList<Restriction>();

	public String getFileName() {
		return fileName;
	}

	public String getBaseQuery() {
		return baseQuery;
	}

	public List<Restriction> getRestrictions() {
		return restriction;
	}

	public List<String> getLogicalOperators() {
		return logicalOperators;
	}

	public List<String> getFields() {
		return fields;
	}

	public List<AggregateFunction> getAggregateFunctions() {
		return aggregateFunctions;
	}
	
	public void setRestrictions(List<Restriction> restriction) {
		this.restriction = restriction;
	}

	public List<String> getGroupByFields() {
		return groupByFields;
	}

	public List<String> getOrderByFields() {
		return orderByFields;
	}

	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}

	public void setGroupByFields(List<String> groupByFields) {
		this.groupByFields = groupByFields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}

	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		this.aggregateFunctions = aggregateFunctions;
	}

	
}