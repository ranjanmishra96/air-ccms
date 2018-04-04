package com.test.server.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public enum UniqueConstraintEnum {

	CASETYPE_FULL_NAME("uc_casetype_fullname", "error.uniquecheck.casetype.fullname"), CASETYPE_SHORT_NAME("uc_casetype_shortname",
			"error.uniquecheck.casetype.shortname"), CASETYPE_REPORT_NAME("uc_casetype_reportname", "error.uniquecheck.casetype.reportname"), DOCUMENTTYPE_FULL_NAME(
			"uc_documenttype_fullname", "error.uniquecheck.documenttype.fullname"), DOCUMENTTYPE_SHORT_NAME("uc_documenttype_shortname",
			"error.uniquecheck.documenttype.shortname"), DOCUMENTTYPE_REPORT_NAME("uc_documenttype_reportname",
			"error.uniquecheck.documenttype.reportname"), BENCHTYPE_FULL_NAME("uc_benchtype_fullname",
			"error.uniquecheck.benchtype.fullname"), BENCHTYPE_SHORT_NAME("uc_benchtype_shortname", "error.uniquecheck.benchtype.shortname"), BENCHTYPE_REPORT_NAME(
			"uc_benchtype_reportname", "error.uniquecheck.benchtype.reportname"), NATUREOFCASE_FULL_NAME("uc_natureofcase_fullname",
			"error.uniquecheck.natureofcase.fullname"), NATUREOFCASE_SHORT_NAME("uc_natureofcase_shortname",
			"error.uniquecheck.natureofcase.shortname"), NATUREOFCASE_REPORT_NAME("uc_natureofcase_reportname",
			"error.uniquecheck.natureofcase.reportname"), NATUREOFCASE_FULL_NAME_PARENT("uc_natureofcase_fullname_parentname",
			"error.uniquecheck.natureofcase.fullname"), NATUREOFCASE_SHORT_NAME_PARENT("uc_natureofcase_shortname_parentname",
			"error.uniquecheck.natureofcase.shortname"), NATUREOFCASE_REPORT_NAME_PARENT("uc_natureofcase_reportname_parentname",
			"error.uniquecheck.natureofcase.reportname"), NATUREOFREFERENCE_FULL_NAME("uc_natureofreference_fullname",
			"error.uniquecheck.natureofreference.fullname"), NATUREOFREFERENCE_SHORT_NAME("uc_natureofreference_shortname",
			"error.uniquecheck.natureofreference.shortname"), NATUREOFREFERENCE_REPORT_NAME("uc_natureofreference_reportname",
			"error.uniquecheck.natureofreference.reportname"), HEARINGLOCATION_FULL_NAME("uc_hearinglocation_fullname",
			"error.uniquecheck.hearinglocation.fullname"), HEARINGLOCATION_SHORT_NAME("uc_hearinglocation_shortname",
			"error.uniquecheck.hearinglocation.shortname"), HEARINGLOCATION_REPORT_NAME("uc_hearinglocation_reportname",
			"error.uniquecheck.hearinglocation.reportname"), REPRESENTATIONTYPE_FULL_NAME("uc_representationtype_fullname",
			"error.uniquecheck.representationtype.fullname"), REPRESENTATIONTYPE_SHORT_NAME("uc_representationtype_shortname",
			"error.uniquecheck.representationtype.shortname"), REPRESENTATIONTYPE_REPORT_NAME("uc_representationtype_reportname",
			"error.uniquecheck.representationtype.reportname"), DEPARTMENT_FULL_NAME("uc_department_fullname",
			"error.uniquecheck.department.fullname"), DEPARTMENT_SHORT_NAME("uc_department_shortname",
			"error.uniquecheck.department.shortname"), DEPARTMENT_REPORT_NAME("uc_department_reportname",
			"error.uniquecheck.department.reportname"), DEPARTMENT_FULL_NAME_PARENT("uc_department_fullname_parentname",
			"error.uniquecheck.department.fullname"), DEPARTMENT_SHORT_NAME_PARENT("uc_department_shortname_parentname",
			"error.uniquecheck.department.shortname"), DEPARTMENT_REPORT_NAME_PARENT("uc_department_reportname_parentname",
			"error.uniquecheck.department.reportname"), ADDRESS_TYPE_FULL_NAME("uc_addresstype_fullname",
			"error.uniquecheck.addresstype.fullname"), ADDRESS_TYPE_SHORT_NAME("uc_addresstype_shortname",
			"error.uniquecheck.addresstype.shortname"), ADDRESS_TYPE_REPORT_NAME("uc_addresstype_reportname",
			"error.uniquecheck.addresstype.reportname"), CURRENTSTATUS_FULL_NAME("uc_currentstatus_fullname",
			"error.uniquecheck.currentstatus.fullname"), CURRENTSTATUS_SHORT_NAME("uc_currentstatus_shortname",
			"error.uniquecheck.currentstatus.shortname"), CURRENTSTATUS_REPORT_NAME("uc_currentstatus_reportname",
			"error.uniquecheck.currentstatus.reportname"), CURRENTSTATUS_FULL_NAME_PARENT("uc_currentstatus_fullname_parentname",
			"error.uniquecheck.currentstatus.fullname"), CURRENTSTATUS_SHORT_NAME_PARENT("uc_currentstatus_shortname_parentname",
			"error.uniquecheck.currentstatus.shortname"), CURRENTSTATUS_REPORT_NAME_PARENT("uc_currentstatus_reportname_parentname",
			"error.uniquecheck.currentstatus.reportname"), FILINGMODE_FULL_NAME("uc_filingmode_fullname",
			"error.uniquecheck.filingmode.fullname"), FILINGMODE_SHORT_NAME("uc_filingmode_shortname",
			"error.uniquecheck.filingmode.shortname"), FILINGMODE_REPORT_NAME("uc_filingmode_reportname",
			"error.uniquecheck.filingmode.reportname"), FILINGMODE_FULL_NAME_PARENT("uc_filingmode_fullname_parentname",
			"error.uniquecheck.filingmode.fullname"), FILINGMODE_SHORT_NAME_PARENT("uc_filingmode_shortname_parentname",
			"error.uniquecheck.filingmode.shortname"), FILINGMODE_REPORT_NAME_PARENT("uc_filingmode_reportname_parentname",
			"error.uniquecheck.filingmode.reportname"), RELATION_TYPE_FULL_NAME("uc_relationType_fullname",
			"error.uniquecheck.relationtype.fullname"), RELATION_TYPE_REPORT_NAME("uc_relationType_reportname",
			"error.uniquecheck.relationtype.reportname"), RELATION_TYPE_SHORT_NAME("uc_relationType_shortname",
			"error.uniquecheck.relationtype.shortname"), RELATION_TYPE_FULL_NAME_PARENT("uc_relationType_fullname_parentname",
			"error.uniquecheck.relationtype.fullname"), RELATION_TYPE_REPORT_NAME_PARENT("uc_relationType_reportname_parentname",
			"error.uniquecheck.relationtype.reportname"), RELATION_TYPE_SHORT_NAME_PARENT("uc_relationType_shortname_parentname",
			"error.uniquecheck.relationtype.shortname"), DOC_RELATION_TYPE_FULL_NAME("uc_docRelationType_fullname",
			"error.uniquecheck.docrelationtype.fullname"), DOC_RELATION_TYPE_REPORT_NAME("uc_docRelationType_shortname",
			"error.uniquecheck.docrelationtype.reportname"), DOC_RELATION_TYPE_SHORT_NAME("uc_docRelationType_reportname",
			"error.uniquecheck.docrelationtype.shortname"), PARTY_LEGAL_TYPE_FULL_NAME("uc_partyLegalType_fullname",
			"error.uniquecheck.partylegaltype.fullname"), PARTY_LEGAL_TYPE_REPORT_NAME("uc_partyLegalType_shortname",
			"error.uniquecheck.partylegaltype.shortname"), PARTY_LEGAL_TYPE_SHORT_NAME("uc_partyLegalType_reportname",
			"error.uniquecheck.partylegaltype.reportname"), REGION_FULL_NAME("uc_region_fullname", "error.uniquecheck.region.fullname"), REGION_SHORT_NAME(
			"uc_region_shortname", "error.uniquecheck.region.shortname"), REGION_REPORT_NAME("uc_region_reportname",
			"error.uniquecheck.region.reportname"), REGION_FULL_NAME_PARENT("uc_region_fullname_parentname",
			"error.uniquecheck.region.fullname"), REGION_SHORT_NAME_PARENT("uc_region_shortname_parentname",
			"error.uniquecheck.region.shortname"), REGION_REPORT_NAME_PARENT("uc_region_reportname_parentname",
			"error.uniquecheck.region.reportname"), POLICE_STATION_FULL_NAME("uc_policeStation_fullname",
			"error.uniquecheck.policestation.fullname"), POLICE_STATION_REPORT_NAME("uc_policeStation_shortname",
			"error.uniquecheck.policestation.reportname"), POLICE_STATION_SHORT_NAME("uc_policeStation_reportname",
			"error.uniquecheck.policestation.shortname"), POLICE_STATION_FULL_NAME_PARENT("uc_policeStation_fullname_parentname",
			"error.uniquecheck.policestation.fullname"), POLICE_STATION_REPORT_NAME_PARENT("uc_policeStation_shortname_parentname",
			"error.uniquecheck.policestation.reportname"), POLICE_STATION_SHORT_NAME_PARENT("uc_policeStation_reportname_parentname",
			"error.uniquecheck.policestation.shortname"), SUBJECT_CODE_FULL_NAME("uc_subject_code_fullname",
			"error.uniquecheck.subjectcode.fullname"), SUBJECT_CODE_REPORT_NAME("uc_subject_code_shortname",
			"error.uniquecheck.subjectcode.reportname"), SUBJECT_CODE_SHORT_NAME("uc_subject_code_reportname",
			"error.uniquecheck.subjectcode.shortname"), SUBJECT_CODE_FULL_NAME_PARENT("uc_subject_code_fullname_parentname",
			"error.uniquecheck.subjectcode.fullname"), SUBJECT_CODE_REPORT_NAME_PARENT("uc_subject_code_shortname_parentname",
			"error.uniquecheck.subjectcode.reportname"), SUBJECT_CODE_SHORT_NAME_PARENT("uc_subject_code_reportname_parentname",
			"error.uniquecheck.subjectcode.shortname"), DOCUMENT_FULL_NAME("uc_document_fullname", "error.uniquecheck.document.fullname"), DOCUMENT_REPORT_NAME(
			"uc_document_shortname", "error.uniquecheck.document.reportname"), DOCUMENT_SHORT_NAME("uc_document_reportname",
			"error.uniquecheck.document.shortname"), DOCUMENT_FULL_NAME_PARENT("uc_document_fullname_parentname",
			"error.uniquecheck.document.fullname"), DOCUMENT_REPORT_NAME_PARENT("uc_document_shortname_parentname",
			"error.uniquecheck.document.reportname"), DOCUMENT_SHORT_NAME_PARENT("uc_document_reportname_parentname",
			"error.uniquecheck.document.shortname");
	;

	static Map<String, UniqueConstraintEnum> uniqueConstraintMap = new HashMap<>();

	static {

		uniqueConstraintMap.put(REGION_FULL_NAME.name, REGION_FULL_NAME);
		uniqueConstraintMap.put(REGION_SHORT_NAME.name, REGION_SHORT_NAME);
		uniqueConstraintMap.put(REGION_REPORT_NAME.name, REGION_REPORT_NAME);
		uniqueConstraintMap.put(REGION_FULL_NAME_PARENT.name, REGION_FULL_NAME_PARENT);
		uniqueConstraintMap.put(REGION_SHORT_NAME_PARENT.name, REGION_SHORT_NAME_PARENT);
		uniqueConstraintMap.put(REGION_REPORT_NAME_PARENT.name, REGION_REPORT_NAME_PARENT);

		uniqueConstraintMap.put(FILINGMODE_FULL_NAME.name, FILINGMODE_FULL_NAME);
		uniqueConstraintMap.put(FILINGMODE_SHORT_NAME.name, FILINGMODE_SHORT_NAME);
		uniqueConstraintMap.put(FILINGMODE_REPORT_NAME.name, FILINGMODE_REPORT_NAME);
		uniqueConstraintMap.put(FILINGMODE_FULL_NAME_PARENT.name, FILINGMODE_FULL_NAME_PARENT);
		uniqueConstraintMap.put(FILINGMODE_SHORT_NAME_PARENT.name, FILINGMODE_SHORT_NAME_PARENT);
		uniqueConstraintMap.put(FILINGMODE_REPORT_NAME_PARENT.name, FILINGMODE_REPORT_NAME_PARENT);

		uniqueConstraintMap.put(CURRENTSTATUS_FULL_NAME.name, CURRENTSTATUS_FULL_NAME);
		uniqueConstraintMap.put(CURRENTSTATUS_SHORT_NAME.name, CURRENTSTATUS_SHORT_NAME);
		uniqueConstraintMap.put(CURRENTSTATUS_REPORT_NAME.name, CURRENTSTATUS_REPORT_NAME);
		uniqueConstraintMap.put(CURRENTSTATUS_FULL_NAME_PARENT.name, CURRENTSTATUS_FULL_NAME_PARENT);
		uniqueConstraintMap.put(CURRENTSTATUS_SHORT_NAME_PARENT.name, CURRENTSTATUS_SHORT_NAME_PARENT);
		uniqueConstraintMap.put(CURRENTSTATUS_REPORT_NAME_PARENT.name, CURRENTSTATUS_REPORT_NAME_PARENT);

		uniqueConstraintMap.put(ADDRESS_TYPE_FULL_NAME.name, ADDRESS_TYPE_FULL_NAME);
		uniqueConstraintMap.put(ADDRESS_TYPE_SHORT_NAME.name, ADDRESS_TYPE_SHORT_NAME);
		uniqueConstraintMap.put(ADDRESS_TYPE_REPORT_NAME.name, ADDRESS_TYPE_REPORT_NAME);

		uniqueConstraintMap.put(DEPARTMENT_FULL_NAME.name, DEPARTMENT_FULL_NAME);
		uniqueConstraintMap.put(DEPARTMENT_SHORT_NAME.name, DEPARTMENT_SHORT_NAME);
		uniqueConstraintMap.put(DEPARTMENT_REPORT_NAME.name, DEPARTMENT_REPORT_NAME);
		uniqueConstraintMap.put(DEPARTMENT_FULL_NAME_PARENT.name, DEPARTMENT_FULL_NAME_PARENT);
		uniqueConstraintMap.put(DEPARTMENT_SHORT_NAME_PARENT.name, DEPARTMENT_SHORT_NAME_PARENT);
		uniqueConstraintMap.put(DEPARTMENT_REPORT_NAME_PARENT.name, DEPARTMENT_REPORT_NAME_PARENT);

		uniqueConstraintMap.put(REPRESENTATIONTYPE_FULL_NAME.name, REPRESENTATIONTYPE_FULL_NAME);
		uniqueConstraintMap.put(REPRESENTATIONTYPE_SHORT_NAME.name, REPRESENTATIONTYPE_SHORT_NAME);
		uniqueConstraintMap.put(REPRESENTATIONTYPE_REPORT_NAME.name, REPRESENTATIONTYPE_REPORT_NAME);

		uniqueConstraintMap.put(CASETYPE_FULL_NAME.name, CASETYPE_FULL_NAME);
		uniqueConstraintMap.put(CASETYPE_SHORT_NAME.name, CASETYPE_SHORT_NAME);
		uniqueConstraintMap.put(CASETYPE_REPORT_NAME.name, CASETYPE_REPORT_NAME);

		uniqueConstraintMap.put(DOCUMENTTYPE_FULL_NAME.name, DOCUMENTTYPE_REPORT_NAME);
		uniqueConstraintMap.put(DOCUMENTTYPE_SHORT_NAME.name, DOCUMENTTYPE_REPORT_NAME);
		uniqueConstraintMap.put(DOCUMENTTYPE_REPORT_NAME.name, DOCUMENTTYPE_REPORT_NAME);

		uniqueConstraintMap.put(BENCHTYPE_FULL_NAME.name, BENCHTYPE_FULL_NAME);
		uniqueConstraintMap.put(BENCHTYPE_SHORT_NAME.name, BENCHTYPE_SHORT_NAME);
		uniqueConstraintMap.put(BENCHTYPE_REPORT_NAME.name, BENCHTYPE_REPORT_NAME);

		uniqueConstraintMap.put(NATUREOFCASE_FULL_NAME.name, NATUREOFCASE_FULL_NAME);
		uniqueConstraintMap.put(NATUREOFCASE_SHORT_NAME.name, NATUREOFCASE_SHORT_NAME);
		uniqueConstraintMap.put(NATUREOFCASE_REPORT_NAME.name, NATUREOFCASE_REPORT_NAME);
		uniqueConstraintMap.put(NATUREOFCASE_FULL_NAME_PARENT.name, NATUREOFCASE_FULL_NAME_PARENT);
		uniqueConstraintMap.put(NATUREOFCASE_SHORT_NAME_PARENT.name, NATUREOFCASE_SHORT_NAME_PARENT);
		uniqueConstraintMap.put(NATUREOFCASE_REPORT_NAME_PARENT.name, NATUREOFCASE_REPORT_NAME_PARENT);

		uniqueConstraintMap.put(NATUREOFREFERENCE_FULL_NAME.name, NATUREOFREFERENCE_FULL_NAME);
		uniqueConstraintMap.put(NATUREOFREFERENCE_SHORT_NAME.name, NATUREOFREFERENCE_SHORT_NAME);
		uniqueConstraintMap.put(NATUREOFREFERENCE_REPORT_NAME.name, NATUREOFREFERENCE_REPORT_NAME);

		uniqueConstraintMap.put(HEARINGLOCATION_FULL_NAME.name, HEARINGLOCATION_FULL_NAME);
		uniqueConstraintMap.put(HEARINGLOCATION_SHORT_NAME.name, HEARINGLOCATION_SHORT_NAME);
		uniqueConstraintMap.put(HEARINGLOCATION_REPORT_NAME.name, HEARINGLOCATION_REPORT_NAME);

		uniqueConstraintMap.put(HEARINGLOCATION_FULL_NAME.name, HEARINGLOCATION_FULL_NAME);
		uniqueConstraintMap.put(HEARINGLOCATION_SHORT_NAME.name, HEARINGLOCATION_SHORT_NAME);
		uniqueConstraintMap.put(HEARINGLOCATION_REPORT_NAME.name, HEARINGLOCATION_REPORT_NAME);

		uniqueConstraintMap.put(RELATION_TYPE_FULL_NAME.name, RELATION_TYPE_FULL_NAME);
		uniqueConstraintMap.put(RELATION_TYPE_REPORT_NAME.name, RELATION_TYPE_REPORT_NAME);
		uniqueConstraintMap.put(RELATION_TYPE_SHORT_NAME.name, RELATION_TYPE_SHORT_NAME);
		uniqueConstraintMap.put(RELATION_TYPE_FULL_NAME_PARENT.name, RELATION_TYPE_FULL_NAME_PARENT);
		uniqueConstraintMap.put(RELATION_TYPE_REPORT_NAME_PARENT.name, RELATION_TYPE_REPORT_NAME_PARENT);
		uniqueConstraintMap.put(RELATION_TYPE_SHORT_NAME_PARENT.name, RELATION_TYPE_SHORT_NAME_PARENT);

		uniqueConstraintMap.put(DOC_RELATION_TYPE_FULL_NAME.name, DOC_RELATION_TYPE_FULL_NAME);
		uniqueConstraintMap.put(DOC_RELATION_TYPE_REPORT_NAME.name, DOC_RELATION_TYPE_REPORT_NAME);
		uniqueConstraintMap.put(DOC_RELATION_TYPE_SHORT_NAME.name, DOC_RELATION_TYPE_SHORT_NAME);

		uniqueConstraintMap.put(PARTY_LEGAL_TYPE_FULL_NAME.name, PARTY_LEGAL_TYPE_FULL_NAME);
		uniqueConstraintMap.put(PARTY_LEGAL_TYPE_REPORT_NAME.name, PARTY_LEGAL_TYPE_REPORT_NAME);
		uniqueConstraintMap.put(PARTY_LEGAL_TYPE_SHORT_NAME.name, PARTY_LEGAL_TYPE_SHORT_NAME);

		uniqueConstraintMap.put(POLICE_STATION_FULL_NAME.name, POLICE_STATION_FULL_NAME);
		uniqueConstraintMap.put(POLICE_STATION_REPORT_NAME.name, POLICE_STATION_REPORT_NAME);
		uniqueConstraintMap.put(POLICE_STATION_SHORT_NAME.name, POLICE_STATION_SHORT_NAME);
		uniqueConstraintMap.put(POLICE_STATION_FULL_NAME_PARENT.name, POLICE_STATION_FULL_NAME_PARENT);
		uniqueConstraintMap.put(POLICE_STATION_REPORT_NAME_PARENT.name, POLICE_STATION_REPORT_NAME_PARENT);
		uniqueConstraintMap.put(POLICE_STATION_SHORT_NAME_PARENT.name, POLICE_STATION_SHORT_NAME_PARENT);

		uniqueConstraintMap.put(SUBJECT_CODE_FULL_NAME.name, SUBJECT_CODE_FULL_NAME);
		uniqueConstraintMap.put(SUBJECT_CODE_REPORT_NAME.name, SUBJECT_CODE_REPORT_NAME);
		uniqueConstraintMap.put(SUBJECT_CODE_SHORT_NAME.name, SUBJECT_CODE_SHORT_NAME);
		uniqueConstraintMap.put(SUBJECT_CODE_FULL_NAME_PARENT.name, SUBJECT_CODE_FULL_NAME_PARENT);
		uniqueConstraintMap.put(SUBJECT_CODE_REPORT_NAME_PARENT.name, SUBJECT_CODE_REPORT_NAME_PARENT);
		uniqueConstraintMap.put(SUBJECT_CODE_SHORT_NAME_PARENT.name, SUBJECT_CODE_SHORT_NAME_PARENT);

		uniqueConstraintMap.put(DOCUMENT_FULL_NAME.name, DOCUMENT_FULL_NAME);
		uniqueConstraintMap.put(DOCUMENT_REPORT_NAME.name, DOCUMENT_REPORT_NAME);
		uniqueConstraintMap.put(DOCUMENT_SHORT_NAME.name, DOCUMENT_SHORT_NAME);
		uniqueConstraintMap.put(DOCUMENT_FULL_NAME_PARENT.name, DOCUMENT_FULL_NAME_PARENT);
		uniqueConstraintMap.put(DOCUMENT_REPORT_NAME_PARENT.name, DOCUMENT_REPORT_NAME_PARENT);
		uniqueConstraintMap.put(DOCUMENT_SHORT_NAME_PARENT.name, DOCUMENT_SHORT_NAME_PARENT);

	}

	UniqueConstraintEnum(final String name, final String errorMessage) {
		this.name = name;
		this.errorMessage = errorMessage;
	}

	// Holds the constraint name
	private String name;
	// Holds the error Message # corresponding to property file.
	private String errorMessage;

	/**
	 * @return the constraintName
	 */
	public String getConstraintName() {
		return name;
	}

	/**
	 * @return the constraintErrorMessage
	 */
	public String getConstraintErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param constraintErrorMessage
	 *            the constraintErrorMessage to set
	 */
	public void setConstraintErrorMessage(String constraintErrorMessage) {
		this.errorMessage = constraintErrorMessage;
	}

	public static UniqueConstraintEnum findUniqueConstraintEnum(String constraintName) {
		UniqueConstraintEnum uniqueConstraintEnum = uniqueConstraintMap.get(constraintName);
		if (uniqueConstraintEnum == null) {
			throw new NoSuchElementException("no constraints defined");
		}
		return uniqueConstraintEnum;
	}
}
