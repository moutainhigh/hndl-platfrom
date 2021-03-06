package com.hndl.cn.dao.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * common_report_info
 * @author 
 */
public class CommonReportInfoDo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 是否被删除
     */
    private String isDeleted;

    /**
     * 创建人 (谁评论的)
     */
    private String createOperator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新人
     */
    private String lastOperator;

    /**
     * 最后更新时间
     */
    private Date lastModifyTime;

    /**
     * 举报人的userId
     */
    private Long reportUserId;

    /**
     * 举报内容
     */
    private String reportText;

    /**
     * 被举报的评论ID
     */
    private Long commentId;

    /**
     * 被举报的评论内容
     */
    private Long starId;

    /**
     * 审核状态： ing  提交后正在审核状态 / fail   审核未通过/ok   审核通过
     */
    private String approveState;

    /**
     * 审核回复的内容
     */
    private String auditDesc;

    /**
     * 举报类型：（comment    评论/personal  个人）
     */
    private String type;

    /**
     * 被举报的人的userId
     */
    private Long userId;

    private String bak1;

    private String bak2;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Long getReportUserId() {
        return reportUserId;
    }

    public void setReportUserId(Long reportUserId) {
        this.reportUserId = reportUserId;
    }

    public String getReportText() {
        return reportText;
    }

    public void setReportText(String reportText) {
        this.reportText = reportText;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getStarId() {
        return starId;
    }

    public void setStarId(Long starId) {
        this.starId = starId;
    }

    public String getApproveState() {
        return approveState;
    }

    public void setApproveState(String approveState) {
        this.approveState = approveState;
    }

    public String getAuditDesc() {
        return auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CommonReportInfoDo other = (CommonReportInfoDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getCreateOperator() == null ? other.getCreateOperator() == null : this.getCreateOperator().equals(other.getCreateOperator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastOperator() == null ? other.getLastOperator() == null : this.getLastOperator().equals(other.getLastOperator()))
            && (this.getLastModifyTime() == null ? other.getLastModifyTime() == null : this.getLastModifyTime().equals(other.getLastModifyTime()))
            && (this.getReportUserId() == null ? other.getReportUserId() == null : this.getReportUserId().equals(other.getReportUserId()))
            && (this.getReportText() == null ? other.getReportText() == null : this.getReportText().equals(other.getReportText()))
            && (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getStarId() == null ? other.getStarId() == null : this.getStarId().equals(other.getStarId()))
            && (this.getApproveState() == null ? other.getApproveState() == null : this.getApproveState().equals(other.getApproveState()))
            && (this.getAuditDesc() == null ? other.getAuditDesc() == null : this.getAuditDesc().equals(other.getAuditDesc()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBak1() == null ? other.getBak1() == null : this.getBak1().equals(other.getBak1()))
            && (this.getBak2() == null ? other.getBak2() == null : this.getBak2().equals(other.getBak2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getCreateOperator() == null) ? 0 : getCreateOperator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastOperator() == null) ? 0 : getLastOperator().hashCode());
        result = prime * result + ((getLastModifyTime() == null) ? 0 : getLastModifyTime().hashCode());
        result = prime * result + ((getReportUserId() == null) ? 0 : getReportUserId().hashCode());
        result = prime * result + ((getReportText() == null) ? 0 : getReportText().hashCode());
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getStarId() == null) ? 0 : getStarId().hashCode());
        result = prime * result + ((getApproveState() == null) ? 0 : getApproveState().hashCode());
        result = prime * result + ((getAuditDesc() == null) ? 0 : getAuditDesc().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBak1() == null) ? 0 : getBak1().hashCode());
        result = prime * result + ((getBak2() == null) ? 0 : getBak2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createOperator=").append(createOperator);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastOperator=").append(lastOperator);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", reportUserId=").append(reportUserId);
        sb.append(", reportText=").append(reportText);
        sb.append(", commentId=").append(commentId);
        sb.append(", starId=").append(starId);
        sb.append(", approveState=").append(approveState);
        sb.append(", auditDesc=").append(auditDesc);
        sb.append(", type=").append(type);
        sb.append(", userId=").append(userId);
        sb.append(", bak1=").append(bak1);
        sb.append(", bak2=").append(bak2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}