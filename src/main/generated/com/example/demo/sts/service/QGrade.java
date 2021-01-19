package com.example.demo.sts.service;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGrade is a Querydsl query type for Grade
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGrade extends EntityPathBase<Grade> {

    private static final long serialVersionUID = -602130360L;

    public static final QGrade grade1 = new QGrade("grade1");

    public final StringPath examDate = createString("examDate");

    public final StringPath grade = createString("grade");

    public final NumberPath<Integer> grdNum = createNumber("grdNum", Integer.class);

    public final StringPath passExam = createString("passExam");

    public final NumberPath<Integer> score = createNumber("score", Integer.class);

    public final NumberPath<Integer> stuNum = createNumber("stuNum", Integer.class);

    public final NumberPath<Integer> subNum = createNumber("subNum", Integer.class);

    public QGrade(String variable) {
        super(Grade.class, forVariable(variable));
    }

    public QGrade(Path<? extends Grade> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGrade(PathMetadata metadata) {
        super(Grade.class, metadata);
    }

}

