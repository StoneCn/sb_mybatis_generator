package com.stone.model;

import sun.awt.SunHints;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "dept")
public class Dept implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.deptId
     *
     * @mbggenerated
     */
    @Column(name = "deptid")
    private Long deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.deptName
     *
     * @mbggenerated
     */
    @Column(name = "deptname")
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dept
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.deptId
     *
     * @return the value of dept.deptId
     *
     * @mbggenerated
     */
    public Long getDeptid() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.deptId
     *
     * @param deptId the value for dept.deptId
     *
     * @mbggenerated
     */
    public void setDeptid(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.deptName
     *
     * @return the value of dept.deptName
     *
     * @mbggenerated
     */
    public String getDeptname() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.deptName
     *
     * @param deptName the value for dept.deptName
     *
     * @mbggenerated
     */
    public void setDeptname(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptId=").append(deptId);
        sb.append(", deptName=").append(deptName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}