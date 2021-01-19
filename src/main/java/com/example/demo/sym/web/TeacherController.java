package com.example.demo.sym.web;
import java.util.Map;
import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cmm.utl.Box;
import com.example.demo.sts.service.SubjectRepository;
import com.example.demo.sym.service.Teacher;
import com.example.demo.sym.service.TeacherRepository;
import com.example.demo.sym.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired TeacherService teacherService;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired Box<String> bx;
    

    @PostMapping("")
    public Messenger register(@RequestBody Teacher teacher) {
        teacherRepository.save(teacher);
        return Messenger.SUCCESS;
    }
    
    @PostMapping("/access")
    public Optional<Teacher> access(@RequestBody Teacher teacher) {
    	// teacherRepository.findById(teacher.getTeaNum());
        return null;
    }
    /**
     * 해당 교강사가 담당하는 과목의 최근 시험결과에 따른 결과반환
     * 
     * */
    @GetMapping("/page/{pageSize}/{pageNum}/subject/{subNum}/{examDate}")
    public Map<?,?> selectAllBySubject(
    		@PathVariable String pageSize, 
			@PathVariable String pageNum,
    		@PathVariable String subNum,
    		@PathVariable String examDate){
    	logger.info(" selectAllBySubject Executed ...");
    	bx.put("pageSize", pageSize);
    	bx.put("pageNum", pageNum);
    	bx.put("subNum", subNum);
    	bx.put("examDate", examDate);
    	teacherService.selectAllBySubject(bx);
    	
    	return null;
    }
  
} 
