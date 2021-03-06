package com.newhead.rudderframework.tools.generator.plugin;

import com.newhead.rudderframework.tools.generator.fields.BaseField;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.util.StringUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 *
 */
public class RudderGeneratorComment extends org.mybatis.generator.internal.DefaultCommentGenerator {
    private Properties properties = new Properties();
    private boolean suppressDate = false;
    private boolean suppressAllComments = false;
    private boolean addRemarkComments = false;

    public RudderGeneratorComment() {
    }

    public void addJavaFileComment(CompilationUnit compilationUnit) {
    }

    public void addComment(XmlElement xmlElement) {
        if(!this.suppressAllComments) {
            xmlElement.addElement(new TextElement("<!--"));
            StringBuilder sb = new StringBuilder();
            sb.append("  WARNING - ");
            sb.append("@mbggenerated");
            xmlElement.addElement(new TextElement(sb.toString()));
            xmlElement.addElement(new TextElement("  This element is automatically generated by MyBatis Generator, do not modify."));
            String s = this.getDateString();
            if(s != null) {
                sb.setLength(0);
                sb.append("  This element was generated on ");
                sb.append(s);
                sb.append('.');
                xmlElement.addElement(new TextElement(sb.toString()));
            }

            xmlElement.addElement(new TextElement("-->"));
        }
    }

    public void addRootComment(XmlElement rootElement) {
        
    }

    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
        this.suppressDate = StringUtility.isTrue(properties.getProperty("suppressDate"));
        this.suppressAllComments = StringUtility.isTrue(properties.getProperty("suppressAllComments"));
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
    }

    protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append("@generated");
        if(markAsDoNotDelete) {
            sb.append(" do_not_delete_during_merge");
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy年M月d日 hh:mm:ss");
        String s = format.format(new Date());
        if(s != null) {
            sb.append(" ");
            sb.append(s);
        }
        javaElement.addJavaDocLine(sb.toString());
    }

    protected String getDateString() {
        return this.suppressDate?null:(new Date()).toString();
    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if(!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerClass.addJavaDocLine("/**");
            innerClass.addJavaDocLine(" * This class was generated by MyBatis Generator.");
            sb.append(" * This class corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerClass, false);
            innerClass.addJavaDocLine(" */");
        }
    }

    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if(!this.suppressAllComments && this.addRemarkComments) {
            StringBuilder sb = new StringBuilder();
            topLevelClass.addJavaDocLine("/**");
            String remarks = introspectedTable.getRemarks();
            if(this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
                topLevelClass.addJavaDocLine(" * Database Table Remarks:");
                String[] remarkLines = remarks.split(System.getProperty("line.separator"));
                String[] arr$ = remarkLines;
                int len$ = remarkLines.length;

                for(int i$ = 0; i$ < len$; ++i$) {
                    String remarkLine = arr$[i$];
                    topLevelClass.addJavaDocLine(" *   " + remarkLine);
                }
            }

            topLevelClass.addJavaDocLine(" *");
            topLevelClass.addJavaDocLine(" * RudderFramework框架自动生成，不允许修改！");
            sb.append(" * 表 ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            topLevelClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(topLevelClass, true);
            topLevelClass.addJavaDocLine(" */");
        }
    }

    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
        if(!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerEnum.addJavaDocLine("/**");
            innerEnum.addJavaDocLine(" * This EnumBuilder was generated by MyBatis Generator.");
            sb.append(" * This EnumBuilder corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerEnum.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerEnum, false);
            innerEnum.addJavaDocLine(" */");
        }
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if(!this.suppressAllComments) {
            field.addJavaDocLine("/**");
//            String remarks = introspectedColumn.getRemarks();
//            if(this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
//                field.addJavaDocLine(" * Database Column Remarks:");
//                String[] sb = remarks.split(System.getProperty("line.separator"));
//                String[] arr$ = sb;
//                int len$ = sb.length;
//
//                for(int i$ = 0; i$ < len$; ++i$) {
//                    String remarkLine = arr$[i$];
//                    field.addJavaDocLine(" *   " + remarkLine);
//                }
//            }

            field.addJavaDocLine(" *");
            field.addJavaDocLine(" * "+introspectedColumn.getRemarks());
            this.addJavadocTag(field, false);
            field.addJavaDocLine(" */");
        }
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        if(!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            field.addJavaDocLine("/**");
            field.addJavaDocLine(" * RudderFramework框架生成代码，请不要直接修改.");
            field.addJavaDocLine(" * "+introspectedTable.getRemarks());

            sb.append(" * This field corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            field.addJavaDocLine(sb.toString());
            this.addJavadocTag(field, false);
            field.addJavaDocLine(" */");
        }
    }

    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        if(!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            method.addJavaDocLine("/**");
            method.addJavaDocLine(" *  RudderFramework框架生成代码，请不要直接修改..");
            sb.append(" *  ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            method.addJavaDocLine(sb.toString());
            this.addJavadocTag(method, false);
            method.addJavaDocLine(" */");
        }
    }

    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        BaseField field = BaseField.newBuild(introspectedColumn.getJavaProperty(), remarks, introspectedColumn.getFullyQualifiedJavaType().getShortName());
        if(!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            method.addJavaDocLine("/**");
            sb.append(" * 返回 ");
            sb.append(introspectedColumn.getActualColumnName());
            sb.append(" ");
            sb.append(field.getDesc());
            method.addJavaDocLine(sb.toString());
            method.addBodyLine("");
            this.addJavadocTag(method, false);
            method.addJavaDocLine(" */");
        }
    }

    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if(!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            method.addJavaDocLine("/**");
            sb.append(" * 设置");
            String remarks = introspectedColumn.getRemarks();
            BaseField field = BaseField.newBuild(introspectedColumn.getJavaProperty(), remarks, introspectedColumn.getFullyQualifiedJavaType().getShortName());
            if (field==null) return;
            sb.append(field.getDesc());
            method.addJavaDocLine(sb.toString());
            method.addJavaDocLine(" *");
            sb= new StringBuilder();
            sb.append(" * @param ");
            sb.append(method.getParameters().get(0).getName());
            method.addJavaDocLine(sb.toString());
            this.addJavadocTag(method, false);
            method.addJavaDocLine(" */");
        }
    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        if(!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerClass.addJavaDocLine("/**");
            innerClass.addJavaDocLine(" * RudderFramework Util 生成.");
            sb.append(" * 根据数据库表 ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerClass, markAsDoNotDelete);
            innerClass.addJavaDocLine(" */");
        }
    }
}
