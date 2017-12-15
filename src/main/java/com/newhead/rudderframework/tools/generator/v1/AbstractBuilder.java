package com.newhead.rudderframework.tools.generator.v1;

import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.Project;

import java.io.*;
import java.util.List;

/**
 * Created by ling on 2017/4/24.
 */
public abstract class AbstractBuilder implements Builder {

    protected abstract String getOutpath();

    protected abstract String getTemplatePath();

    public abstract void toBuild(List<Project> project) throws IOException;

    /**
     * 是否覆盖
     * @return
     */
    protected abstract boolean isOverride();

    /**
     *
     * @param outfile
     * @param parames
     * @param templateFile
     * @throws IOException
     */
    protected void togen(String outfile,Object parames,String templateFile) throws IOException {
        File file = new File(outfile);
        if (!file.getParentFile().exists()) {file.getParentFile().mkdirs();}
        if (!isOverride()) return;
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            TemplateGenerator.generator(getTemplatePath(), templateFile, parames, os);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

}
