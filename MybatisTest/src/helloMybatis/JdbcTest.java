package helloMybatis;

        import java.sql.*;

public class JdbcTest {
    /*
    一、如何使用JDBC链接数据库
        1.先把数据库的Connection，PreparedStatement，ResultSet属性置空
        2. 加载数据的驱动
        3. 通过驱动管理调用connection去连接数据库
        4. 然后是定义SQL语句模板
        5. 通过connection得到预编译PreparedStatement（这个是专门操作数据库的）
        6. 把SQL语句传给PreparedStatement，然后为SQL语句传入参数
        7. 调用查询或者其他，得到结果集
        8. 最后是分别释放资源，跟创建的时候相反

    二、这种传统链接数据库的缺点是什么？
        1. 频繁的连接数据库关闭数据库，对数据库造成了很大的浪费

     */
    public static void main(String[] args) throws SQLException {

        //数据库的连接
        Connection connection =null;
        //这个是预编译的PreparedStatement（操作数据库的，使用预编译可以提高数据库的性能）
        PreparedStatement preparedStatement= null;
        //返回的结果集
        ResultSet resultSet= null;

        try {
            //加载数据库的驱动
            Class.forName("com.mysql.jdbc.Driver");
            //通过驱动管理类获取数据库 的链接,后面参数需要跟上数据库的账号和密码
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fresh?useUnicode=true&characterEncoding=UTF-8","wangwei","wang5872256");
            //定义SQL语句
            String sql = "select * from user where name = ? ";
            //获取预处理的statement
            preparedStatement = connection.prepareStatement(sql);
            //为SQL设置参数
            preparedStatement.setString(1,"xiaoming");
            //使用操作数据库的preparedStatement去调用查询数据库的方法
             resultSet = preparedStatement.executeQuery();

             while (resultSet.next()){
                 System.out.println("我正在测试一个数据库的链接。。。。。"+resultSet.getString("id")+"======"+resultSet.getString("name"));
             }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (resultSet!=null){
                resultSet.close();
            }

            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        }

    }
}
