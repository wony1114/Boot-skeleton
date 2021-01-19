package com.example.demo.sts.service;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSubject is a Querydsl query type for Subject
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSubject extends EntityPathBase<Subject> {

    private static final long serialVersionUID = -974555811L;

    public static final QSubject subject1 = new QSubject("subject1");

    public final StringPath description = createString("description");

    public final StringPath subject = createString("subject");

    public final NumberPath<Integer> subNum = createNumber("subNum", Integer.class);

    public QSubject(String variable) {
        super(Subject.class, forVariable(variable));
    }

    public QSubject(Path<? extends Subject> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubject(PathMetadata metadata) {
        super(Subject.class, metadata);
    }

}

