package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("Hibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String find() {
        return "Hibernate";
    }
}
