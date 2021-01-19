package com.example.demo.uss.service;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStudent is a Querydsl query type for Student
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStudent extends EntityPathBase<Student> {

    private static final long serialVersionUID = -1677687857L;

    public static final QStudent student = new QStudent("student");

    public final StringPath birthday = createString("birthday");

    public final StringPath gender = createString("gender");

    public final NumberPath<Integer> mgrNum = createNumber("mgrNum", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath profileImage = createString("profileImage");

    public final StringPath regDate = createString("regDate");

    public final NumberPath<Integer> stuNum = createNumber("stuNum", Integer.class);

    public final StringPath userid = createString("userid");

    public QStudent(String variable) {
        super(Student.class, forVariable(variable));
    }

    public QStudent(Path<? extends Student> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStudent(PathMetadata metadata) {
        super(Student.class, metadata);
    }

}

