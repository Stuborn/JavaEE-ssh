package cn.edu.zjut.dao;

import cn.edu.zjut.po.AccountEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AccountDAO extends BaseHibernateDAO implements IAccountDAO {
    private Log log = LogFactory.getLog(AccountDAO.class);

    /**
     * insert account表
     *
     * @param transientInstance 要insert的account
     */
    public void save(AccountEntity transientInstance) {
        Transaction tran = null;
        try (Session session = getSession()) {
            tran = session.beginTransaction();
            session.save(transientInstance);
            tran.commit();
        }
    }

    /**
     * select account表，用于登录
     *
     * @param account 要select的account，通过id和password
     * @return 查询结果
     */
    public List findByAccount(AccountEntity account) {
        log.debug("finding Customer instance by Account");
        try {
            String hql = "from AccountEntity where userId='" + account.getUserId() + "' and userPassword='" + account.getUserPassword() + "'";
            Query queryObject = getSession().createQuery(hql);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by Account failed", re);
            throw re;
        }
    }
}