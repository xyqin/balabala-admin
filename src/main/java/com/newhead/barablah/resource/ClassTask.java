package com.newhead.barablah.resource;

import com.newhead.barablah.modules.barablahclass.BarablahClassStatusEnum;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahclasslesson.BarablahClassLessonTypeEnum;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLessonExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class ClassTask {

    @Autowired
    private BarablahClassMapper classMapper;

    @Autowired
    private BarablahClassLessonMapper classLessonMapper;

    @Scheduled(cron = "0 */5 * * * *")
    public void changeClassesStatusToOngoing() {
        log.debug("task:修改等待班级状态:开始执行.....");
        List<BarablahClass> classes = getClassesByStatusLimit(BarablahClassStatusEnum.待开课.getValue(), 100);

        for (BarablahClass aClass : classes) {
            BarablahClassLessonExample example = new BarablahClassLessonExample();
            example.createCriteria()
                    .andClassIdEqualTo(aClass.getId())
                    .andTypeEqualTo(BarablahClassLessonTypeEnum.线上.getValue())
                    .andStartAtLessThanOrEqualTo(new Date())
                    .andDeletedEqualTo(Boolean.FALSE);
            List<BarablahClassLesson> startedLessons = classLessonMapper.selectByExample(example);
            log.debug("task:修改等待班级状态:已开始课时数量, classId={}, num={}", aClass.getId(), startedLessons.size());

            // 只要有一个或以上已开始课时，则修改为已开课状态
            if (!startedLessons.isEmpty()) {
                changeClassStatusTo(aClass, BarablahClassStatusEnum.已开课.getValue());
                log.debug("task:修改等待班级状态:修改班级状态为已开课, classId={}", aClass.getId());
            }
        }
        log.debug("task:修改等待班级状态:执行结束.");
    }

    @Scheduled(cron = "30 */5 * * * *")
    public void changeClassesStatusToFinished() {
        log.debug("task:修改已开课班级状态:开始执行...");
        List<BarablahClass> classes = getClassesByStatusLimit(BarablahClassStatusEnum.已开课.getValue(), 100);

        for (BarablahClass aClass : classes) {
            BarablahClassLessonExample example = new BarablahClassLessonExample();
            example.createCriteria()
                    .andClassIdEqualTo(aClass.getId())
                    .andTypeEqualTo(BarablahClassLessonTypeEnum.线上.getValue())
                    .andEndAtGreaterThan(new Date())
                    .andDeletedEqualTo(Boolean.FALSE);
            List<BarablahClassLesson> waitingLessons = classLessonMapper.selectByExample(example);
            log.debug("task:修改已开课班级状态:等待课时数量, classId={}, num={}", aClass.getId(), waitingLessons.size());

            // 等待课时
            if (waitingLessons.isEmpty()) {
                changeClassStatusTo(aClass, BarablahClassStatusEnum.已结束.getValue());
                log.debug("task:修改已开课班级状态:修改班级状态为已结束, classId={}", aClass.getId());
            }
        }
        log.debug("task:修改已开课班级状态:执行结束.");
    }

    private List<BarablahClass> getClassesByStatusLimit(String status, int limit) {
        BarablahClassExample example = new BarablahClassExample();
        example.createCriteria()
                .andStatusEqualTo(status)
                .andDeletedEqualTo(Boolean.FALSE);
        example.setStartRow(0);
        example.setPageSize(limit);
        return classMapper.selectByExample(example);
    }

    private void changeClassStatusTo(BarablahClass aClass, String status) {
        BarablahClass classToBeUpdated = new BarablahClass();
        classToBeUpdated.setId(aClass.getId());
        classToBeUpdated.setStatus(status);
        classMapper.updateByPrimaryKeySelective(classToBeUpdated);
    }

}
