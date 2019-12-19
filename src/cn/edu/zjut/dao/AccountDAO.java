package cn.edu.zjut.dao;

import cn.edu.zjut.po.Account;
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
     * @param transientInstance 要insert的account
     */
    public void save(Account transientInstance) {
        Transaction tran = null;
        try (Session session = getSession()) {
            tran = session.beginTransaction();
            session.save(transientInstance);
            tran.commit();
        } catch (RuntimeException re) {
            if (tran != null) tran.rollback();
            throw re;
        }
    }

    /**
     * select account表，用于登录
     * @param account 要select的account，通过id和password
     * @return 查询结果
     */
    public List findByAccount(Account account) {
        log.debug("finding Customer instance by Account");
        try {
            String hql = "from Account where id='" + account.getId() + "' and password='" + account.getPassword()+"'" ;
            Query queryObject = getSession().createQuery(hql);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by Account failed", re);
            throw re;
        }
    }
}