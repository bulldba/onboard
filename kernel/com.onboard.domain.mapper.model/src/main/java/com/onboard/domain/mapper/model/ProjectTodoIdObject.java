/*******************************************************************************
 * Copyright [2015] [Onboard team of SERC, Peking University]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.onboard.domain.mapper.model;

import com.onboard.domain.mapper.model.common.BaseItem;

public class ProjectTodoIdObject implements BaseItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_todo_id.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_todo_id.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_todo_id.todoId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer todoId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_todo_id.id
     *
     * @return the value of project_todo_id.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_todo_id.id
     *
     * @param id the value for project_todo_id.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_todo_id.projectId
     *
     * @return the value of project_todo_id.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_todo_id.projectId
     *
     * @param projectId the value for project_todo_id.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_todo_id.todoId
     *
     * @return the value of project_todo_id.todoId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getTodoId() {
        return todoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_todo_id.todoId
     *
     * @param todoId the value for project_todo_id.todoId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_todo_id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public ProjectTodoIdObject(ProjectTodoIdObject parent) {
        this.id = parent.getId();
        this.projectId = parent.getProjectId();
        this.todoId = parent.getTodoId();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_todo_id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public ProjectTodoIdObject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_todo_id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public ProjectTodoIdObject(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_todo_id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    @Override
    public ProjectTodoIdObject copy() {
        return new ProjectTodoIdObject(this);
    }
}