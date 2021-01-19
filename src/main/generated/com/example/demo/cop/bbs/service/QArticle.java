package com.example.demo.cop.bbs.service;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QArticle is a Querydsl query type for Article
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArticle extends EntityPathBase<Article> {

    private static final long serialVersionUID = -667217218L;

    public static final QArticle article = new QArticle("article");

    public final NumberPath<Integer> artNum = createNumber("artNum", Integer.class);

    public final StringPath content = createString("content");

    public final StringPath count = createString("count");

    public final StringPath title = createString("title");

    public final StringPath writerNum = createString("writerNum");

    public QArticle(String variable) {
        super(Article.class, forVariable(variable));
    }

    public QArticle(Path<? extends Article> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticle(PathMetadata metadata) {
        super(Article.class, metadata);
    }

}

