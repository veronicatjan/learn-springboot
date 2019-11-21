package com.sucsoft.vero.courseapidata.topic;

//This is the class that we need to turn into entity

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Topic")
@ApiModel("话题 - Topic")
public class Topic {

    //For primary keys annotate with @Id
    @Id
    @ApiModelProperty("主键")
    @Column(name = "ID", columnDefinition = ("varchar(64) COMMENT '主键"))
    private String id;

    @ApiModelProperty("话题名称")
    @Column(name = "NAME", columnDefinition = ("varchar(255) default null COMMENT '话题名称'"))
    private String name;

    @ApiModelProperty("话题描述")
    @Column(name = "DESCRIPTION", columnDefinition = ("varchar(255) default null COMMENT '话题描述'"))
    private String description;

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
