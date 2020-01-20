package mybatis;

import mybatis.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author : z0040e3z
 * @data : 1/14/2020
 */
public class MybatisApp {

  public static void main(String[] args) {
//    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//    SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(null);
//    //创建exector，对connector的封装，定义了commit,rollback,close操作
//    // sqlsession是每次创建的
//    SqlSession sqlSession = sqlSessionFactory.openSession();
//    try {
//      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//      userMapper.insert();
//      sqlSession.commit();
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
  }
}
