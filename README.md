# learning_strust2
Study strust2
1. Các bước để tạo một kết nối tới database sử dụng hibernate

<h5>
    - import thư viện vào file pom.xml <br>
     &nbsp;+ Thư viện hibernate core
    
        <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>5.4.7.Final</version>
        </dependency>
</h5>
    <h5> + Thư viện database mà bạn sử dụng. Ở đây chúng ta sử dụng postgresql làm database
  
         <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
            <dependency>
                <groupId>org.postgresql</groupId>
                <artifactId>postgresql</artifactId>
                <version>42.2.8</version>
            </dependency>
<h5>
    - Tạo file config có tên hibernate.cfg.xml <br>
    &nbsp; + Các thuộc tính cơ bản của config bao gồm
</h5>

* hibernate.dialect : Thuộc tính này cho tầng hibernate gennerate sql phù hợp với database đang sử dụng
* hibernate.connection.driver_class : Đường dẫn tới JDBC driver class
* hibernate.connection.username : database user name 
* hibernate.connection.password : database password
* hibernate.connection.pool_size : Giới hạn số lượng connect chờ

<h5> 
    - Tạo config mapping: Tạo SeasionFactory. <br>
     + Đăng ký một config dẫn có path dẫn tới file config  đã tạo phía trên
     
     Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
     
</h5>
    <h5> NOTE: Phải tạo hàm để close session
        
        public static void shutdown() {
                // Close caches and connection pools
                getSessionFactory().close();
        }
   </h5>


