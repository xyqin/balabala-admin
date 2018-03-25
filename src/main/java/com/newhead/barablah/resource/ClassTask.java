package com.newhead.barablah.resource;

import com.newhead.barablah.CommonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClassTask {

    @Autowired
    private CommonMapper commonMapper;

    @Autowired
    private BarablahClassLessonMapper classLessonMapper;

    @Scheduled(cron = "0 */5 * * * *")
    public void changeClassesStatusToOngoing() {
        //更新课时
        log.debug("task:修改等待班级状态:开始执行任务1,将等待的课时设为进行中.....");

        commonMapper.updateTask1();
        log.debug("task:修改等待班级状态:开始执行任务2,讲进行的课时设为过期.....");
        commonMapper.updateTask2();

        log.debug("task:修改等待班级状态:开始执行任务3,讲进行的课时设为完成.....");

        commonMapper.updateTask3();
        log.debug("task:修改等待班级状态:开始执行任务4,讲待开班的班级设为进行中.....");
//
//        classLessonMapper.updateTask4();
//        log.debug("task:修改等待班级状态:开始执行任务5,讲待进行中的班设为结束.....");
//
//        classLessonMapper.updateTask5();
    }
}
