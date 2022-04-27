package ru.aberezhnoy.dao.cart;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.aberezhnoy.entity.Cart;

//@Component
@RequiredArgsConstructor
public class HibernateCartDao implements CartDao {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public Cart save(Cart cart) {
        sessionFactory.getCurrentSession().saveOrUpdate(cart);
        return cart;
    }
}
