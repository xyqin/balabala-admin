package com.newhead.rudderframework.tools.generator.v1;

import com.newhead.rudderframework.tools.generator.fields.Project;

import java.io.IOException;
import java.util.List;

/**
 * Created by ling on 2017/4/25.
 */
public interface Builder {
    public void toBuild(List<Project> projectList) throws IOException;
}
