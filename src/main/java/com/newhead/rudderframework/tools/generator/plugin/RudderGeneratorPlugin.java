package com.newhead.rudderframework.tools.generator.plugin;

import com.alibaba.fastjson.JSON;
import com.newhead.rudderframework.tools.generator.fields.*;
import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.io.IOException;
import java.util.List;

/**
 * 
 */
public class RudderGeneratorPlugin extends PluginAdapter {
    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {

        String remarks = introspectedColumn.getRemarks();
        BaseField bf = BaseField.newBuild(introspectedColumn.getJavaProperty(),remarks,introspectedColumn.getFullyQualifiedJavaType().getShortName());
        if (bf==null) return false;
        if (!bf.isVisible()) {
            //加上保留域注解
            field.addAnnotation("@JSONField(serialize=false)");
        } else {
            //是否校验
            if (bf.isValid()) {
                //字符串校验
                if (introspectedColumn.isStringColumn()) {
                    if (!introspectedColumn.isNullable()) {
                        field.addAnnotation("@NotEmpty(message=\""+bf.getDesc()+"不能为空\")");
                    }
                    int maxSize = bf.getLength();
                    field.addAnnotation("@Size(max="+maxSize+",message = \""+bf.getDesc()+"长度无效\")\n");
                } else if (bf.getFieldType().equals(FieldTypeEnum.Enum.name())) {
                    //TODO 枚举校验
                }
            }
        }
        return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.addImportedType("com.newhead.rudderframework.core.domain.AuditableEntity");
        topLevelClass.addImportedType("com.alibaba.fastjson.annotation.JSONField");
        topLevelClass.addImportedType("javax.validation.constraints.NotNull");
        topLevelClass.addImportedType("org.hibernate.validator.constraints.NotEmpty");
        topLevelClass.addImportedType("javax.validation.constraints.Size");
        topLevelClass.addSuperInterface(new FullyQualifiedJavaType("AuditableEntity"));
        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String tableName = introspectedTable.getFullyQualifiedTable().getIntrospectedTableName();
        if (!tableName.contains("sc") && !tableName.contains("rudder")) return false;
        Field field = new Field();
        field.setName("startRow");
        field.setType(FullyQualifiedJavaType.getIntInstance());
        field.setVisibility(JavaVisibility.PRIVATE);
        topLevelClass.addField(field);

        Field field2 = new Field();
        field2.setName("pageSize");
        field2.setType(FullyQualifiedJavaType.getIntInstance());
        field2.setVisibility(JavaVisibility.PRIVATE);
        topLevelClass.addField(field2);

        Method m1set = new Method();
        m1set.setVisibility(JavaVisibility.PUBLIC);
        m1set.setName("setStartRow");
        m1set.addParameter(new Parameter(FullyQualifiedJavaType.getIntInstance(),"startRow"));
        m1set.addBodyLine("this.startRow = startRow;");
        m1set.setReturnType(null);
        topLevelClass.addMethod(m1set);

        Method m2set = new Method();
        m2set.setVisibility(JavaVisibility.PUBLIC);
        m2set.setName("setPageSize");
        m2set.addParameter(new Parameter(FullyQualifiedJavaType.getIntInstance(),"pageSize"));
        m2set.addBodyLine("this.pageSize = pageSize;");
        m2set.setReturnType(null);
        topLevelClass.addMethod(m2set);


        Method m1get = new Method();
        m1get.setVisibility(JavaVisibility.PUBLIC);
        m1get.setName("getStartRow");
        m1get.addBodyLine("return this.startRow;");
        m1get.setReturnType(FullyQualifiedJavaType.getIntInstance());
        topLevelClass.addMethod(m1get);

        Method m2get = new Method();
        m2get.setVisibility(JavaVisibility.PUBLIC);
        m2get.setName("getPageSize");
        m2get.addBodyLine("return this.pageSize;");
        m2get.setReturnType(FullyQualifiedJavaType.getIntInstance());
        topLevelClass.addMethod(m2get);

        return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        String tableName = introspectedTable.getFullyQualifiedTable().getIntrospectedTableName();
        if (!tableName.contains("sc") && !tableName.contains("rudder")) return false;
        element.addElement(new Element() {
            @Override
            public String getFormattedContent(int i) {
                return "<if test=\"startRow != null and pageSize != null and pageSize != 0\">\n" +
                        "                    limit #{startRow},#{pageSize}\n" +
                        "</if>";
            }
        });
        return super.sqlMapSelectByExampleWithBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        String tableName = introspectedTable.getFullyQualifiedTable().getIntrospectedTableName();
        if (!tableName.contains("sc") && !tableName.contains("rudder")) return false;
        element.addElement(new Element() {
            @Override
            public String getFormattedContent(int i) {
                return "<if test=\"startRow != null and pageSize != null and pageSize != 0\">\n" +
                        "                    limit #{startRow},#{pageSize}\n" +
                        "</if>";
            }
        });
       return super.sqlMapSelectByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        interfaze.addAnnotation("@Mapper");
        interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper"));
        return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
    }

    //@Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
        String tableName = introspectedTable.getFullyQualifiedTable().getIntrospectedTableName();
        Project project = null;
        if (tableName.contains("sc")) {
            project = Project.getProject("sc");
        } else {
            project = Project.getProject("rudderframework");
        }
        Module m = project.getMoudle(introspectedTable.getFullyQualifiedTable().getDomainObjectName());
        List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
        for(IntrospectedColumn column:columns) {
            BaseField field = BaseField.newBuild(column.getJavaProperty(), column.getRemarks(),column.getFullyQualifiedJavaType().getShortName());
            if (field instanceof IdField) {
                if (column.getRemarks().contains("refs")) {
                    RefObjField f = JSON.parseObject(column.getRemarks(),RefObjField.class);
                    if (f!=null && f.getRefs()!=null && f.getRefs().size()>0)
                        m.setRefs(f.getRefs());
                }
            }
            m.addField(field);
        }
        return null;
    }

    /**
     * This plugin is always valid - no properties are required
     */
    public boolean validate(List<String> warnings) {
        return true;
    }

    /**
     * service方法生成
     * @param introspectedTable
     * @return
     */
    private boolean additionaljavaGenerated(IntrospectedTable introspectedTable) throws IOException {

        return true;
    }

}
